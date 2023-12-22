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
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int c = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());
            int ans = 0;

            int mx = 0;
            int cnt = 0;
            mx = Math.max(a, Math.max(b, c));
            if (mx == a) {
                cnt = 1;
            } else if (mx == c) {
                mx = c;
                cnt = 3;
            } else {
                mx = b;
                cnt = 2;
            }
            for (int i = 0; i < k; i++) {
                mx *= 2;
            }

            if (cnt == 1) {
                ans = mx + b + c;
            } else if (cnt == 2) {
                ans = a + mx + c;
            } else {
                ans = a + b + mx;
            }
            // 出力
            out.println(ans);

        }

    }
}

