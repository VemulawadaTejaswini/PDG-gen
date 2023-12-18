import java.util.*;

public class Main {

    static class Edge implements Comparable<Edge> {
        int from, to, cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return cost - o.cost;
        }
    }

    static class UnionFind {
        int[] size;
        int[] id;

        public UnionFind(int n) {
            size = new int[n];
            id = new int[n];

            for (int i = 0; i < n; ++i) {
                size[i] = 1;
                id[i] = i;
            }
        }

        void unify(int p, int q) {
            int root1 = find(p);
            int root2 = find(q);

            if (size[root1] > size[root2]) {
                size[root1] += size[root2];
                id[root2] = root1;
            } else {
                size[root2] += size[root1];
                id[root1] = root2;
            }
        }

        int find(int p) {
            int root = p;
            while (root != id[root]) root = id[root];
            while (p != root) {
                int next = id[p];
                id[p] = root;
                p = next;
            }
            return root;
        }

        boolean connected(int p, int q) {
            return find(p) == find(q);
        }
    }

    static int kruskal() {
        int mstCost = 0;
        UnionFind uf = new UnionFind(N);
        PriorityQueue<Edge> pq = new PriorityQueue<>(edges);

        while (!pq.isEmpty()) {
            Edge e = pq.poll();
            if (uf.connected(e.from, e.to)) continue;

            uf.unify(e.from, e.to);
            mstCost += e.cost;
        }

        return mstCost;
    }

    static int N;
    static List<Edge> edges;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        edges = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                int cost = Integer.parseInt(sc.next());
                if (cost != -1)
                    edges.add(new Edge(i, j, cost));
            }

        }

        System.out.println(kruskal());
    }
}
