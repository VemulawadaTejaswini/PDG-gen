import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {
    FastIO sc;
    int n;
    int[] dp;
    int M = 1000000007;

    void solve() throws Exception {
        int n = sc.nextInt();
        System.out.println(2*Math.PI*n);
    }

    void run() {
        try {
            sc = new FastIO();
            solve();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(abs(-1));
        }
    }

    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);
        } catch (Exception ignore) {
        }
        new Main().run();
    }

    class FastIO extends PrintWriter {
        private BufferedReader in;
        private StringTokenizer stok;

        FastIO() {
            super(System.out);
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        FastIO(String s) throws FileNotFoundException {
            super("".equals(s) ? "output.txt" : s + ".out");
            in = new BufferedReader(new FileReader("".equals(s) ? "input.txt" : s + ".in"));
        }

        @Override
        public void close() {
            super.close();
            try {
                in.close();
            } catch (IOException ignored) {
            }
        }

        String next() {
            while (stok == null || !stok.hasMoreTokens()) {
                try {
                    stok = new StringTokenizer(in.readLine());
                } catch (Exception e) {
                    return null;
                }
            }
            return stok.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            try {
                return in.readLine();
            } catch (IOException e) {
                return null;
            }
        }

        char[] nextCharArray() {
            return next().toCharArray();
        }
    }

    class Pair {
        int mon, fac;

        Pair(int mon, int fac) {
            this.mon = mon;
            this.fac = fac;
        }
    }

    void randomShuffle(int[] a) {
        Random random = new Random();
        for (int i = 1; i < a.length; i++) {
            int x = random.nextInt(i + 1);
            int xchg = a[i];
            a[i] = a[x];
            a[x] = xchg;
        }
    }

    static boolean even(int n) {
        int r = n & 1;
        return r != 1 ? true : false;
    }
}