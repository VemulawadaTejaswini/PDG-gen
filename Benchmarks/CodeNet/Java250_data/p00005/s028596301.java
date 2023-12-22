import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.printf("%d %d\n", gcd(m, n), lcm(m, n));
        }

    }
    public static int gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }

    public static int lcm(int m, int n) {
        return m / gcd(m, n) * n;
    }
}
