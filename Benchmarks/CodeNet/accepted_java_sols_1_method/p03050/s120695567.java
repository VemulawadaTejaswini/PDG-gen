import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long n = scanner.nextLong();
        Set<Long> divisors = new TreeSet<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }

        long ans = 0;
        for (long divisor : divisors) {
            long m = n / divisor - 1;
            if (m != 0 && n / m == n % m) {
                ans += m;
            }
        }
        System.out.println(ans);
    }
}