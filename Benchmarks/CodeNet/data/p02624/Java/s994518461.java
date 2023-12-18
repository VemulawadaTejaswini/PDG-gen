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
        Task3 solver = new Task3();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task3 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long cnt[] = new long[n + 1];

            long tot = 1;
            for (int i = 2; i <= n; ++i) {
                for (int j = i; j <= n; j += i) {
                    cnt[j]++;
                }
                cnt[i]++;
                tot += (i * cnt[i]);
            }
            out.println(tot);
        }

    }
}

