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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            long[] ans = new long[n + 1];

            for (int i = 1; i <= 100; i++) {
                for (int j = 1; j <= 100; j++) {
                    for (int k = 1; k <= 100; k++) {
                        int tmp = i * i + j * j + k * k + i * j + j * k + k * i;
                        if (tmp <= n) {
                            ans[tmp]++;
//                        System.out.printf("i=%d j=%d k=%d res=%d\n", i, j, k, tmp);
                        }
                    }
                }
            }
            // 出力
            for (int i = 1; i <= n; i++) {
                out.println(ans[i]);
            }

        }

    }
}

