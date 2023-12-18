import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    private long fac[];
    private long finv[];
    private long inv[];
    private static int MAX_LEN = 1000001;
    private static int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.COMinit();
        main.solve();
    }

    private long pow(int base, int count, long MOD) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            long t = ((long) base) * pow(base, count - 1, MOD);
            t %= MOD;
            return t;
        }
        long t = pow(base, count / 2, MOD);
        t %= MOD;
        t *= t;
        t %= MOD;
        return t;
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int K = scan.nextInt();
        String S = scan.next();
        int N = S.length();
        long ans = 0;
        if (N == 1) {
            for (int i = 0; i <= K; i++) {
                long t1 = pow(25, i, MOD);
                t1 %= MOD;
                long t2 = pow(26, K - i, MOD);
                t2 %= MOD;
                long t = t1 * t2;
                t %= MOD;
                ans += t;
                ans %= MOD;
            }
            System.out.println(ans);
            return;
        }
        for (int i = 0; i <= K; i++) {
            long t1 = COM(i + N - 1, i);
            t1 %= MOD;
            long t2 = pow(25, i, MOD);
            t2 %= MOD;
            long t3 = pow(26, K - i, MOD);
            long t = t1 * t2;
            t %= MOD;
            t *= t3;
            t %= MOD;
            ans += t;
            ans %= MOD;
        }
        System.out.println(ans);
    }
    void COMinit() {
        this.fac = new long[MAX_LEN];
        this.finv = new long[MAX_LEN];
        this.inv = new long[MAX_LEN];
        this.fac[0] = this.fac[1] = 1;
        this.finv[0] = this.finv[1] = 1;
        this.inv[1] = 1;
        for (int i = 2; i < MAX_LEN; i++) {
            fac[i] = fac[i-1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
    }
    long COM(int n, int k) {
        if (n < k) {
            return 0;
        };
        if (n <0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k]%MOD)%MOD;
    }
}
