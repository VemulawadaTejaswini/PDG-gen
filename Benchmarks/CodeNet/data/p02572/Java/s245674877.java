import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author test
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc177_c solver = new abc177_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc177_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            long[] A = new long[N];
            long mod = 1000000007;
            for (int i = 0; i < N; i++) {
                A[i] = in.nextLong();
            }
            long sum = 0;
            long ans = 0;
            for (int i = 0; i < N; i++) {
                ans = (ans + (A[i] * sum)) % mod;
                sum = (sum + A[i]) % mod;
            }
            out.println(ans);
        }

    }
}

