import java.util.*;
 
public class Main{
 
    void solve(){
        Scanner sc = new Scanner(System.in);
 
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
 
            int[] h = new int[200];
            int[] r = new int[200];
 
            int idx = 0;
            for(; idx<n; idx++){
                h[idx] = sc.nextInt();
                r[idx] = sc.nextInt();
            }
            int m = sc.nextInt();
            for(; idx<n+m; idx++){
                h[idx] = sc.nextInt();
                r[idx] = sc.nextInt();
            }
 
            int[] dp = new int[n+m];
            Arrays.fill(dp,1);
            for(int k=0; k<n+m; k++){
                for(int i=0; i<n+m; i++){
                    for(int j=0; j<n+m; j++){
                        if(h[i]<=h[j] || r[i]<=r[j]) continue;
                        dp[i] = Math.max(dp[i],dp[j]+1);
                    }
                }
            }
 
            int ans = 0;
            for(int i=0; i<n+m; i++) ans = Math.max(ans, dp[i]);
 
            System.out.println(ans);
        }
    }
 
    public static void main(String[] args){
        new Main().solve();
    }
}