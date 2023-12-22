import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC088B solver = new ABC088B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC088B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 整数の入力
            int n = Integer.parseInt(in.next());
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            Arrays.sort(a, Comparator.reverseOrder());
            int alice = 0;
            int bob = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    alice += a[i];
                } else {
                    bob += a[i];
                }
            }
            int ans = alice - bob;

            // 出力
            out.println(ans);
        }

    }
}

