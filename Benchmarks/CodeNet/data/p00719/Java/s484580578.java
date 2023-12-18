import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    static int P, N, M, A, B;
    static int[] T;
    static int[][] E;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while(true) {
            P = sc.nextInt();
            N = sc.nextInt();
            M = sc.nextInt();
            A = sc.nextInt()-1;
            B = sc.nextInt()-1;
            if( P == 0 ) break;

            T = sc.nextIntArray(P);
            E = new int[M][3];
            for (int i = 0; i < M; i++) {
                E[i][0] = sc.nextInt()-1;
                E[i][1] = sc.nextInt()-1;
                E[i][2] = sc.nextInt();
            }

            pw.println( solve() );
        }

        pw.flush();
    }

    // tekitou
    static double EPS = 1e-11;

    static String solve() {
        int[][][] G = adjB(N, E);
        double[][] dist = new double[N][1 << P];
        for (double[] row : dist) {
            Arrays.fill(row, Double.MAX_VALUE);
        }

        PriorityQueue<State> q = new PriorityQueue<>(Comparator.comparingDouble(s -> s.d));
        q.add( new State(A, 0, 0.0) );
        dist[A][0] = 0.0;
        int full = (1 << P) -1;

        while(!q.isEmpty()) {
            State s = q.poll();
            if( Math.abs(s.d - dist[s.a][s.s]) > EPS ) continue;
            if( s.s == full ) continue;

            for (int[] e : G[s.a]) {
                int b = s.a == e[0] ? e[1] : e[0];

                for (int i = 0; i < P; i++) {
                    int f = 1 << i;
                    if( (s.s & f) != 0 ) continue;

                    int ns = s.s | f;
                    double cost = (double)e[2] / T[i];
                    if( dist[b][ns] > s.d + cost ) {
                        dist[b][ns] = s.d + cost;
                        q.add( new State(b, ns, dist[b][ns]) );
                    }
                }
            }
        }

        double min = Double.MAX_VALUE;
        for (int i = 0; i < 1 << P; i++) {
            min = Math.min(min, dist[B][i]);
        }
        if( min == Double.MAX_VALUE ) return "Impossible";
        else return BigDecimal.valueOf(min).toPlainString();
    }

    static int[][][] adjB(int n, int[][] E) {
        int[][][] adj = new int[n][][];
        int[] cnt = new int[n];
        for (int[] e : E) {
            cnt[e[0]]++;
            cnt[e[1]]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]][];
        }
        for (int[] e : E) {
            adj[e[0]][--cnt[e[0]]] = e;
            adj[e[1]][--cnt[e[1]]] = e;
        }
        return adj;
    }

    static class State {
        int a, s;
        double d;

        public State(int a, int s, double d) {
            this.a = a;
            this.s = s;
            this.d = d;
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
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

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
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
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}

