import java.util.*;

/**
 * GettingStarted
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        if (a >= b) {
            System.out.println(gcd(a, b));
        } else {
            System.out.println(gcd(b, a));
        }
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
