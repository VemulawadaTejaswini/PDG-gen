import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        if (N.charAt(N.length()-1) == 's') {
            System.out.println(N + "es");
        } else {
            System.out.println(N + "s");
        }
    }
}