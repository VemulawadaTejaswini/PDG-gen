import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
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
        BitStringReordering solver = new BitStringReordering();
        solver.solve(1, in, out);
        out.close();
    }

    static class BitStringReordering {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] b = new int[N];
            int[] p = new int[M];
            for (int i = 0; i < N; i++) {
                b[i] = in.nextInt();
            }
            for (int i = 0; i < M; i++) {
                p[i] = in.nextInt();
            }
            out.println(Math.min(calc(b.clone(), p, 0, 1), calc(b.clone(), p, 1, 0)));
        }

        public int calc(int[] bit, int[] num, int a, int b) {
            int[] d = {a, b};
            final int L = bit.length;
            int[] result = new int[L];
            int idx = 0, cnt = 0;
            for (int el : num) {
                for (int i = 0; i < el; i++) {
                    result[idx++] = d[cnt];
                }
                cnt = (cnt + 1) % 2;
            }
            assert idx == L;
            if (Arrays.stream(bit).sum() != Arrays.stream(result).sum()) {
                return (int) 1e9;
            }
            int res = 0;
            for (int i = 0; i < L; i++) {
                if (bit[i] != result[i]) {
                    for (int j = i + 1; j < L; j++) {
                        if (result[i] == bit[j]) {
                            for (int k = j; k > i; k--) {
                                swap(bit, k, k - 1);
                            }
                            res += j - i;
                            break;
                        }
                    }
                }
            }
            return res;
        }

        public void swap(int[] ar, int i1, int i2) {
            int buf = ar[i1];
            ar[i1] = ar[i2];
            ar[i2] = buf;
        }

    }
}