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
        ABC153_a solver = new ABC153_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC153_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int A = in.nextInt();
            out.println((int) Math.floor(H / A) + ((H % A != 0) ? 1 : 0));
        }

    }
}

