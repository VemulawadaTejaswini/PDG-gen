import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = scan.nextLong();
        long mod = 1000000007L;
        long ans = 0;
        long sum = a[0];
        for (int i = 1; i < n; i++) {
            ans = (ans + sum * a[i]) % mod;
            sum = (sum + a[i]) % mod;
        }
        System.out.println(ans);
    }
}
