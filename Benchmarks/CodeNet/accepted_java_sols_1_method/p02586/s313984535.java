import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        long[][] g = new long[R][C];
        for (int i = 0; i < K; i++) {
            int r = sc.nextInt()-1;
            int c = sc.nextInt()-1;
            long v = sc.nextLong();
            g[r][c] = v;
        }
        long[][][] dp = new long[R][C][4];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(0 < i){
                    long max = Math.max(dp[i-1][j][0], Math.max(dp[i-1][j][1], Math.max(dp[i-1][j][2], dp[i-1][j][3])));
                    dp[i][j][0] = max;
                }
                dp[i][j][1] = dp[i][j][0] + g[i][j];
                if(0 < j){
                    dp[i][j][0] = Math.max(dp[i][j-1][0], dp[i][j][0]);
                    dp[i][j][1] = Math.max(dp[i][j][1], Math.max(dp[i][j-1][1], dp[i][j-1][0] + g[i][j]));
                    dp[i][j][2] = Math.max(dp[i][j-1][2], dp[i][j-1][1] + g[i][j]);
                    dp[i][j][3] = Math.max(dp[i][j-1][3], dp[i][j-1][2] + g[i][j]);
                }
            }
        }
        System.out.println(Math.max(dp[R-1][C-1][0], Math.max(dp[R-1][C-1][1], Math.max(dp[R-1][C-1][2], dp[R-1][C-1][3]))));
        sc.close();

    }

}
