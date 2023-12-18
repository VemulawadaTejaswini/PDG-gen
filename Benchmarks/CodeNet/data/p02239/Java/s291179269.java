import java.util.*;

public class Main {

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    static void bfs() {
        visited = new boolean[N];
        visited[0] = true;
        dist = new int[N];
        Arrays.fill(dist, -1);
        dist[0] = 0;
        Deque<Integer> deq = new ArrayDeque<>();
        deq.offer(0);

        while (!deq.isEmpty()) {
            Integer node = deq.poll();

            for (Edge e : graph.get(node)) {
                if (visited[e.to]) continue;
                dist[e.to] = dist[node] + 1;
                visited[e.to] = true;
                deq.offer(e.to);
            }
        }
    }

    static int N;
    static List<List<Edge>> graph;
    static boolean[] visited;
    static int[] dist;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        graph = new ArrayList<>();
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());

        for (int i = 0; i < N; ++i) {
            int id = Integer.parseInt(sc.next());
            int degree = Integer.parseInt(sc.next());
            for (int j = 0; j < degree; ++j) {
                int v = Integer.parseInt(sc.next());
                graph.get(i).add(new Edge(i, v-1));
            }
        }

        bfs();

        for (int i = 0; i < N; ++i) {
            System.out.println((i+1) + " " + dist[i]);
        }
    }
}
