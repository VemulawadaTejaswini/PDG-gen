import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int[] w = new int[N];
        int[] v = new int[N];
        long[][] dp = new long[N+1][200001];
        long INF = 1_000_000_000_000_000_000L;
        for (int i=0;i<N+1;i++) {
            for (int j=0;j<200001;j++) {
                dp[i][j] = INF;
            }
        }
        for (int i=0;i<N+1;i++) {
            dp[i][0] = 0;
        }
        for (int i=0;i<N;i++) {
            w[i] = Integer.parseInt(sc.next());
            v[i] = Integer.parseInt(sc.next());
            for (int j=0;j<200000;j++) {
                // dp[i][j+1] = dp[i][j];
                if (j+1-v[i]>=0 && dp[i][j+1-v[i]]!=INF) {
                    dp[i+1][j+1] = Math.min(dp[i][j+1], dp[i][j+1-v[i]]+w[i]);
                } else {
                    dp[i+1][j+1] = dp[i][j+1];
                }
            }
        }
        int ans = 0;
        for (int i=0;i<200001;i++) {
            if (dp[N][i]<=W) ans = Math.max(ans, i);
        }
        System.out.println(ans);
    }
}