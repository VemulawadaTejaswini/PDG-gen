import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int V = in.nextInt(), E = in.nextInt(), r = in.nextInt();
        EdgeWeightedGraph G = new EdgeWeightedGraph(V);
        for (int i = 0; i < E; i++) {
            G.addEdge(new DEdge(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        BellmanFord bellman = new BellmanFord(G, r);
        if (bellman.hasNegativeCycle()) {
            System.out.println("NEGATIVE CYCLE");
        } else {
            for (int v = 0; v < G.V(); v++) {
                System.out.println(bellman.distTo(v));
            }
        }
    }
}

class BellmanFord {
    private static final double PINF = Double.POSITIVE_INFINITY;
    private static final double NINF = Double.NEGATIVE_INFINITY;

    private final double[] distTo;
    private boolean hasNegativeCycle;

    BellmanFord(EdgeWeightedGraph G, int r) {
        distTo = new double[G.V()];
        for (int v = 0; v < distTo.length; v++) {
            distTo[v] = v == r ? 0 : PINF;
        }
        for (int i = 0; i < G.V() - 1; i++) {
            for (DEdge e : G.edges()) {
                if (distTo[e.v] > distTo[e.u] + e.weight) {
                    distTo[e.v] = distTo[e.u] + e.weight;
                }
            }
        }
        for (DEdge e : G.edges()) {
            if (distTo[e.v] > distTo[e.u] + e.weight) {
                distTo[e.v] = NINF;
                hasNegativeCycle = true;
            }
        }
    }

    boolean hasNegativeCycle() {
        return hasNegativeCycle;
    }

    String distTo(int u) {
        return distTo[u] == PINF ? "INF" : String.valueOf((int) distTo[u]);
    }
}

class EdgeWeightedGraph {
    private final List<DEdge>[] adj;
    private int E;

    @SuppressWarnings("unchecked")
    EdgeWeightedGraph(int V) {
        adj = new List[V];
        for (int v = 0; v < adj.length; v++) {
            adj[v] = new ArrayList<>();
        }
    }

    int V() {
        return adj.length;
    }

    int E() {
        return E;
    }

    void addEdge(DEdge e) {
        adj[e.u].add(e);
        E++;
    }

    Iterable<DEdge> adj(int u) {
        return adj[u];
    }

    Iterable<DEdge> edges() {
        List<DEdge> edges = new ArrayList<>(E());
        for (int v = 0; v < V(); v++) {
            for (DEdge e : adj(v)) {
                edges.add(e);
            }
        }
        return edges;
    }
}

class DEdge {
    final int u, v, weight;

    DEdge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%d->%d(%d)", u, v, weight);
    }
}