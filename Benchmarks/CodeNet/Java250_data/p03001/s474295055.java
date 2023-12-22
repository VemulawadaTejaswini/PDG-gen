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
            double w = Double.parseDouble(in.next());
            double h = Double.parseDouble(in.next());
            double x = Double.parseDouble(in.next());
            double y = Double.parseDouble(in.next());
            double ans = w * h / 2.0;
            // 出力
            out.printf("%.10f", ans);
            out.print(" ");

            if (2 * x == w && 2 * y == h && w % 2 == 0 && h % 2 == 0) out.print(1);
            else out.print(0);

        }

    }
}

