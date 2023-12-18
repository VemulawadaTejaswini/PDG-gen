
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int R = sc.nextInt();
        final int C = sc.nextInt();
        final int K = sc.nextInt();
        
        final int[][] Vs = new int[R][C];
        for (int k = 0; k < K; k++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            int v = sc.nextInt();
            Vs[r][c] = v;
        }
        
        final long[][][] dp = new long[R][C][4];
        final int[][][][] trio = new int[R][C][4][];
        
        // 原点
        {
            int v = Vs[0][0];
            if (0 < v) {
                dp[0][0][1] = v;
                trio[0][0][1] = new int[] { v };
            }
        }
        
        // 左端
        for (int i = 1; i < R; i++) {
            dp[i][0][0] = Long.max(dp[i - 1][0][0], dp[i - 1][0][1]);
            
            int v = Vs[i][0];
            if (0 < v) {
                dp[i][0][1] = dp[i][0][0] + v;
            }
        }
        
        // 上端
        for (int j = 1; j < C; j++) {
            dp[0][j][0] = dp[0][j - 1][0];
            
            int v = Vs[0][j];
            if (0 < v) {
                dp[0][j][1] = Long.max(dp[0][j - 1][1], dp[0][j - 1][0] + v);
                dp[0][j][2] = Long.max(dp[0][j - 1][2], dp[0][j - 1][1] + v);
                dp[0][j][3] = Long.max(dp[0][j - 1][3], dp[0][j - 1][2] + v);
            } else {
                dp[0][j][1] = dp[0][j - 1][1];
                dp[0][j][2] = dp[0][j - 1][2];
                dp[0][j][3] = dp[0][j - 1][3];
            }
        }
        
        // メイン部分
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                dp[i][j][0] = Long.max(dp[i][j - 1][0], max4(dp[i - 1][j]));
                
                int v = Vs[i][j];
                if (0 < v) {
                    dp[i][j][1] = max3(dp[i][j - 1][1], dp[i][j - 1][0] + v, max4(dp[i - 1][j]) + v);
                    dp[i][j][2] = Long.max(dp[i][j - 1][2], dp[i][j - 1][1] + v);
                    dp[i][j][3] = Long.max(dp[i][j - 1][3], dp[i][j - 1][2] + v);
                    
                } else {
                    dp[i][j][1] = dp[i][j - 1][1];
                    dp[i][j][2] = dp[i][j - 1][2];
                    dp[i][j][3] = dp[i][j - 1][3];
                }
            }
        }
        
        System.out.println(max4(dp[R - 1][C - 1]));
    }
    
    private static long max3(long val1, long val2, long val3) {
        return Long.max(Long.max(val1, val2), val3);
    }
    
    private static long max4(long[] vals) {
        return Long.max(Long.max(vals[0], vals[1]), Long.max(vals[2], vals[3]));
    }
}
