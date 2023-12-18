import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            a[i] = temp;
            sum += temp;
        }
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            sum -= a[i];
            b[i] = sum;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i] * b[i] % MOD;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}