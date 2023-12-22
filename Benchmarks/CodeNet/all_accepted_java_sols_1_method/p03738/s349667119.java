import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.length() > b.length()) {
            System.out.println("GREATER");
            return;
        } else if (a.length() < b.length()) {
            System.out.println("LESS");
            return;
        }

        int p = 0;
        while (p < a.length()) {
            if (a.charAt(p) > b.charAt(p)) {
                System.out.println("GREATER");
                return;
            } else if (a.charAt(p) < b.charAt(p)) {
                System.out.println("LESS");
                return;
            }
            p++;
        }
        System.out.println("EQUAL");
    }
}