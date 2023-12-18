import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        scanner.nextLine();

        Kruskal kruskal = new Kruskal(V);
        for (int i = 0; i < E; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            kruskal.addEdge(e[0], e[1], e[2]);
        }

        List<Edge> usedEdges = kruskal.run();
        System.out.println(usedEdges.stream().mapToLong(x -> x.cost).sum());
    }
}

class UnionFindTree {
    int size;
    int[] par;
    int[] rank;

    public UnionFindTree(int size) {
        this.size = size;
        par = new int[size];
        for (int i = 0; i < size; i++) {
            par[i] = i;
        }
        rank = new int[size];
        Arrays.fill(rank, 1);
    }

    private int root(int x) {
        if (x == par[x]) {
            return x;
        }
        int root = root(par[x]);
        par[x] = root;
        return root;
    }

    public boolean same(int x, int y) {
        return root(x) == root(y);
    }

    public void merge(int x, int y) {
        int xr = root(x);
        int yr = root(y);
        if (rank[xr] < rank[yr]) {
            par[xr] = yr;
        } else {
            par[yr] = xr;
            if (rank[xr] == rank[yr]) {
                rank[xr]++;
            }
        }
    }

}

class Kruskal {
    private int size;
    Queue<Edge> edges;
    UnionFindTree uft;

    public Kruskal(int size) {
        this.size = size;
        edges = new PriorityQueue<>(Comparator.comparingInt(x -> x.cost));
        uft = new UnionFindTree(size);
    }

    public void addEdge(int from, int to, int cost) {
        edges.add(new Edge(from, to, cost));
    }

    public List<Edge> run() {
        List<Edge> usedEdges = new ArrayList<>();
        while (!edges.isEmpty()) {
            Edge e = edges.poll();
            if (uft.same(e.from, e.to)) {
                continue;
            }
            uft.merge(e.from, e.to);
            usedEdges.add(e);
        }
        return usedEdges;
    }

}


class Edge {
    public final int from;
    public final int to;
    public final int cost;

    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return from == edge.from &&
                to == edge.to &&
                cost == edge.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, cost);
    }
}

