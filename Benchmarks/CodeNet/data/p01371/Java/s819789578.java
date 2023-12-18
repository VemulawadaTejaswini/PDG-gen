import java.util.*;

class Main{

    int n;
    int[][] t;
    int[] hand;
    int INF = Integer.MAX_VALUE;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            if(n==0) break;

            hand = new int[n];
            t = new int[n][n];
            for(int i=0; i<n; i++){
                hand[i] = sc.nextInt();
                for(int j=0; j<n; j++) t[i][j] = sc.nextInt();
            }

            int[] dp = new int[1<<n];
            Arrays.fill(dp, INF);
            dp[0] = 0;

            for(int mask=0; mask<(1<<n); mask++){
                for(int j=0; j<n; j++){
                    if((mask & (1<<j))==0){
                        int min = hand[j];
                        for(int k=0; k<n; k++){
                            if((mask & (1<<k))>0){
                                min = Math.min(min, t[j][k]);
                            }
                        }
                        dp[mask^(1<<j)] = Math.min(dp[mask^(1<<j)], dp[mask] + min);
                    }
                }
            }
            System.out.println(dp[(1<<n)-1]);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}