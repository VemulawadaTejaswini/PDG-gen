import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main implements Runnable {
    static boolean use_n_tests = false;
    static int stack_size = 1 << 20;

    void solve(FastScanner in, PrintWriter out, int testNumber) {
        int n,k;
        n = in.nextInt();
        k = in.nextInt();
        Integer[] a = Array.read(n, in);
        Arrays.sort(a);
        double l = 0;
        double r = a[a.length - 1];
        int ans = -1;
        while (r - l > 1e-5) {
            double x = (l + r) / 2.0;
            int cnt = getCnt(a, x);
            if (cnt > k) {
                l = x;
            } else {
                ans = (int) Math.ceil(x);
                r = x;
            }
        }
        if (ans == -1) {
            out.println(a[a.length - 1]);
        } else {
            out.println(Math.min(ans, a[a.length - 1]));
        }
    }

    int getCnt(Integer[] a, double x) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            double ax = a[i];
            if (ax < x) {
                continue;
            }
            if (ax % x < 1e-9) {
                cnt += (int) ax / x - 1;
            } else {
                cnt += (int) ax / x;
            }
        }
        return cnt;
    }


    void solve1(FastScanner in, PrintWriter out, int testNumber) {
        int n = in.nextInt();
        String s = in.next();
        int leftWhite = getNextW(s, -1);
        int rightRed = getPrevR(s, s.length());
        int cnt = 0;
        while (leftWhite < rightRed) {
            cnt++;
            leftWhite = getNextW(s, leftWhite);
            rightRed = getPrevR(s, rightRed);
        }
        out.println(cnt);
    }

    int getNextW(String s, int id) {
        for (int i = id + 1; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                return i;
            }
        }
        return s.length();
    }

    int getPrevR(String s, int id) {
        for (int i = id - 1; i >= 0; i--) {
            if (s.charAt(i) == 'R') {
                return i;
            }
        }
        return -1;
    }

    // ****************************** template code ***********

    static class Range {
        int l, r;
        public Range(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }
    static class Array {
        static Range[] readRanges(int n, FastScanner in) {
            Range[] result = new Range[n];
            for (int i = 0; i < n; i++) {
                result[i] = new Range(in.nextInt(), in.nextInt());
            }
            return result;
        }
        static public Integer[] read(int n, FastScanner in) {
            Integer[] out = new Integer[n];
            for (int i = 0; i < out.length; i++) {
                out[i] = in.nextInt();
            }
            return out;
        }
    }
    class Graph {
        List<List<Integer>> create(int n) {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            return graph;
        }
    }
    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream io) {
            br = new BufferedReader(new InputStreamReader(io));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    void run_t_tests() {
        int t = in.nextInt();
        int i = 0;
        while (t-- > 0) {
            solve(in, out, i++);
        }
    }

    void run_one() {
        solve(in, out, -1);
    }

    @Override
    public void run() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        if (use_n_tests) {
            run_t_tests();
        } else {
            run_one();
        }
        out.close();
    }

    static FastScanner in;
    static PrintWriter out;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(null, new Main(), "", stack_size);
        thread.start();
        thread.join();
    }
}