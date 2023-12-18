import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        long[] arr = new long[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(input[i]);
        long sum = 0;
        for(int i=n-1; i>=0; i--) {
            sum += arr[i];
        }
        long MOD = 1000000007;
        long ans = 0;
        for(int i=0; i<n; i++) {
            sum -= arr[i];
            if(sum < 0)
                sum += MOD;
            long add = arr[i] * sum;
            ans = (ans % MOD + add % MOD) % MOD;
        }
        System.out.println(ans % MOD);
        br.close();
    }
}