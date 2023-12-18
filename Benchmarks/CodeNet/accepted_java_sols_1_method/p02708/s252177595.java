
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = in.nextInt();
        long mn = 0;
        long mx = 0;
        for (int i = 0; i < k; ++i) {
            mn += i;
            mx += n - i;
        }
        long mod = 1_000_000_007;
        long ans = 0;
        for (int i = k; i <= n + 1; i++) {
            ans += mx - mn + 1;
            ans %= mod;
            mn += i;
            mx += n - i;
        }
        out.println(ans);
        out.close();
    }
}