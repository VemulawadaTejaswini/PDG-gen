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
        TripleDots solver = new TripleDots();
        solver.solve(1, in, out);
        out.close();
    }

    static class TripleDots {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int k = in.nextInt();
            String s = in.next();

            if (s.length() <= k) {
                out.append(s);
                return;
            }

            out.append(s.substring(0, k) + "...");

        }

    }
}

