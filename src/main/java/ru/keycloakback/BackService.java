package ru.keycloakback;

import org.keycloak.KeycloakSecurityContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BackService {

    @RequestMapping("/user")
    public String userData(HttpServletRequest request){
        request.getAttribute(KeycloakSecurityContext.class.getName());
        return "hello";
    }
}
