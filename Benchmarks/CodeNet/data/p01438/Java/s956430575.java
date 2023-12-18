import java.util.*;
 
class Main{
 
    void solve(){
        Scanner sc = new Scanner(System.in);
 
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
 
            long[][] dp = new long[2][1<<17];
 
            int idx = 0;
            long max = 0;
            for(int i=0; i<n; i++){
                int m = sc.nextInt();
                int L = sc.nextInt();
                int bit = 0;
                for(int j=0; j<m; j++){
                    int s = sc.nextInt()-6;
                    int e = sc.nextInt()-6;
                    for(int k=s+1; k<=e; k++){
                        bit ^= (1<<k);
                    }
                }
                for(int j=0; j<(1<<17); j++){
                    dp[idx][j] = Math.max(dp[idx][j], dp[1-idx][j]);
                    if((j&bit)==bit){
                        dp[idx][j] = Math.max(dp[idx][j], L + dp[1-idx][j^bit]);
                        max = Math.max(max, dp[idx][j]);
                    }
                }
                
                idx = 1-idx;
                Arrays.fill(dp[idx], 0);
            }
 
            System.out.println(max);
        }
    }
 
    public static void main(String[] args){
        new Main().solve();
    }
}