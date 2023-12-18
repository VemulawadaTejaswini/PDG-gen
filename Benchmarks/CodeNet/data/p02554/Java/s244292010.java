
import java.util.Scanner;

public class Main {

    static int mod = 1_000_000_007;

    public static long modPow(long a, long b) {
        if (b == 0) {
            return 1;
        }

        if (b % 2 == 0) {
            return modPow(a * a % mod, b / 2);
        } else {
            return modPow(a * a % mod, (b - 1) / 2) * a % mod;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        long ans = modPow(10, n);
        ans -= modPow(9, n);
        if (ans < 0) {
            ans += mod;
        }
        ans -= modPow(9, n);
        if (ans < 0) {
            ans += mod;
        }
        ans += modPow(8, n);
        ans %= mod;

        System.out.println(ans);
    }
}
