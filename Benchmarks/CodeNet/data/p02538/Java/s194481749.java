
/**
 * Date: 26 Sep, 2020
 * Link: 
 * 
 * @author: Prasad Chaudhari
 * @linkedIn: https://www.linkedin.com/in/prasad-chaudhari-841655a6/
 * @git: https://github.com/Prasad-Chaudhari
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        FastIO in = new FastIO(args);
        int n = in.ni();
        int q = in.ni();
        int a[] = new int[n];
        pow10 = new long[n + 2];
        pow11 = new long[n + 2];
        pow10[0] = 1;
        pow11[0] = 1;

        a[0] = 1;
        for (int i = 1; i < n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % mod;
            pow11[i] = (pow11[i - 1] + pow10[i]) % mod;
            a[i] = 1;
        }
        pow10[n] = (pow10[n - 1] * 10) % mod;
        pow10[n + 1] = (pow10[n] * 10) % mod;
        Node mainNode = new Node(0, n - 1, a);
        while (q-- > 0) {
            int l = in.ni() - 1;
            int r = in.ni() - 1;
            int d = in.ni();
            // System.out.println(l + " " + r + " " + d);
            mainNode.update(l, r, d);
            System.out.println(mainNode.val + "");
        }
        in.bw.flush();
    }

    static long mod = 998244353;
    static long[] pow10;
    static long[] pow11;

    static class Node {
        int start, end;
        int lazy;
        long val;
        Node left, right;

        public Node(int l, int r, int a[]) {
            start = l;
            end = r;
            lazy = -1;
            if (l == r) {
                val = a[l];
            } else {
                int mid = (l + r) / 2;
                left = new Node(l, mid, a);
                right = new Node(mid + 1, r, a);
                val = (left.val + (right.val * pow10[mid - l + 1]) % mod) % mod;
                // System.out.println(start + " " + end + " " + val);
            }
        }

        public void update(int l, int r, int d) {

            if (lazy != -1) {
                update();
                if (start != end) {
                    left.lazy = lazy;
                    right.lazy = lazy;
                }
                lazy = -1;
            }
            if (start > r || end < l) {
                return;
            }
            if (l <= start && end <= r) {
                lazy = d;
                update();
                if (start != end) {
                    left.lazy = lazy;
                    right.lazy = lazy;
                }
                lazy = -1;
            } else {
                left.update(l, r, d);
                right.update(l, r, d);
                getVal();
            }
        }

        void getVal() {
            long ans1 = left.val;
            long ans2 = right.val;
            val = (ans2 + (ans1 * pow10[right.end - right.start + 1]) % mod) % mod;
            // System.out.println(start + "_" + end + " " + val);
        }

        void update() {
            int length = end - start;
            long ans = pow11[length];
            // ans = (ans - 1 + mod) % mod;
            // ans = (ans * Expo.a_pow_n_mod_m(9, mod - 2, mod)) % mod;
            ans = (ans * lazy) % mod;
            val = ans;
            // System.out.println(start + " " + end + " " + val);
        }
    }

    static class Expo {

        static long a_pow_n_mod_m(long a, long n, long m) {
            long ans = 1;
            while (n > 0) {
                if ((n & 1) == 1)
                    ans = (ans * a) % m;
                a = (a * a) % m;
                n >>= 1;
            }
            return ans;
        }

        static long a_pow_n(long a, long n) {
            long ans = 1;
            while (n > 0) {
                if ((n & 1) == 1)
                    ans *= a;
                a *= a;
                n >>= 1;
            }
            return ans;
        }
    }

    static class Data implements Comparable<Data> {

        int a, b;

        public Data(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Data o) {
            if (a == o.a) {
                return Integer.compare(b, o.b);
            }
            return Integer.compare(a, o.a);
        }

        public static void sort(int a[]) {
            Data d[] = new Data[a.length];
            for (int i = 0; i < a.length; i++) {
                d[i] = new Data(a[i], 0);
            }
            Arrays.sort(d);
            for (int i = 0; i < a.length; i++) {
                a[i] = d[i].a;
            }
        }
    }

    static class FastIO {

        private final BufferedReader br;
        private final BufferedWriter bw;
        private String s[];
        private int index;

        public FastIO(String[] args) throws IOException {
            if (args.length > 1) {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(args[0]))));
                bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(args[1]))));
            } else {
                br = new BufferedReader(new InputStreamReader(System.in));
                bw = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
            }
            s = br.readLine().split(" ");
            index = 0;
        }

        public int ni() throws IOException {
            return Integer.parseInt(nextToken());
        }

        public double nd() throws IOException {
            return Double.parseDouble(nextToken());
        }

        public long nl() throws IOException {
            return Long.parseLong(nextToken());
        }

        public String next() throws IOException {
            return nextToken();
        }

        public String nli() throws IOException {
            try {
                return br.readLine();
            } catch (IOException ex) {

            }
            return null;
        }

        public int[] gia(int n) throws IOException {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }

        public int[] gia(int n, int start, int end) throws IOException {
            validate(n, start, end);
            int a[] = new int[n];
            for (int i = start; i < end; i++) {
                a[i] = ni();
            }
            return a;
        }

        public double[] gda(int n) throws IOException {
            double a[] = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nd();
            }
            return a;
        }

        public double[] gda(int n, int start, int end) throws IOException {
            validate(n, start, end);
            double a[] = new double[n];
            for (int i = start; i < end; i++) {
                a[i] = nd();
            }
            return a;
        }

        public long[] gla(int n) throws IOException {
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nl();
            }
            return a;
        }

        public long[] gla(int n, int start, int end) throws IOException {
            validate(n, start, end);
            long a[] = new long[n];
            for (int i = start; i < end; i++) {
                a[i] = nl();
            }
            return a;
        }

        public int[][][] gwtree(int n) throws IOException {
            int m = n - 1;
            int adja[][] = new int[n + 1][];
            int weight[][] = new int[n + 1][];
            int from[] = new int[m];
            int to[] = new int[m];
            int count[] = new int[n + 1];
            int cost[] = new int[n + 1];
            for (int i = 0; i < m; i++) {
                from[i] = i + 1;
                to[i] = ni();
                cost[i] = ni();
                count[from[i]]++;
                count[to[i]]++;
            }
            for (int i = 0; i <= n; i++) {
                adja[i] = new int[count[i]];
                weight[i] = new int[count[i]];
            }
            for (int i = 0; i < m; i++) {
                adja[from[i]][count[from[i]] - 1] = to[i];
                adja[to[i]][count[to[i]] - 1] = from[i];
                weight[from[i]][count[from[i]] - 1] = cost[i];
                weight[to[i]][count[to[i]] - 1] = cost[i];
                count[from[i]]--;
                count[to[i]]--;
            }
            return new int[][][] { adja, weight };
        }

        public int[][][] gwg(int n, int m) throws IOException {
            int adja[][] = new int[n + 1][];
            int weight[][] = new int[n + 1][];
            int from[] = new int[m];
            int to[] = new int[m];
            int count[] = new int[n + 1];
            int cost[] = new int[n + 1];
            for (int i = 0; i < m; i++) {
                from[i] = ni();
                to[i] = ni();
                cost[i] = ni();
                count[from[i]]++;
                count[to[i]]++;
            }
            for (int i = 0; i <= n; i++) {
                adja[i] = new int[count[i]];
                weight[i] = new int[count[i]];
            }
            for (int i = 0; i < m; i++) {
                adja[from[i]][count[from[i]] - 1] = to[i];
                adja[to[i]][count[to[i]] - 1] = from[i];
                weight[from[i]][count[from[i]] - 1] = cost[i];
                weight[to[i]][count[to[i]] - 1] = cost[i];
                count[from[i]]--;
                count[to[i]]--;
            }
            return new int[][][] { adja, weight };
        }

        public int[][] gtree(int n) throws IOException {
            int adja[][] = new int[n + 1][];
            int from[] = new int[n - 1];
            int to[] = new int[n - 1];
            int count[] = new int[n + 1];
            for (int i = 0; i < n - 1; i++) {
                from[i] = i + 1;
                to[i] = ni();
                count[from[i]]++;
                count[to[i]]++;
            }
            for (int i = 0; i <= n; i++) {
                adja[i] = new int[count[i]];
            }
            for (int i = 0; i < n - 1; i++) {
                adja[from[i]][--count[from[i]]] = to[i];
                adja[to[i]][--count[to[i]]] = from[i];
            }
            return adja;
        }

        public int[][] gg(int n, int m) throws IOException {
            int adja[][] = new int[n + 1][];
            int from[] = new int[m];
            int to[] = new int[m];
            int count[] = new int[n + 1];
            for (int i = 0; i < m; i++) {
                from[i] = ni();
                to[i] = ni();
                count[from[i]]++;
                count[to[i]]++;
            }
            for (int i = 0; i <= n; i++) {
                adja[i] = new int[count[i]];
            }
            for (int i = 0; i < m; i++) {
                adja[from[i]][--count[from[i]]] = to[i];
                adja[to[i]][--count[to[i]]] = from[i];
            }
            return adja;
        }

        public void print(String s) throws IOException {
            bw.write(s);
        }

        public void println(String s) throws IOException {
            bw.write(s);
            bw.newLine();
        }

        public void print(int s) throws IOException {
            bw.write(s + "");
        }

        public void println(int s) throws IOException {
            bw.write(s + "");
            bw.newLine();
        }

        public void print(long s) throws IOException {
            bw.write(s + "");
        }

        public void println(long s) throws IOException {
            bw.write(s + "");
            bw.newLine();
        }

        public void print(double s) throws IOException {
            bw.write(s + "");
        }

        public void println(double s) throws IOException {
            bw.write(s + "");
            bw.newLine();
        }

        private String nextToken() throws IndexOutOfBoundsException, IOException {
            if (index == s.length) {
                s = br.readLine().split(" ");
                index = 0;
            }
            return s[index++];
        }

        private void validate(int n, int start, int end) {
            if (start < 0 || end >= n) {
                throw new IllegalArgumentException();
            }
        }
    }
}
