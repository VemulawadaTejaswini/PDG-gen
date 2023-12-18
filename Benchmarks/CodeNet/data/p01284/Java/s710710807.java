import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE;

        while(true){
            int T = sc.nextInt();
            if(T==0) break;
            int[] t = new int[T];
            for(int i=0; i<T; i++) t[i] = sc.nextInt();

            int n = sc.nextInt();
            int[] time = new int[101];
            int max = 0;
            for(int i=0; i<n; i++){
                int d = sc.nextInt(), m = sc.nextInt();
                max = Math.max(max, d);
                time[d] = m;
            }

            int[][] dp = new int[max+1][T];
            for(int i=1; i<=max; i++) Arrays.fill(dp[i], INF);
            dp[1][0] = 0;

            for(int i=1; i<=max; i++){
                for(int j=0; j<T; j++){
                    if(j-1<0 || dp[i-1][j-1]==INF) continue;
                    if(time[i]>=t[j]){
                        dp[i][j] = dp[i-1][j-1];
                    }
                    dp[i][0] = Math.min(dp[i][0], dp[i-1][j-1] + 1);
                }
            }

            //for(int i=0; i<=max; i++) System.out.println(Arrays.toString(dp[i]));

            int min = Integer.MAX_VALUE;
            for(int i=0; i<T; i++){
                min = Math.min(min, dp[max][i]);
            }
            System.out.println(min);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}