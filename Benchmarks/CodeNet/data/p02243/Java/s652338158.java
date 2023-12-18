import java.util.*;

public class Main {
    private static final int MAX_N = 10000;
    private static final int INF = (1 << 20);
    private static final int WHITE = 0;
    private static final int GRAY = 1;
    private static final int BLACK = 2;

    private static int n;
//    private static Vector<Edge>[] adj = new Vector[MAX_N];
    private static ArrayList<List<Edge>> adj = new ArrayList<List<Edge>>();


    public static void main(String[] args){
        initialize();
        efficient_dijkstra();
    }

    static class Edge implements Comparable<Edge>{
        int vertex;
        int edge;



        public Edge(int vertex, int edge) {
            this.vertex = vertex;
            this.edge = edge;
        }

        @Override
        public int compareTo(Edge o) {
            return this.edge - o.edge;
        }
    }

    private static void efficient_dijkstra() {
        // init
        int[] d = new int[MAX_N];
        int[] color = new int[MAX_N];
        PriorityQueue<Edge> PQ = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            d[i] = INF;
            color[i] = WHITE;
        }

        // start with first vertex
        d[0] = 0;
        color[0] = GRAY;
        PQ.add(new Edge(0, 0));

        while (!PQ.isEmpty()){
            Edge minPQ = PQ.poll();
            int u = minPQ.vertex;
            color[u] = BLACK;

            if (d[u] < minPQ.edge)
                continue;

            for (int i = 0; i < adj.get(u).size(); i++) {
                int v = adj.get(u).get(i).vertex;
                int c = adj.get(u).get(i).edge;

                if (color[v] == BLACK)
                    continue;

                if (d[v] > d[u] + c){
                    d[v] = d[u] + c;
                    PQ.add(new Edge(v, c));
                    color[v] = GRAY;
                }
            }
        }


        for (int i = 0; i < n; i++) {
            System.out.println(
                    i + " " + (d[i] == INF ? -1 : d[i])
            );
        }

    }


    private static void initialize() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Edge>());

            int u = scanner.nextInt();
            int k = scanner.nextInt();
            for (int j = 0; j < k; j++) {
                int v = scanner.nextInt();
                int c = scanner.nextInt();

                adj.get(u).add(new Edge(v, c));
            }
        }
    }

}