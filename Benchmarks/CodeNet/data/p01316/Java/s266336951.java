import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        long INF = Long.MAX_VALUE;

        while(true){
            int n = sc.nextInt(), m = sc.nextInt();
            if(n==0 && m==0) break;

            int[] c = new int[m];
            for(int i=0; i<m; i++) c[i] = sc.nextInt();

            int[] x = new int[n];
            for(int i=0; i<n; i++) x[i] = sc.nextInt();

            long[][] dp = new long[n+1][256];
            for(int i=0; i<=n; i++) Arrays.fill(dp[i], INF);
            dp[0][128] = 0;

            for(int i=1; i<=n; i++){
                for(int j=0; j<=255; j++){
                    if(dp[i-1][j]==INF) continue;
                    for(int k=0; k<m; k++){
                        int idx = j+c[k];
                        if(idx<0) idx = 0;
                        if(idx>255) idx = 255;
                        dp[i][idx] = Math.min(dp[i][idx], dp[i-1][j] + (long)Math.pow((x[i-1]-idx), 2));
                    }
                }
            }

            long min = INF;
            for(int i=0; i<=255; i++) min = Math.min(min, dp[n][i]);
            System.out.println(min);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}