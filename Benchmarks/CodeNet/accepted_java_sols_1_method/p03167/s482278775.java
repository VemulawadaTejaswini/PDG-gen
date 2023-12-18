import java.util.*;
import java.io.*;
class Main {
    static long MOD = (long)(1e9+7);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i = 0; i<n; i++) {
            String s = sc.next();
            for(int j = 0; j<m; j++) {
                if(s.charAt(j)=='#')
                    grid[i][j] = -1;
                else grid[i][j] = 1;
            }
        }
        long[][] dp = new long[n][m];
        dp[0][0] = grid[0][0];
        for(int i = 1; i<m; i++)
            if(grid[0][i]!=-1)
                dp[0][i]+=dp[0][i-1];
        for(int i = 1; i<n; i++) 
            if(grid[i][0]!=-1)
                dp[i][0]+=dp[i-1][0];
        for(int i = 1; i<n; i++) {
            for(int j = 1; j<m; j++) {
                if(grid[i][j]!=-1)
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1])%MOD;
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}