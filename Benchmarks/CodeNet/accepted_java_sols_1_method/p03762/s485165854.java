import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] xArr = new int[n - 1];
        long xTotal = 0;
        long xprev = sc.nextInt();
        for (long i = 1; i < n; i++) {
            long a = sc.nextInt();
            xTotal += i * (n - i) * (a - xprev) % MOD;
            xTotal %= MOD;
            xprev = a;
        }
        long yTotal = 0;
        long yprev = sc.nextInt();
        for (long i = 1; i < m; i++) {
            long a = sc.nextInt();
            yTotal += i * (m - i) * (a - yprev) % MOD;
            yTotal %= MOD;
            yprev = a;
        }
        System.out.println(xTotal * yTotal % MOD);
    }
}