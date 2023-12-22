import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        //dp objective: minimum weight such that accomplish v-value or larger value.
        int maxValue = 1000*N;
        long[][] dp = new long[N+1][maxValue+1];
        for(int i = 0; i < N+1; i++) {
            for (int j = 1; j < maxValue + 1; j++) {
                dp[i][j] = 1_000_000_007;                
            }
        }
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < maxValue + 1; j++) {
                //case 1: Do not use item i-1
                dp[i][j] = dp[i-1][j];
                //case 2: Use item i-1
                int diff = Math.max(j - v[i-1],0);
                dp[i][j] = Math.min(dp[i][j], dp[i-1][diff] + w[i-1]);
            }
        }
        //Bin search on maximum v such that dp[N][v] <= W.
        //constraint => dp[N][1] <= W
        long ans;
        if (dp[N][maxValue] <= W) {
            ans = maxValue;
        } else {
            int ng = maxValue;
            int ok = 0;
            while(Math.abs(ng-ok) > 1) {
                int mid = (ok+ng)/2;
                if(dp[N][mid] <= W){
                    ok = mid;
                } else {
                    ng = mid;
                }
            }
            ans = ok;
        }
        System.out.println(ans);
    }
}