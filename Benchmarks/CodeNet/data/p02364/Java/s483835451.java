import java.util.*;

public class Main {
    int n, m;
    ArrayList<ArrayList<Edge>> edges;

    public static void main(String[] args) {
        Main p = new Main();
        p.read();
        p.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        edges = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int src = sc.nextInt();
            int trg = sc.nextInt();
            int cost = sc.nextInt();
            edges.get(src).add(new Edge(trg, cost));
            edges.get(trg).add(new Edge(src, cost));
        }
    }

    void solve() {
        boolean[] tree = new boolean[n];
        long ans = 0L;
        PriorityQueue<Edge> queue = new PriorityQueue<>(new Comparator<Edge>() {
            @Override
            public int compare(Edge edge, Edge t1) {
                return Integer.compare(edge.cost, t1.cost);
            }
        });
        tree[0] = true;
        for (Edge e: edges.get(0)) {
            queue.add(e);
        }
        while (!queue.isEmpty()) {
            Edge e = queue.poll();
            if (tree[e.to])
                continue;
            ans += e.cost;
            tree[e.to] = true;
            for (Edge _e: edges.get(e.to)) {
                if (!tree[_e.to])
                    queue.add(_e);
            }
        }
        System.out.println(ans);
    }
}

class Edge {
    int to, cost;
    Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}