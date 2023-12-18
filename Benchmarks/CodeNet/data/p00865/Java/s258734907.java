import java.util.*;

class Main{

    int n,m,k;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            if(n==0 && m==0 && k==0) break;

            int[][] dp = new int[n][n*m+1];

            for(int i=1; i<=m; i++){
                dp[0][i] = 1;
            }

            for(int i=1; i<n; i++){
                for(int j=1; j<=n*m; j++){
                    for(int l=1; l<=m; l++){
                        dp[i][j] += dp[i-1][Math.max(j-l,0)];
                    }
                }
            }

            double ans = 0.0;
            for(int i=0; i<=n*m; i++){
                ans += (double)dp[n-1][i]/Math.pow(m,n)*Math.max(i-k,1);
            }

            System.out.println(ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}