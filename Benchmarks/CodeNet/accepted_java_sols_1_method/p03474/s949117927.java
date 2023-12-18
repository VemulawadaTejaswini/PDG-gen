import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        if (s.length() != a + b + 1) {
            System.out.println("No");
            System.exit(0);
        }
        for (int i = 0 ; i <= a + b ; i++) {
            if (i == a) {
                if (s.charAt(i) != '-') {
                    System.out.println("No");
                    System.exit(0);
                }
            } else {
                if (!Character.isDigit(s.charAt(i))) {
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
}