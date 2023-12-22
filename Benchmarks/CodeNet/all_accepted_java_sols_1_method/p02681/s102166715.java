import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        if (s.equals(t.substring(0, t.length() - 1))) {
            if (s.length() + 1 == t.length()) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

        /*
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long k = scanner.nextInt();
        if (a + b >= k) {
            System.out.println(a);
        }else {
            System.out.println(a - (k - (a + b)));
        }

         */
    }
}
