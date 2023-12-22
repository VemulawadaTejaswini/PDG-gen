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
        ABC130_b solver = new ABC130_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC130_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int X = in.nextInt();
            int i = 1;
            int ttl = 0;
            for (i = 1; i <= N; i++) {
                ttl += in.nextInt();
                if (ttl > X) {
                    break;
                }

            }
            out.println(i);
        }

    }
}

