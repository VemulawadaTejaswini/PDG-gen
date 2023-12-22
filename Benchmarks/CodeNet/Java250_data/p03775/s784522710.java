import java.util.*;
import java.util.concurrent.atomic.LongAccumulator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = Long.MAX_VALUE;
        long f, b;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                b = n / i;
                f = Math.max(clac_digit(i), clac_digit(b));
                ans = Math.min(ans, f);
            }
        }
        System.out.println(ans);
    }

    public static long clac_digit(long n) {
        long res = 0;
        while (n > 0) {
            res++;
            n /= 10;
        }
        return res;
    }
}