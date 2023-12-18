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
        abc169_b solver = new abc169_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc169_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            long a[] = new long[N];
            for (int i = 0; i < N; i++) {
                long by = in.nextLong();
                if (by == 0) {
                    if (by == 0) {
                        out.println(0);
                        return;
                    }
                } else {
                    a[i] = by;
                }
            }
        /*
        BigInteger multi = new BigInteger(0);
        long max = 1000000000000000000l;
        if (multi.compareTo(BigInteger.valueOf(0)) ==0) {
            out.println(0);
            return;
        }
        */
            long wkval = 1;
            for (int i = 0; i < N; i++) {
                if (a[i] == 1) {
                    continue;
                }
                if (a[i] <= (1000000000000000000l / wkval)) {
                    wkval *= a[i];
                } else {
                    out.println(-1);
                    return;
                }
            /*
            if (multi.compareTo(BigInteger.valueOf(1000000000000000000l/multi.longValue())) ==1) {
                out.println(-1);
                return;
            }
            multi =multi.multiply(BigInteger.valueOf(by));
            */
            }
            out.println(wkval);
        }

    }
}

