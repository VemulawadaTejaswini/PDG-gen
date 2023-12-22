import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int w[] = new int[n+1];
        int v[] = new int[n+1];
        for(int i = 1 ; i < w.length ; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long dp[][] = new long[n+1][W+1];
        for(int i = 1 ; i <= n ; i++){
            for(int j = 0 ; j <= W ; j++){
                if(j>=w[i])
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w[i]] + v[i]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[n][W]);
    }
}