import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int[] wa = new int[n];
        int[] va = new int[n];
        for(int i=0; i<n; i++){
            wa[i] = Integer.parseInt(sc.next());
            va[i] = Integer.parseInt(sc.next());
        }
        
        long[] dp = new long[(int)1e5+1];
        Arrays.fill(dp, (long)1e18);
        dp[0] = 0;
        for(int i=0; i<n; i++){
            for(int j=dp.length-1; j>=0; j--){
                if(va[i]+j<dp.length && dp[j+va[i]] > dp[j]+wa[i]){
                    dp[j+va[i]] = dp[j]+wa[i];
                }
            }
        }
        
        long ans = 0;
        for(int i=0; i<dp.length; i++){
            if(dp[i]<=w){
                ans = i;
            }
        }
        
        System.out.println(ans);
    }
}
