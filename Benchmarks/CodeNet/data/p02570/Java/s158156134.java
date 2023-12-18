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
        ADontBeLate solver = new ADontBeLate();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADontBeLate {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int d = Integer.parseInt(in.next());
            int t = Integer.parseInt(in.next());
            int s = Integer.parseInt(in.next());
            boolean ok = true;
            if (d > t * s) ok = false;
            out.println(ok ? "Yes" : "No");

        }

    }
}

