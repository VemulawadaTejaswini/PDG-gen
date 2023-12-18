import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String result = "";
        if ("AT".contains(s)) {
            result = "AT".replace(s, "");
        } else if ("CG".contains(s)) {
            result = "CG".replace(s, "");
        } 
        
        System.out.println(result);
    }
}
