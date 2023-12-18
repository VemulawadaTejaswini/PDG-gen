import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {

    static int H, W, S;
    static int[][] U;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        while(true) {
            H = sc.nextInt();
            W = sc.nextInt();
            S = sc.nextInt();
            if( H == 0 ) break;

            U = new int[H][];
            for (int i = 0; i < H; i++) {
                U[i] = sc.nextIntArray(W);
            }

            System.out.println(solve());
        }
    }

    // [左上, 右下]を最大に分割したときの予備力
    static int[][][] MEMO;

    static String solve() {
        MEMO = new int[H*W][H*W][];
        accumlate(H, W, U);
        int total = get(0, 0, H-1, W-1, U);
        int P = total - S; // 最低でもこれだけ抑制する

        int[] ret = dfs(0, 0, H-1, W-1, P);
        return ret[0] + " " + ret[1];
    }

    static int[] dfs(int h1, int w1, int h2, int w2, int P) {
        int hw1 = h1*W + w1;
        int hw2 = h2*W + w2;
        if( MEMO[hw1][hw2] != null ) {
            return MEMO[hw1][hw2];
        }

        int p = get(h1, w1, h2, w2, U);
        if( p < P ) {
            // この分割だと困る
            MEMO[hw1][hw2] = new int[]{0, 0};
            return MEMO[hw1][hw2];
        }

        // 分割できない場合で初期化
        int g = 1;
        int y = p - P;

        if( h2 - h1 >= 1 ) {
            for (int m = h1; m < h2; m++) {
                int[] a = dfs(h1, w1, m, w2, P);
                int[] b = dfs(m+1, w1, h2, w2, P);
                if( a[0] != 0 && b[0] != 0 ) {
                    int ng = a[0] + b[0];
                    int ny = Math.min(a[1], b[1]);
                    if( ng > g ) {
                        g = ng;
                        y = ny;
                    } else if( ng == g ) {
                        y = Math.max(y, ny);
                    }
                }
            }
        }
        if( w2 - w1 >= 1 ) {
            for (int m = w1; m < w2; m++) {
                int[] a = dfs(h1, w1, h2, m, P);
                int[] b = dfs(h1, m+1, h2, w2, P);
                if( a[0] != 0 && b[0] != 0 ) {
                    int ng = a[0] + b[0];
                    int ny = Math.min(a[1], b[1]);
                    if( ng > g ) {
                        g = ng;
                        y = ny;
                    } else if( ng == g ) {
                        y = Math.max(y, ny);
                    }
                }
            }
        }
        MEMO[hw1][hw2] = new int[]{g, y};
        return MEMO[hw1][hw2];
    }

    static void accumlate(int h, int w, int[][] c) {
        for (int i = 0; i < h; i++) {
            for (int j = 1; j < w; j++) {
                c[i][j] += c[i][j-1];
            }
        }
        for (int j = 0; j < w; j++) {
            for (int i = 1; i < h; i++) {
                c[i][j] += c[i-1][j];
            }
        }
    }

    // 左上が (h1, w1), 左下が(h2, w2), 閉区間
    static int get(int h1, int w1, int h2, int w2, int[][] c) {
        // d c
        // b a
        int abcd = c[h2][w2];

        int cd;
        if( h1 > 0 ) {
            cd = c[h1-1][w2];
        } else {
            cd = 0;
        }

        int bd;
        if( w1 > 0 ) {
            bd = c[h2][w1-1];
        } else {
            bd = 0;
        }

        int d;
        if( w1 > 0 && h1 > 0 ) {
            d = c[h1-1][w1-1];
        } else {
            d = 0;
        }

        return abcd - cd - bd + d;
    }

    static int maximize(int lo, int hi, IntPredicate p) {
        while(lo < hi) {
            int x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                lo = x + 1;
            } else {
                hi = x;
            }
        }
        return lo - 1;
    }

    static int minimize(int lo, int hi, IntPredicate p) {
        while(lo < hi) {
            int x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                hi = x;
            } else {
                lo = x + 1;
            }
        }
        return lo;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}

