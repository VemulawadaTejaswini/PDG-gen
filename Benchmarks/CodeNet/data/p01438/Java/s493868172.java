import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int[][] dp = new int[2][1<<17];

            int idx = 0;
            for(int i=0; i<n; i++){
                int m = sc.nextInt();
                int L = sc.nextInt();
                for(int j=0; j<m; j++){
                    int s = sc.nextInt()-6;
                    int e = sc.nextInt()-6;
                    int[] bit = new int[4];
                    for(int k=s; k<=e; k++){
                        bit[0] ^= (1<<k);
                        if(k!=s) bit[1] ^= (1<<k);
                        if(k!=e) bit[2] ^= (1<<k);
                        if(k!=s && k!=e) bit[3] ^= (1<<k);
                    }
                    for(int k=0; k<(1<<17); k++){
                        for(int l=0; l<4; l++){
                            if((k&bit[l])==bit[l]){
                                //dp[idx][k] = Math.max(dp[idx][k], dp[1-idx][k|bit]);
                                dp[idx][k] = Math.max(dp[idx][k], L + dp[1-idx][k^bit[l]]);
                            }
                        }
                    }
                }
                idx = 1-idx;
                Arrays.fill(dp[idx], 0);
            }

            idx = 1-idx;
            int max = 0;
            for(int i=0; i<(1<<17); i++){
                max = Math.max(max, dp[idx][i]);
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}