import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, M;
    static int[] A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = sc.nextIntArray(N);
        B = sc.nextIntArray(M);

        System.out.println(solve());
    }

    static int solve() {
        return dfs(0, 0, 0, 0, 0, 0, true, 1, new HashMap<>());
    }

    static int dfs(int ai, int bi, int aj, int bj, int as, int bs, boolean first, int pass, Map<Key, Integer> memo) {
        if( pass == 3 ) return 0;

        Key key = new Key(ai, bi, aj, bj, first, pass);
        if( memo.containsKey(key) ) {
            return memo.get(key);
        }

        // カードを山に積む
        int play_point = first ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        if( first ? (ai < N) : (bi < M) ) {
            int nai, nbi, naj, nbj, nas, nbs;
            if( first ) {
                int card = A[ai];
                nai = ai+1;
                nbi = bi;
                if( card == -1 ) {
                    nas = as;
                    naj = aj;
                    nbs = 0; // reset
                    nbj = bi;// reset
                } else {
                    nas = as + card;
                    nbs = bs;
                    naj = aj;
                    nbj = bj;
                }

            } else {
                int card = B[bi];
                nai = ai;
                nbi = bi+1;
                if( card == -1 ) {
                    nas = 0;  // reset
                    naj = ai; // reset
                    nbs = bs;
                    nbj = bj;
                } else {
                    nas = as;
                    naj = aj;
                    nbs = bs + card;
                    nbj = bj;
                }
            }
            play_point = dfs(nai, nbi, naj, nbj, nas, nbs, !first, 0, memo);
        }
        int pass_point = dfs(ai, bi, ai, bi, 0, 0, !first, pass+1, memo) + as - bs;

        int ret = first ? Math.max(play_point, pass_point) : Math.min(play_point, pass_point);
        memo.put(key, ret);
        return ret;
    }

    static class Key {
        int ai, bi, aj, bj;
        boolean first;
        int pass;

        public Key(int ai, int bi, int aj, int bj, boolean first, int pass) {
            this.ai = ai;
            this.bi = bi;
            this.aj = aj;
            this.bj = bj;
            this.first = first;
            this.pass = pass;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return ai == key.ai &&
                    bi == key.bi &&
                    aj == key.aj &&
                    bj == key.bj &&
                    first == key.first &&
                    pass == key.pass;
        }

        @Override
        public int hashCode() {
            return Objects.hash(ai, bi, aj, bj, first, pass);
        }
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

