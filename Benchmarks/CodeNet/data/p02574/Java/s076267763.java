import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        int N;
        int[] A;

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            N = in.Int();
            A = in.Int(N);

//        out.println(func1());
            out.println(func2());
        }

        private String func2() {
            int l = 0;
            long a = A[l];
            Set<Long> set = new HashSet<>();
            set.add(a);
            for (int r = 1; r < N; r++) {
                long b = A[r];
                a = gcd(a, b);
                if (a == 1) {
                    if (l + 1 == r && set.stream().allMatch(n -> gcd(n, b) == 1)) {
                        // pc
                        l++;
                        a = b;
                        set.add(b);
                    } else {
                        // sc
                        return "setwise coprime";
                    }
                }
            }
            if (l == N - 1) return "pairwise coprime";
            return "not coprime";
        }

        long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

        public int[] Int(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Int();
            }
            return a;
        }

    }
}

