import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        long[] ruiseki = new long[n];
        a[0] = scanner.nextLong();
        ruiseki[0] = a[0];
        long mod = 1000000007;
        for (int i = 1; i < n; i++) {
            a[i] = scanner.nextLong();
            ruiseki[i] = ruiseki[i - 1] + a[i];
        }
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            long other = (ruiseki[n - 1] - ruiseki[i]) % mod;
            long v = other * a[i] % mod;
            ans += v;
            ans %= mod;
        }

        System.out.println(ans);
    }
}