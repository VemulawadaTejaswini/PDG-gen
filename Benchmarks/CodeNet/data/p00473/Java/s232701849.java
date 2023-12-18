import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE/10;
        int n = sc.nextInt();
        int[] cost = new int[n-1];
        for(int i=0; i<n-1; i++) cost[i] = sc.nextInt();

        int[][][] dp = new int[2][n/2+1][2];
        for(int i=0; i<2; i++)
            for(int j=0; j<dp[i].length; j++) Arrays.fill(dp[i][j], INF);

        int idx = 0;
        for(int i=1; i<n; i++){
            for(int j=1; j<=i && j<=n/2; j++){
                if(j==1){
                    dp[idx][j][0] = cost[i-1];
                    continue;
                }
                dp[idx][j][0] = Math.min(dp[1-idx][j-1][0], dp[1-idx][j-1][1] + cost[i-1]);
                dp[idx][j][1] = Math.min(dp[1-idx][j][1], dp[1-idx][j][0] + cost[i-1]);
            }
            idx = 1-idx;
        }

        System.out.println(dp[1-idx][n/2][1]);

    }

    public static void main(String[] args){
        new Main().solve();
    }
}