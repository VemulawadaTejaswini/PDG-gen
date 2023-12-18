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
        ESequenceSum solver = new ESequenceSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESequenceSum {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            long n = Long.parseLong(in.next());
            long x = Long.parseLong(in.next());
            long m = Long.parseLong(in.next());
            long ans = 0;
//        ans += x;
//        long a = (x * x) % m;
//        long cnt = 1;
//        while (true) {
//            if (cnt == n || a % m == 0) break;
//            ans += a;
//            a = (a * a) % m;
//            cnt++;
//        }
//
//        // 出力
//        out.println(ans);
            long[] sum = new long[1000001];
            int[] rem = new int[(int) m];
            int len = 0;
            int r = 0;
            long s = 0;
            while (true) {
                r = (int) (x % m);
                if (rem[r] != 0)
                    break;
                s += r;
                len++;
                rem[r] = len;
                sum[len] = s;
                x = (long) ((long) r * r);
            }
//        debug(r + " " + rem[r] + " " + len + " " + sum[len]);
            int cyc = len - rem[r] + 1;
//        debug(cyc);

            // 周回に入る前
            long a = 0;
            if (rem[r] != 0)
                a = sum[rem[r] - 1];

            // 周回部分
            long b = sum[len];
            if (rem[r] != 0)
                b -= sum[rem[r] - 1];
            n = n - rem[r] + 1;
            long c = n / cyc;

            // 1周に満たない
            long d = n % cyc;
            long e = sum[(int) (rem[r] + d - 1)] - sum[rem[r] - 1];

            ans = a + b * c + e;
            out.println(ans);
        }

    }
}

