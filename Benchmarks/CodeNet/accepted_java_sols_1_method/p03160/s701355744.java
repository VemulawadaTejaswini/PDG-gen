import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] hl = new long[n];
        for(int i = 0; i < n; i++){
            hl[i] = sc.nextLong();
        }
        long[] dp = new long[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < n; i++){
            for(int k = i+1; k < n && k <= i+2; k++){
                dp[k] = Math.min(dp[k], dp[i] + Math.abs(hl[k] - hl[i]));
            }
        }
        System.out.println(dp[n-1]);
    }
}