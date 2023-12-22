import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cnt[] = new long[60];
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            for(int j = 0; j < 60; j++){
                cnt[j] += (x >> j & 1);
            }
        }
        long mod = 1000000007;
        long ans = 0;
        for(int i = 0; i < 60; i++){
            long t = (1L << i) % mod;
            ans += cnt[i] * (n - cnt[i]) % mod * t % mod;
            ans %= mod;
        }
        System.out.println(ans);
    }
}
