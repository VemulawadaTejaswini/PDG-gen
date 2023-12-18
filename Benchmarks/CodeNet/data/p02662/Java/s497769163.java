import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = 998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        long[][] dp = new long[n+1][s+1];

        dp[0][0] = 1;

        for (int i=1; i<=n; i++) {
            for (int j=0; j<=s; j++) {
                int tmp = arr[i-1];
                dp[i][j] += dp[i-1][j] * 2;
                dp[i][j] %= MOD;
//                if (j+tmp<=s) dp[i][j+tmp] += dp[i-1][j];
                if (tmp<=j) dp[i][j] += dp[i-1][j-tmp];
                dp[i][j] %= MOD;
            }
        }

        for (int i=0; i<=n; i++) {
            for (int j=0; j<s; j++) {
//                System.out.print(dp[i][j]+" ");
            }
//            System.out.println(dp[i][s]);
        }

        System.out.println(dp[n][s]);

    }
}
