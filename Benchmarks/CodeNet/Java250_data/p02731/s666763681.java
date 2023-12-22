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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int L = Integer.parseInt(in.next());
            double o = 0.000000;
            double w = 0.000000;
            double h = 0.000000;

            o = (double) L / 3.000000;
            w = (double) L / 3.000000;
            h = L - o - w;
            double ans = o * w * h;

            // 出力
            out.printf("%.12f%n", ans);

        }

    }
}

