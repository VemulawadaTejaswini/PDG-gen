import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int more = in.nextInt();
        int was = in.next().length();
        int n = more + was;
        int res = 0;
        final int MAX = (int) 2e6 + 10;
        fact = new int[MAX];
        fact[0] = 1;
        for (int i = 1; i < MAX; i++) {
            fact[i] = mul(fact[i - 1], i);
        }
        factInv = new int[MAX];
        factInv[MAX - 1] = BigInteger.valueOf(fact[MAX - 1]).modInverse(BigInteger.valueOf(mod)).intValue();
        for (int i = MAX - 1; i > 0; i--) {
            factInv[i - 1] = mul(factInv[i], i);
        }
        int[] pw25 = new int[MAX];
        int[] pw26 = new int[MAX];
        pw25[0] = pw26[0] = 1;
        for (int i = 1; i < MAX; i++) {
            pw25[i] = mul(pw25[i - 1], 25);
            pw26[i] = mul(pw26[i - 1], 26);
        }
        for (int last = was - 1; last < n; last++) {
            int ways = c(last, was - 1);
            ways = mul(ways, pw25[last + 1 - was]);
            ways = mul(ways, pw26[more - (last + 1 - was)]);
            res = add(res, ways);
        }
        out.println(res);
    }

    int c(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return mul(fact[n], mul(factInv[k], factInv[n - k]));
    }

    int[] fact;
    int[] factInv;

    final int mod = (int) 1e9 + 7;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
    }

    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();
        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}