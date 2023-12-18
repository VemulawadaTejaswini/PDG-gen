
import java.util.Scanner;

public class Main {

    static int mod = 1_000_000_000 + 7;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        long[] a = new long[n + 1];
        long[] s = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            int b = Integer.parseInt(scan.next());
            a[i] = b;
            s[i] = b;
        }
        scan.close();

        for (int i = 1; i <= n; i++) {
            s[i] += s[i - 1];
            s[i] %= mod;
        }

        long ans = 0;
        for (int i = 1; i < n; i++) {
            long cumsum = s[n] - s[i];
            if (cumsum < 0) {
                cumsum += mod;
            }
            long add = cumsum * a[i];
            add %= mod;
            ans += add;
            ans %= mod;
        }

        System.out.println(ans);
    }
}
