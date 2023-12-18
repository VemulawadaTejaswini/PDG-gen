import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    int mod = 998244353;

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < k; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            for (int j = a; j <= b; ++j) {
                s.add(j);
            }
        }

        Integer[] t = new Integer[s.size()];

        s.toArray(t);

        out.println(countWays(n - 1, t));
    }

    long countWays(int n, Integer t[]) {
        int l = t.length;
        long c[] = new long[n + 1];
        c[0] = 1;

        if (n == 0)
            return 1;

        long cpt = 0;
        for (int i = 1; i <= n; ++i) {
            cpt = 0;

            for (int j = 0; j < l; ++j) {
                if (i - t[j] >= 0) {
                    cpt += c[i - t[j]];
                }
                c[i] = cpt % mod;
            }
        }

        return c[n];
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
