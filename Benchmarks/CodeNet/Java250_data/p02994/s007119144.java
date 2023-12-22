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
            int l = Integer.parseInt(in.next());

            int r = l + n - 1;

            int ans = 0;

            if (r <= 0) ans = r;
            else if (l >= 0) ans = l;
            else ans = 0;

            ans = (r + l) * (r - l + 1) / 2 - ans;
            // 出力
            out.println(ans);

        }

    }
}

