import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        ExtendedScanner sc = new ExtendedScanner();
        FastPrintStream pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    public static void solve(ExtendedScanner sc, FastPrintStream pw) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<IntPair> l = new ArrayList<>();
        char[][] b = new char[n][];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextChars();
            for (int j = 0; j < m; j++) {
                if (b[i][j] == 'o') {
                    l.add(new IntPair(i, j));
                }
            }
        }
        int siz = l.size();
        Digraph<CapEdge> g = new Digraph<>(n * m + 2);
        int s = n * m, t = n * m + 1;
        for (var p : l) {
            g.addEdge(new CapEdge(s, p.fst * m + p.snd, 1, 0));
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (b[i][j] == '#' || b[i][j + 1] == '#') continue;
                int from = i * m + j;
                int to = i * m + (j + 1);
                g.addEdge(new CapEdge(from, to, siz, -1));
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                if (b[i][j] == '#' || b[i + 1][j] == '#') continue;
                int from = i * m + j;
                int to = (i + 1) * m + j;
                g.addEdge(new CapEdge(from, to, siz, -1));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (b[i][j] == '#') continue;
                g.addEdge(new CapEdge(i * m + j, t, 1, 0));
            }
        }
        var mcf = new MinCostFlow(g);
        var a = mcf.minCostFlow(s, t, siz);
        pw.println(-a[1]);
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class FastScanner implements AutoCloseable {
    private final java.io.InputStream in;
    private final byte[] buf = new byte[2048];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner(java.io.InputStream in) {
        this.in = in;
    }

    public FastScanner() {
        this(System.in);
    }

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {
            buflen = in.read(buf);
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
        return buflen > 0;
    }

    private int readByte() {
        return hasNextByte() ? buf[ptr++] : -1;
    }

    public boolean hasNext() {
        while (hasNextByte() && !(32 < buf[ptr] && buf[ptr] < 127)) ptr++;
        return hasNextByte();
    }

    private StringBuilder nextSequence() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        for (int b = readByte(); 32 < b && b < 127; b = readByte()) {
            sb.appendCodePoint(b);
        }
        return sb;
    }

    public String next() {
        return nextSequence().toString();
    }

    public String next(int len) {
        return new String(nextChars(len));
    }

    public char nextChar() {
        if (!hasNextByte()) throw new java.util.NoSuchElementException();
        return (char) readByte();
    }

    public char[] nextChars() {
        StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (32 < b && b < 127 && i < len) {
            s[i++] = (char) b; b = readByte();
        }
        if (i != len) {
            throw new java.util.NoSuchElementException(
                String.format("Next token has smaller length than expected.", len)
            );
        }
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n = n * 10 + b - '0';
            } else if (b == -1 || !(32 < b && b < 127)) {
                return minus ? -n : n;
            } else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {
        return Math.toIntExact(nextLong());
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    public void close() {
        try {
            in.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends FastScanner {
    public ExtendedScanner() {super();}
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
    }
}

abstract class AbstractGraph<Edg extends AbstractEdge> {
    final int n;
    final java.util.ArrayList<Edg> edges;
    final java.util.ArrayList<java.util.ArrayList<Edg>> adj;
    public AbstractGraph(int n) {
        this.n = n;
        this.edges = new java.util.ArrayList<>(n);
        this.adj = new java.util.ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new java.util.ArrayList<>());
        }
    }
    public abstract void addEdge(Edg edge);
    public Edg getEdge(int u, int i) {
        return adj.get(u).get(i);
    }
    public java.util.ArrayList<Edg> getEdges(int u) {
        return adj.get(u);
    }
    public java.util.ArrayList<Edg> getEdges() {
        return edges;
    }
    public int deg(int u) {
        return adj.get(u).size();
    }
    public int getV() {
        return n;
    }
    public int getE() {
        return edges.size();
    }
}

/**
 * @verified
 * - https://atcoder.jp/contests/practice2/tasks/practice2_e
 */
class MinCostFlow {
    private static final long INF = Long.MAX_VALUE;

    private final Digraph<? extends CapEdge> dig;
    private final int n;
    private final int[] count;
    private final CapEdge[][] g;
    private final long[] potential;

    private final long[] dist;
    private final CapEdge[] prev;

    public MinCostFlow(Digraph<? extends CapEdge> capDiraph) {
        this.dig = capDiraph;
        this.n = capDiraph.getV();
        this.count = new int[n];
        this.g = new CapEdge[n][];
        this.potential = new long[n];
        this.dist = new long[n];
        this.prev = new CapEdge[n];
        buildGraph();
    }

    private void buildGraph() {
        int[] idx = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = idx[i] = dig.deg(i);
        }
        for (CapEdge e : dig.getEdges()) {
            int j = e.to;
            count[j]++;
        }
        for (int i = 0; i < n; i++) {
            g[i] = new CapEdge[count[i]];
        }
        for (int u = 0; u < n; u++) {
            int k = dig.deg(u);
            for (int i = 0; i < k; i++) {
                CapEdge e = dig.getEdge(u, i);
                int v = e.to;
                e.rev = idx[v]++;
                CapEdge r = new CapEdge(v, u, 0, -e.cost);
                r.rev = i;
                g[u][i] = e;
                g[v][e.rev] = r;
            }
        }
    }

    public long getFlow(CapEdge e) {
        return g[e.to][e.rev].cap;
    }

    private long addFlow;
    private long addCost;

    public long[] minCostMaxFlow(int s, int t) {
        return minCostFlow(s, t, INF);
    }

    public long[] minCostFlow(int s, int t, long flowLimit) {
        rangeCheck(s, 0, n);
        rangeCheck(t, 0, n);
        if (s == t) {
            throw new IllegalArgumentException(String.format("s = t = %d", s));
        }
        nonNegativeCheck(flowLimit, "Flow");
        buildGraph();
        long flow = 0;
        long cost = 0;
        while (true) {
            dijkstra(s, t, flowLimit - flow);
            if (addFlow == 0) break;
            flow += addFlow;
            cost += addFlow * addCost;
        }
        return new long[]{flow, cost};
    }

    public java.util.ArrayList<long[]> minCostSlope(int s, int t) {
        return minCostSlope(s, t, INF);
    }

    public java.util.ArrayList<long[]> minCostSlope(int s, int t, long flowLimit) {
        rangeCheck(s, 0, n);
        rangeCheck(t, 0, n);
        if (s == t) {
            throw new IllegalArgumentException(String.format("s = t = %d", s));
        }
        nonNegativeCheck(flowLimit, "Flow");
        buildGraph();
        java.util.ArrayList<long[]> slope = new java.util.ArrayList<>();
        long prevCost = -1;
        long flow = 0;
        long cost = 0;
        while (true) {
            slope.add(new long[]{flow, cost});
            dijkstra(s, t, flowLimit - flow);
            if (addFlow == 0) return slope;
            flow += addFlow;
            cost += addFlow * addCost;
            if (addCost == prevCost) {
                slope.remove(slope.size() - 1);
            }
            prevCost = addCost;
        }
    }

    private void dijkstra(int s, int t, long maxFlow) {
        final class State implements Comparable<State> {
            final int v;
            final long d;
            State(int v, long d) {this.v = v; this.d = d;}
            public int compareTo(State s) {return d == s.d ? v - s.v : d > s.d ? 1 : -1;}
        }
        java.util.Arrays.fill(dist, INF);
        dist[s] = 0;
        java.util.PriorityQueue<State> pq = new java.util.PriorityQueue<>();
        pq.add(new State(s, 0l));
        while (pq.size() > 0) {
            State st = pq.poll();
            int u = st.v;
            if (st.d != dist[u]) continue;
            for (CapEdge e : g[u]) {
                if (e.cap <= 0) continue;
                int v = e.to;
                long nextCost = dist[u] + e.cost + potential[u] - potential[v];
                if (nextCost < dist[v]) {
                    dist[v] = nextCost;
                    prev[v] = e;
                    pq.add(new State(v, dist[v]));
                }
            }
        }
        if (dist[t] == INF) {
            addFlow = 0;
            addCost = INF;
            return;
        }
        for (int i = 0; i < n; i++) {
            potential[i] += dist[i];
        }
        addCost = 0;
        addFlow = maxFlow;
        for (int v = t; v != s;) {
            CapEdge e = prev[v];
            addCost += e.cost;
            addFlow = java.lang.Math.min(addFlow, e.cap);
            v = e.from;
        }
        for (int v = t; v != s;) {
            CapEdge e = prev[v];
            e.cap -= addFlow;
            g[v][e.rev].cap += addFlow;
            v = e.from;
        }
    }

    public void clearFlow() {
        java.util.Arrays.fill(potential, 0);
        for (CapEdge e : dig.getEdges()) {
            long flow = getFlow(e);
            e.cap += flow;
            g[e.to][e.rev].cap -= flow;
        }
    }

    private void rangeCheck(int i, int minInlusive, int maxExclusive) {
        if (i < 0 || i >= maxExclusive) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d", i, maxExclusive)
            );
        }
    }

    private void nonNegativeCheck(long cap, java.lang.String attribute) {
        if (cap < 0) {
            throw new IllegalArgumentException(
                String.format("%s %d is negative.", attribute, cap)
            );
        }
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class FastPrintStream implements AutoCloseable {
    private static final int BUF_SIZE = 1 << 15;
    private final byte[] buf = new byte[BUF_SIZE];
    private int ptr = 0;
    private final java.lang.reflect.Field strField;
    private final java.nio.charset.CharsetEncoder encoder;

    private java.io.OutputStream out;

    public FastPrintStream(java.io.OutputStream out) {
        this.out = out;
        java.lang.reflect.Field f;
        try {
            f = java.lang.String.class.getDeclaredField("value");
            f.setAccessible(true);
        } catch (NoSuchFieldException | SecurityException e) {
            f = null;
        }
        this.strField = f;
        this.encoder = java.nio.charset.StandardCharsets.US_ASCII.newEncoder();
    }

    public FastPrintStream(java.io.File file) throws java.io.IOException {
        this(new java.io.FileOutputStream(file));
    }

    public FastPrintStream(java.lang.String filename) throws java.io.IOException {
        this(new java.io.File(filename));
    }

    public FastPrintStream() {
        this(System.out);
        try {
            java.lang.reflect.Field f = java.io.PrintStream.class.getDeclaredField("autoFlush");
            f.setAccessible(true);
            f.set(System.out, false);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            // ignore
        }
    }

    public FastPrintStream println() {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) '\n';
        return this;
    }

    public FastPrintStream println(java.lang.Object o) {
        return print(o).println();
    }

    public FastPrintStream println(java.lang.String s) {
        return print(s).println();
    }

    public FastPrintStream println(char[] s) {
        return print(s).println();
    }

    public FastPrintStream println(char c) {
        return print(c).println();
    }

    public FastPrintStream println(int x) {
        return print(x).println();
    }

    public FastPrintStream println(long x) {
        return print(x).println();
    }

    public FastPrintStream println(double d, int precision) {
        return print(d, precision).println();
    }

    private FastPrintStream print(byte[] bytes) {
        int n = bytes.length;
        if (ptr + n > BUF_SIZE) {
            internalFlush();
            try {
                out.write(bytes);
            } catch (java.io.IOException e) {
                throw new RuntimeException();
            }
        } else {
            System.arraycopy(bytes, 0, buf, ptr, n);
            ptr += n;
        }
        return this;
    }

    public FastPrintStream print(java.lang.Object o) {
        return print(o.toString());
    }

    public FastPrintStream print(java.lang.String s) {
        if (strField == null) {
            return print(s.getBytes());
        } else {
            try {
                Object value = strField.get(s);
                if (value instanceof byte[]) {
                    return print((byte[]) value);
                } else {
                    return print((char[]) value);
                }
            } catch (IllegalAccessException e) {
                return print(s.getBytes());
            }
        }
    }

    public FastPrintStream print(char[] s) {
        try {
            return print(encoder.encode(java.nio.CharBuffer.wrap(s)).array());
        } catch (java.nio.charset.CharacterCodingException e) {
            byte[] bytes = new byte[s.length];
            for (int i = 0; i < s.length; i++) {
                bytes[i] = (byte) s[i];
            }
            return print(bytes);
        }
    }

    public FastPrintStream print(char c) {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) c;
        return this;
    }

    public FastPrintStream print(int x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(long x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(double d, int precision) {
        if (d < 0) {
            print('-');
            d = -d;
        }
        d += Math.pow(10, -precision) / 2;
        print((long) d).print('.');
        d -= (long) d;
        for(int i = 0; i < precision; i++){
            d *= 10;
            print((int) d);
            d -= (int) d;
        }
        return this;
    }

    private void internalFlush() {
        try {
            out.write(buf, 0, ptr);
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            out.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int len(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }

    private static int len(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntPair {
    public int fst, snd;
    public IntPair(final int fst, final int snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IntPair)) return false;
        final IntPair p = (IntPair) o;
        return this.fst == p.fst && this.snd == p.snd;
    }
    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + fst;
        hash = hash * 31 + snd;
        return hash;
    }
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
}
/**
 * @author https://atcoder.jp/users/suisen
 */
class Digraph<Edg extends AbstractEdge> extends AbstractGraph<Edg> {
    public Digraph(int n) {
        super(n);
    }
    @Override
    public void addEdge(Edg edge) {
        adj.get(edge.from).add(edge);
        edges.add(edge);
    }
}

abstract class AbstractEdge implements Comparable<AbstractEdge> {
    public final int from, to;
    public final long cost;
    public AbstractEdge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
    public AbstractEdge(int from, int to) {
        this(from, to, 1l);
    }
    public abstract AbstractEdge reverse();
    public int compareTo(AbstractEdge o) {
        return Long.compare(cost, o.cost);
    }
}

class CapEdge extends AbstractEdge {
    long cap;
    int rev;
    public CapEdge(int from, int to, long cap, long cost) {
        super(from, to, cost);
        this.cap = cap;
    }
    public CapEdge(int from, int to, long cap) {
        this(from, to, cap, 1);
    }
    @Override
    public final AbstractEdge reverse() {
        throw new UnsupportedOperationException();
    }
}
