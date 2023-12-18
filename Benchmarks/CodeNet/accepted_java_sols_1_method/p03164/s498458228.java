import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long W = Long.parseLong(sc.next());
        long dp[][] = new long[N+1][100001];
        int ans = 0;
        for(int i=1;i<=N;i++){
          long w = Long.parseLong(sc.next());
          int v = Integer.parseInt(sc.next());
          for(int j=1;j<=100000;j++){
            if(j==v){
              if(dp[i-1][j] > 0) dp[i][j] = Math.min(w, dp[i-1][j]);
              else dp[i][j] = w;
            }else if(j>v && dp[i-1][j-v] > 0){
              if(dp[i-1][j] > 0) dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-v]+w);
              else dp[i][j] = dp[i-1][j-v]+w;
            }else if(dp[i-1][j] > 0){
              dp[i][j] = dp[i-1][j];
            }
            if(dp[i][j] > 0 && dp[i][j] <= W) 
              ans = Math.max(j,ans);
          }
        }
        System.out.println(ans);
    }
}