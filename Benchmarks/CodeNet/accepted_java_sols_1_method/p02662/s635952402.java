import java.util.*;

public class Main {

    static int mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        long[][] dp = new long[N+1][3100];
        dp[0][0] = 1;
        for (int i=0;i<N;i++) {
            for (int j=0;j<3100;j++) {
                dp[i+1][j] += 2*dp[i][j];
                if (j-A[i] >= 0) dp[i+1][j] += dp[i][j-A[i]];
                dp[i+1][j] %= mod;
            }
        }
        System.out.println(dp[N][S]);
    }
}