import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;

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
        abc169_b solver = new abc169_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc169_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            BigInteger multi = new BigInteger(String.valueOf(in.nextLong()));
            long max = 1000000000000000000l;
            if (multi.compareTo(BigInteger.valueOf(0)) == 0) {
                out.println(0);
                return;
            }
            for (int i = 1; i < N; i++) {
                long by = in.nextLong();
                if (by == 0) {
                    if (multi.compareTo(BigInteger.valueOf(0)) == 0) {
                        out.println(0);
                        return;
                    }
                }
                if (by == 1) {
                    continue;
                }
                multi = multi.multiply(BigInteger.valueOf(by));
            }
            if (multi.compareTo(BigInteger.valueOf(1000000000000000000l)) == 1) {
                out.println(-1);
                return;
            }
            out.println(multi);
        }

    }
}

