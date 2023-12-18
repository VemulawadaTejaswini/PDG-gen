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
            long a = Long.parseLong(in.next());
            long v = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());
            long w = Long.parseLong(in.next());
            long t = Long.parseLong(in.next());

            long dist = Math.abs(a - b);
            long dist2 = (v - w) * t;

            boolean ok = false;

            if (dist <= dist2) ok = true;

            out.println(ok ? "YES" : "NO");

        }

    }
}

