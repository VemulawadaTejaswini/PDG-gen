import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);
        int INF = Integer.MAX_VALUE/2;

        int n = sc.nextInt();
        int[] time = new int[n-1];
        for(int i=0; i<n-1; i++) time[i] = sc.nextInt();

        int[][][] dp = new int[2][n/2+1][2];
        for(int i=0; i<2; i++)
            for(int j=0; j<=n/2; j++) Arrays.fill(dp[i][j], INF);
        dp[0][0][1] = 0; dp[0][1][0] = 0;

        int idx = 1;
        for(int i=1; i<n; i++){
            for(int j=0; j<=n/2; j++){
                int n1 = INF, n2 = INF;
                if(j!=0){
                    n1 = Math.min(dp[1-idx][j-1][0], dp[1-idx][j-1][1] + time[i-1]);
                }
                n2 = Math.min(dp[1-idx][j][0] + time[i-1], dp[1-idx][j][1]);
                if(j!=0) dp[idx][j][0] = Math.min(dp[idx][j][0], n1);
                dp[idx][j][1] = Math.min(dp[idx][j][1], n2);
            }
            idx = 1-idx;
            for(int j=0; j<=n/2; j++) Arrays.fill(dp[idx][j], INF);
        }

        System.out.println(Math.min(dp[1-idx][n/2][0], dp[1-idx][n/2][1]));
    }

    public static void main(String[] args){
        new Main().solve();
    }
}