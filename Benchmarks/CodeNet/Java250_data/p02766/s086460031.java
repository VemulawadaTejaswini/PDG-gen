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
        abc156_b solver = new abc156_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc156_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long N = in.nextLong();
            int K = in.nextInt();
            String comp = Long.toString(N, K);
            out.println(comp.length());

        }

    }
}

