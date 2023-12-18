import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        int n = 0;
        int k = 0;
        long MOD = 1000*1000*1000 + 7;
        int[] arr = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            arr = new int[n];
            for(int i = 0; i < n ;i++) {
                arr[i] = scanner.nextInt();
            }
        }
        
        long[] dp = new long[k + 1];
        dp[0] = 1;
        // This will cause TLE as we are running n * k^2
        // for(int i = 0; i < n; i++) {
        //     int cap = arr[i];
        //     for(int used = k; used >=0 ; used--) {
        //         for(int candy = 1; candy <= Math.min(cap, k - used); candy++) {
        //             dp[candy + used] = (dp[candy + used] + dp[used])%MOD; 
        //         }
        //     }   
        // }
        
        // We can remove last loop of K by having one more array to have range updated
        // and dp in seperate loop not nested
        for(int i = 0; i < n; i++) {
            int cap = arr[i];
            long[] rangeUpdate = new long[k + 1];
            for(int used = k; used >=0 ; used--) {
                int rangeStart = used + 1;
                int rangeEnd = used + Math.min(cap, k - used);
                if(rangeStart <= rangeEnd){
                    rangeUpdate[rangeStart] += dp[used];
                    if(rangeEnd + 1 <= k)
                        rangeUpdate[rangeEnd + 1] -= dp[used];
                        
                }
            }
            
            long prefixSum = 0;
            for(int j = 0; j <= k; j++) {
                prefixSum += rangeUpdate[j];
                dp[j] = (dp[j] + prefixSum)%MOD;
            }
        }
        // System.out.println(Arrays.toString(dp));
        System.out.println(dp[k]);
        
    }
    
}