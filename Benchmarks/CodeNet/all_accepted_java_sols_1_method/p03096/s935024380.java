import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            if(max < c[i]) max = c[i];
        }
        long mod = 1_000_000_007L;
        long[] cnt = new long[max+1];
        long[] sum = new long[n];
        long[] presum = new long[max+1];
        long ans = 0L;
        cnt[c[0]]++;
        for (int i = 1; i < n; i++) {
            if(c[i] == c[i-1]){
                sum[i] = sum[i-1];
                continue;
            }
            ans = (ans + cnt[c[i]]) % mod;
            ans = (ans + presum[c[i]]) % mod;
            cnt[c[i]]++;
            sum[i] = ans;
            presum[c[i]] = (presum[c[i]] + sum[i-1]) % mod;
        }
        System.out.println(ans+1);
        sc.close();

    }

}
