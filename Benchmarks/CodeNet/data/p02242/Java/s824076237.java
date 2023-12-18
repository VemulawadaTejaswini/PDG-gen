import java.util.*;

public class Main {

    public static class Edge {
        long cost;
        int from, to;

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    public static class Node {
        int id;
        long value;

        public Node(int id, long value) {
            this.id = id;
            this.value = value;
        }
    }

    private static int n;
    private static long[] dist;
    private static List<List<Edge>> graph;

    private static Comparator<Node> comparator = new Comparator<Node>() {
        @Override
        public int compare(Node node1, Node node2) {
            return (node1.value - node2.value) > 0 ? 1 : -1;
        }
    };

    public static void addEdge(int from, int to, int cost) {
        graph.get(from).add(new Edge(from, to, cost));
    }

    public static void dijkstra(int start) {
        dist = new long[n];
        Arrays.fill(dist, 100010);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(2 * n, comparator);
        pq.offer(new Node(start, 0));

        boolean[] visited = new boolean[n];

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            visited[node.id] = true;

            if (dist[node.id] < node.value) continue;

            List<Edge> edges = graph.get(node.id);
            for (int i = 0; i < edges.size(); ++i) {
                Edge edge = edges.get(i);

                if (visited[edge.to]) continue;;

                long newDist = dist[edge.from] + edge.cost;
                if (newDist < dist[edge.to]) {
                    dist[edge.to] = newDist;
                    pq.offer(new Node(edge.to, dist[edge.to]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) graph.add(new ArrayList<>());

        for (int i = 0; i < n; ++i) {
            int id = sc.nextInt();
            int degree = sc.nextInt();
            for (int j = 0; j < degree; ++j) {
                int v = sc.nextInt();
                int c = sc.nextInt();
                addEdge(id, v, c);
            }
        }

        dijkstra(0);

        for (int i = 0; i < n; ++i) {
            System.out.println(i + " " + dist[i]);
        }
    }
}
