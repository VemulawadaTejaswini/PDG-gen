import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        boolean bre = false;
        for (int i = 0; i < a; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                bre = true;
                break;
            }
        }
        if (s.charAt(a) != '-') {
            bre = true;
        }
        for (int i = a + 1; i < a + b + 1; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                bre = true;
                break;
            }
        }
        if (bre) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
