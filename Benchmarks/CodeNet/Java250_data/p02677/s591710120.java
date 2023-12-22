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
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int h = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());

            double rect_l = m * 360.0 / 60.0; //長針
            double rect_s = (h * 60.0 + m) * 360.0 / (12.0 * 60.0); //短針
            double diff = rect_s - rect_l;
            if (diff > 180) diff = 360 - diff;
            double ans = Math.sqrt((a * a) + (b * b) - 2 * a * b * Math.cos(diff * (Math.PI / 180.0)));
            // 出力
            out.printf("%.13f\n", ans);

        }

    }
}

