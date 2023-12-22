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
        AAirplane solver = new AAirplane();
        solver.solve(1, in, out);
        out.close();
    }

    static class AAirplane {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int p = in.nextInt();
            int q = in.nextInt();
            int r = in.nextInt();
            out.println(Math.min(Math.min(p + q, p + r), q + r));
        }

    }
}

