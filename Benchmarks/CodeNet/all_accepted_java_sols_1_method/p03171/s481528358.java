import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        long[][] dp = new long[n][n];
        for (int i=0; i<n; i++) {
            dp[i][i] = a[i];
        }

        long[] g0;
        long[] g1;
        long L;
        long R;

        for (int i=n-2; i>-1; i--) {
            g0 = dp[i];
            g1 = dp[i+1];
            for (int j=i+1; j<n; j++) {
                L = a[i] - g1[j];
                R = a[j] - g0[j - 1];
                dp[i][j] = Math.max(L, R);
            }
        }
        System.out.println(dp[0][n - 1]);
    }
}
