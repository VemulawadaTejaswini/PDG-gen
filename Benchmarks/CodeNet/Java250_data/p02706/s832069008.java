import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BHomework solver = new BHomework();
        solver.solve(1, in, out);
        out.close();
    }

    static class BHomework {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int acc = 0;
            for (int i = 0; i < m; i++) {
                acc += in.nextInt();
            }
            out.println(n < acc ? -1 : n - acc);
        }

    }
}

