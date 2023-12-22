import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int x = Integer.parseInt(in.next());
            int tmp = 0;
            int lcnt = 0;
            int rcnt = 0;
            for (int i = 0; i < m; i++) {
                tmp = Integer.parseInt(in.next());
                if (tmp < x) {
                    lcnt++;
                } else {
                    rcnt++;
                }
            }
            int ans = Math.min(lcnt, rcnt);

            // 出力
            out.println(ans);

        }

    }
}

