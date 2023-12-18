import java.util.*;

public class Main {

    static int mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0L;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            a[i] = x;
            sum += x;
            sum %= mod;
        }
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            sum = (sum - a[i] + mod)%mod;
            ans = (ans + sum * a[i]) %mod;
        }
        System.out.println(ans);
        sc.close();

    }

}
