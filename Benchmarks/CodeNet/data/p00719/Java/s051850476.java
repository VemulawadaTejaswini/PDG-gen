import java.util.*;
import java.math.BigDecimal;

public class Main{

    int n,m,p,a,b;
    int[] t;
    int[][] time;
    int INF = 100000;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            p = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            if(n==0 && m==0 && p==0 && a==0 && b==0) break;

            a--; b--;

            t = new int[n];
            for(int i=0; i<n; i++) t[i] = sc.nextInt();

            time = new int[m][m];
            for(int i=0; i<m; i++) Arrays.fill(time[i],INF);
            for(int i=0; i<p; i++){
                int x = sc.nextInt()-1;
                int y = sc.nextInt()-1;
                int z = sc.nextInt();
                time[x][y] = z;
                time[y][x] = z;
            }

            double[][] dp = new double[1<<n][m];
            for(int i=0; i<1<<n; i++) Arrays.fill(dp[i],INF);

            dp[0][a] = 0;
            for(int i=0; i<m; i++){
                for(int bit=0; bit<1<<n; bit++){
                    if(dp[bit][i]==INF) continue;
                    for(int j=0; j<m; j++){
                        if(time[i][j]==INF) continue;
                        for(int k=0; k<n; k++){
                            if((bit&1<<k)>0) continue;
                            int newbit = bit^(1<<k);
                            dp[newbit][j] = Math.min(dp[newbit][j],dp[bit][i]+(double)time[i][j]/t[k]);
                        }
                    }
                }
            }

            double ans = INF;
            for(int i=0; i<1<<n; i++) ans = Math.min(ans, dp[i][b]);
            BigDecimal bi = new BigDecimal(String.valueOf(ans));
            ans = bi.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();

            if(ans==INF) System.out.println("Impossible");
            else System.out.printf("%.3f\n",ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}