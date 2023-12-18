import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        long[] arr = new long[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(input[i]);
        long[] dp = new long[n];
        dp[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            dp[i] = dp[i+1] + arr[i];
        }
        long MOD = 1000000007;
        long ans = 0;
        for(int i=0; i<n-1; i++) {
            long add = (arr[i] % MOD * dp[i+1] % MOD) % MOD;
            ans = (ans % MOD + add % MOD) % MOD;
        }
        System.out.println(ans % MOD);
        br.close();
    }
}