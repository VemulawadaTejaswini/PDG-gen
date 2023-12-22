import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            boolean ok = true;
            for (int j = 0; j < n; j++) {
                if (s.charAt((i + j) % n) != t.charAt(j)) ok = false;
            }
            if (ok) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}