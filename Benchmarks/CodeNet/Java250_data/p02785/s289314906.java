import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int N = Integer.parseInt(in.next());
            int K = Integer.parseInt(in.next());
            Integer[] H = new Integer[N];
            long ans = 0;
            for (int i = 0; i < N; i++) {
                H[i] = Integer.valueOf(in.next());
                ans += H[i];
            }
            Arrays.sort(H, Collections.reverseOrder());
            if (K > N) K = N;
            for (int i = 0; i < K; i++) {
                ans -= H[i];
            }

            // 出力
            out.println(ans);

        }

    }
}

