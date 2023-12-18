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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            char[] c = in.next().toCharArray();
            int ans = 0;
            int cnt_r = 0;
            for (int i = 0; i < n; i++) {
                if (c[i] == 'R') cnt_r++;
            }
            for (int i = 0; i < cnt_r; i++) {
                if (c[i] == 'W') ans++;
            }

            // 出力
            out.println(ans);

        }

    }
}

