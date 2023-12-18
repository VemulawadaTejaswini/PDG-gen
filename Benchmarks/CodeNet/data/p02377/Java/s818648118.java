import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.io.IOException;
import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.List;
import java.io.FileInputStream;
import java.util.InputMismatchException;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/A2";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int V = in.nextInt();
        int E = in.nextInt();
        int F = in.nextInt();
        Graph<CappedEdge> g = Graph.create(V);
        for (int i = 0; i < E; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            CappedEdgeImpl.CappedEdgePair ep = CappedEdgeImpl.pairedEdges(u, v, c, d);
            g.addDirectionalEdge(u, ep.normal);
            g.addDirectionalEdge(v, ep.rev);
        }
        PrimaryDual primaryDual = new PrimaryDual(g);
        System.out.println(primaryDual.doit(0, V - 1, F));
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }
}


class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream) {
        this.stream = stream;
        // stream = new FileInputStream(new File("dec.in"));
    }

    int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}


interface CappedEdge extends Edge {
    long cap();

    CappedEdge rev();

    void addCap(long cap);
}



class PrimaryDual {
    public static final long INF = 1L << 60;

    final Graph<CappedEdge> g;

    final int[] prevNodes;
    final int[] prevEdges;
    final long[] minDist;
    final long[] potential;

    public PrimaryDual(Graph<CappedEdge> g) {
        this.g = g;
        prevNodes= new int[g.size()];
        prevEdges = new int[g.size()];
        minDist = new long[g.size()];
        potential = new long[g.size()];
    }

    public long doit(int source, int sink, int flow) {
        long res = 0;
        Arrays.fill(potential, 0);
        while (flow > 0) {
            DijkstraResult dres = dijkstra(source, potential);
            if (dres.minDist[sink] == INF) {
                return -1;
            }
            for (int i = 0; i < g.size(); i++) {
                potential[i] += dres.minDist[i];
            }
            long minFlow = flow;
            for (int v = sink; v != source; v = dres.prevNodes[v]) {
                minFlow = Math.min(minFlow, g.edges(dres.prevNodes[v]).get(dres.prevEdges[v]).cap());
            }
            flow -= minFlow;

            res += minFlow * potential[sink];
            for (int v = sink; v != source; v = dres.prevNodes[v]) {
                CappedEdge e = g.edges(dres.prevNodes[v]).get(dres.prevEdges[v]);
                e.addCap(-minFlow);
                e.rev().addCap(minFlow);
            }
        }
        return res;
    }

    private DijkstraResult dijkstra(int start, long[] potential) {
        Arrays.fill(minDist, INF);
        minDist[start] = 0;
        prevNodes[start] = prevEdges[start] = -1;

        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingLong(st -> st.cost));
        pq.add(new State(0, start));

        while (!pq.isEmpty()) {
            State st = pq.poll();
            List<? extends CappedEdge> es = g.edges(st.u);
            for (int i = 0; i < es.size(); i++) {
                CappedEdge e = es.get(i);
                if (e.cap() == 0 || st.cost > minDist[st.u]) {
                    continue;
                }
                long ncost = minDist[st.u] + e.cost() + potential[st.u] - potential[e.to()];
                if (minDist[e.to()] > ncost) {
                    minDist[e.to()] = ncost;
                    prevNodes[e.to()] = st.u;
                    prevEdges[e.to()] = i;
                    pq.add(new State(ncost, e.to()));
                }
            }
        }
        return new DijkstraResult(minDist, prevNodes, prevEdges);
    }

    private class State {
        final long cost;
        final int u;

        public State(long cost, int u) {
            this.cost = cost;
            this.u = u;
        }
    }

    private class DijkstraResult {
        public final long[] minDist;
        public final int[] prevNodes;
        public final int[] prevEdges;

        public DijkstraResult(long[] minDist, int[] prevNodes, int[] prevEdges) {
            this.minDist = minDist;
            this.prevNodes = prevNodes;
            this.prevEdges = prevEdges;
        }
    }
}

class CappedEdgeImpl implements CappedEdge {
    final int to;
    final long cost;

    private long cap;
    private CappedEdge rev;

    private CappedEdgeImpl(int to, long cost, long cap) {
        this.to = to;
        this.cost = cost;
        this.cap = cap;
    }

    public static class CappedEdgePair {
        public final CappedEdge normal;
        public final CappedEdge rev;

        public CappedEdgePair(CappedEdge normal, CappedEdge rev) {
            this.normal = normal;
            this.rev = rev;
        }
    }

    public static CappedEdgePair pairedEdges(int from, int to, long cap, long cost) {
        CappedEdgeImpl e = new CappedEdgeImpl(to, cost, cap);
        CappedEdgeImpl revE = new CappedEdgeImpl(from, -cost, 0);
        e.rev = revE;
        revE.rev = e;
        return new CappedEdgePair(e, revE);
    }

    @Override
    public int to() {
        return to;
    }

    @Override
    public long cost() {
        return cost;
    }

    @Override
    public long cap() {
        return cap;
    }

    @Override
    public CappedEdge rev() {
        return rev;
    }

    @Override
    public void addCap(long cap) {
        this.cap += cap;
    }
}

class SimpleEdge implements Edge {
    private final int to;

    public SimpleEdge(int to) {
        this.to = to;
    }

    @Override
    public int to() {
        return to;
    }

    @Override
    public long cost() {
        return 1;
    }
}


class Graph<E extends Edge> {
    private final int n;
    private final List<E>[] g;

    public static <E extends Edge> Graph<E> create(int n) {
        @SuppressWarnings("unchecked")
        ArrayList<E>[] l = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            l[i] = new ArrayList<>();
        }
        return new Graph<>(n, l);
    }

    public Graph(int n, List<E>[] g) {
        this.n = n;
        this.g = g;
    }

    public static Graph<SimpleEdge> createDirectionalTree(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("len(a) != len(b)");
        }
        int n = a.length + 1;
        Graph<SimpleEdge> g = create(n);
        for (int i = 0; i < n - 1; i++) {
            g.addDirectionalEdge(a[i], new SimpleEdge(b[i]));
        }
        return g;
    }

    public static Graph<SimpleEdge> createUndirectionalTree(int[] a, int[] b, boolean oneOrigin) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("len(a) != len(b)");
        }
        int n = a.length + 1;
        Graph<SimpleEdge> g = create(n);

        int adjust = oneOrigin ? 1 : 0;
        for (int i = 0; i < n - 1; i++) {
            g.addDirectionalEdge(a[i] - adjust, new SimpleEdge(b[i] - adjust));
            g.addDirectionalEdge(b[i] - adjust, new SimpleEdge(a[i] - adjust));
        }
        return g;
    }

    public void addDirectionalEdge(int u, E e) {
        g[u].add(e);
    }

    public List<E> edges(int u) {
        return g[u];
    }

    public int edgeNum(int u) {
        return g[u].size();
    }

    public int totalEndgeNum() {
        return Arrays.stream(g)
                .map(List::size)
                .reduce(0, Integer::sum) / 2;
    }

    public int size() {
        return n;
    }

    /**
     *
     * @param start
     * @return The cost of node v is:
     * <ul>
     *     <li>-(1L << 62) if a node is under negative loop</li>
     *     <li>(1L << 62) if there is no edge to v</li>
     *     <li>otherwise minimum cost from node u to a node</li>
     * </ul>
     */
    public long[] bellmanford(int start) {
        final long INF = 1L << 62;
        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int u = 0; u < n; u++) {
                for (Edge e : edges(u)) {
                    dist[e.to()] = Math.min(dist[e.to()], dist[u] + e.cost());
                }
            }
        }

        long[] res = Arrays.copyOf(dist, dist.length);
        for (int u = 0; u < n; u++) {
            for (Edge e : edges(u)) {
                int v = e.to();
                if (dist[u] + e.cost() < dist[v]) {
                    res[v] = -INF;
                }
            }
        }
        return res;
    }

    /**
     *
     * @param start
     * @return For each v, true if a node v can be arrived from start node, otherwise false.
     */
    public boolean[] canArrive(int start) {
        boolean[] res = new boolean[size()];
        canArriveInternal(start, res);
        return res;
    }

    private void canArriveInternal(int u, boolean[] visited) {
        visited[u] = true;
        for (Edge e : edges(u)) {
            if (visited[e.to()]) {
                continue;
            }
            canArriveInternal(e.to(), visited);
        }
    }

    public DiameterResult diameter() {
        if (totalEndgeNum() != n - 1) {
            throw new IllegalArgumentException("Graph should be tree");
        }
        int[] parents = new int[size()];
        int[] dist = new int[size()];
        Arrays.fill(dist, -1);
        dfs(0, dist, parents, 0);

        int x = 0;
        for (int i = 1; i < size(); i++) {
            if (dist[x] < dist[i]) {
                x = i;
            }
        }

        int[] dist2 = new int[size()];
        Arrays.fill(dist2, -1);
        parents[x] = x;
        dfs(x, dist2, parents, 0);

        int best = 0;
        for (int i = 0; i < n; i++) {
            if (dist2[best] < dist2[i]) {
                best = i;
            }
        }
        return new DiameterResult(restore(x, best, parents), dist2[best] + 1);
    }

    private int[] restore(int from, int to, int[] parents) {
        List<Integer> pathL = new ArrayList<>();
        int cur = to;
        while (cur != from) {
            pathL.add(cur);
            cur = parents[cur];
        }
        pathL.add(from);

        int[] res = new int[pathL.size()];
        for (int i = 0; i < pathL.size(); i++) {
            res[i] = pathL.get(pathL.size() - i - 1);
        }
        return res;
    }

    private void dfs(int u, int[] dist, int[] parent, int depth) {
        dist[u] = depth;
        for (Edge e : g[u]) {
            if (dist[e.to()] != -1) {
                continue;
            }
            parent[e.to()] = u;
            dfs(e.to(), dist, parent, depth + 1);
        }
    }

    public static class DiameterResult {
        public final int[] path;
        public final int dist;

        public DiameterResult(int[] path, int dist) {
            this.path = path;
            this.dist = dist;
        }

        @Override
        public String toString() {
            return "DiameterResult{" +
                    "path=" + Arrays.toString(path) +
                    ", dist=" + dist +
                    '}';
        }
    }

    /**
     * Assuming edge is SimpleEdge
     * @param start
     * @return
     */
    public int[] bfs(int start) {
        int n = g.length;
        int[] dist = new int[n];
        Arrays.fill(dist, 1 << 30);
        dist[start] = 0;

        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (Edge e : g[u]) {
                if (dist[e.to()] == 1 << 30) {
                    dist[e.to()] = dist[u] + 1;
                    q.add(e.to());
                }
            }
        }
        return dist;
    }
}

class EdgeImpl implements Edge {
    private final int to;
    private final long cost;

    public EdgeImpl(int to, long cost) {
        this.to = to;
        this.cost = cost;
    }

    @Override
    public int to() {
        return to;
    }

    @Override
    public long cost() {
        return cost;
    }
}

interface EdgeGenerator<E extends Edge> {
    E generate(int to, E originalEdge);
}

interface Edge {
    int to();

    long cost();
}

