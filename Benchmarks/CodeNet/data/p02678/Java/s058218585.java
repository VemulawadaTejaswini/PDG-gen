import java.util.*;

public class DoubleDots {


    private static int[] solve(Graph graph) {
        int n = graph.getSize();
        int[] dist = new int[n + 1];
        int[] parent = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        parent[1] = 0;
        Queue<Integer> pq = new LinkedList<>();
        pq.offer(1);
        while (!pq.isEmpty()) {
            Integer node = pq.poll();
            visited[node] = true;
            List<Node> childNodes = graph.getAdjacentList(node);
            for (Node child : childNodes) {
                if (visited[child.end])
                    continue;
                int newDist = dist[node] + child.weight;
                if (dist[child.end] > newDist) {
                    dist[child.end] = newDist;
                    pq.offer(child.end);
                    parent[child.end] = child.start;
                }
            }
        }
        return parent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        Graph graph = new Graph(N);
        for (int i = 0; i < M; i++) {
            int start = Integer.parseInt(sc.next());
            int end = Integer.parseInt(sc.next());
            graph.addEdge(start, end);
        }
        int[] res = solve(graph);
        for (int i = 2; i <= N; i++) {
            if(res[i] == Integer.MAX_VALUE){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for (int i = 2; i <= N; i++) {
            System.out.println(res[i]);
        }
    }

    static class Graph {

        private final Map<Integer, List<Node>> adjacentList = new HashMap<>();

        Graph(int capacity) {
            for (int i = 1; i <= capacity; i++) {
                adjacentList.put(i, new LinkedList<>());
            }
        }


        public void addEdge(int start, int end) {
            adjacentList.get(start).add(new Node(start, end));
            adjacentList.get(end).add(new Node(end, start));
        }

        public List<Node> getAdjacentList(int node) {
            return adjacentList.get(node);
        }

        public int getSize() {
            return adjacentList.size();
        }
    }

    static class Node {
        int start;
        int end;
        int weight = 1;

        Node(int s, int e) {
            this.start = s;
            this.end = e;
        }
    }
}
