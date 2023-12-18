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
        int R = scanner.nextInt();
        scanner.nextLine();

        BellmanFord bellmanFord = new BellmanFord(V);
        for (int i = 0; i < E; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            bellmanFord.addEdge(e[0], e[1], e[2]);
        }

        bellmanFord.run(R);
        for (int i = 0; i < V; i++) {
            if (bellmanFord.dist[i] == Long.MIN_VALUE) {
                System.out.println("NEGATIVE CYCLE");
                return;
            }
        }
        for (int i = 0; i < V; i++) {
            if (bellmanFord.dist[i] == Long.MAX_VALUE / 2)
                System.out.println("INF");
            else
                System.out.println(bellmanFord.dist[i]);
        }
    }
}

class BellmanFord {

    private int size;
    public long[] dist;
    public long[] from;
    public List<Edge> edges;

    public BellmanFord(int size) {
        this.size = size;
        dist = new long[size];
        Arrays.fill(dist, Long.MAX_VALUE / 2);
        from = new long[size];
        Arrays.fill(from, -1);
        edges = new ArrayList<>();
    }

    public void addEdge(int from, int to, int cost) {
        edges.add(new Edge(from, to, cost));
    }

    public void run(int start) {
        dist[start] = 0;
        for (int i = 0; i < size; i++) {
            boolean updated = false;
            for (Edge e : edges) {
                if (dist[e.from] != Long.MAX_VALUE / 2
                        && dist[e.to] > dist[e.from] + e.cost) {
                    dist[e.to] = dist[e.from] + e.cost;
                    from[e.to] = e.from;
                    updated = true;
                }
            }
            // found loops. update all nodes in loops with Long.MIN_VALUE
            if (i == size - 1 && updated) {
                for (int j = 0; j < size; j++) {
                    for (Edge e : edges) {
                        if (dist[e.from] == Long.MIN_VALUE || dist[e.to] > dist[e.from] + e.cost) {
                            dist[e.to] = Long.MIN_VALUE;
                        }
                    }
                }
            }
        }
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

