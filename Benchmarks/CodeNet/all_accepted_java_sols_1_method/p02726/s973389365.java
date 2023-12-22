import java.util.*;
import java.math.*;
public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] dp = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i>=j)continue;
                dp[i][j] = Math.min(j-i,dp[i][j-1]+1);
                if(i > x-1&&j > x-1)dp[i][j] = Math.min(dp[i][j], dp[x-1][i]+dp[x-1][j]);
                if(i<x&&j==y-1)dp[i][j]-=y-x-1;
            }
        }
        for(int i = n-1;i >=0;i--){
            for(int j = n-2;j >= 0;j--){
                if(dp[i][j] > dp[i][j+1]+1)dp[i][j] = dp[i][j+1]+1;
            }
        }
        int[] ans = new int[n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                ans[dp[i][j]]++;
            }
        }
        for(int i = 1;i< n;i++){
            System.out.println(ans[i]);
        }

    }       
}




