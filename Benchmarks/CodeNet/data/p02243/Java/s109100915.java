import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    private static final int MAX_N = 10000;
    private static final int INF = (1 << 20);
    private static final int WHITE = 0;
    private static final int GRAY = 1;
    private static final int BLACK = 2;

    private static int n;
    private static Vector<E>[] adj;


    public static void main(String[] args){
        initialzie();
        efficient_dijkstra();
    }

    static class E implements Comparable<E>{
        int vertex;
        int edge;

        public E(int vertex, int edge) {
            this.vertex = vertex;
            this.edge = edge;
        }

        @Override
        public int compareTo(E o) {
            return this.edge - o.edge;
        }
    }

    private static void efficient_dijkstra() {
        // init
        int[] d = new int[MAX_N];
        int[] color = new int[MAX_N];
        PriorityQueue<E> PQ = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            d[i] = INF;
            color[i] = WHITE;
        }

        // start with first vertex
        d[0] = 0;
        color[0] = GRAY;
        PQ.add(new E(0, 0));

        while (!PQ.isEmpty()){
            E minPQ = PQ.poll();
            int u = minPQ.vertex;
            color[u] = BLACK;

            if (d[u] < minPQ.edge)
                continue;

            for (int i = 0; i < adj[u].size(); i++) {
                int v = adj[u].get(i).vertex;
                int c = adj[u].get(i).edge;

                if (color[v] == BLACK)
                    continue;

                if (d[v] > d[u] + c){
                    d[v] = d[u] + c;
                    PQ.add(new E(v, c));
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

    private static void initialzie() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        adj = new Vector[MAX_N];

        for (int i = 0; i < n; i++) {
            adj[i] = new Vector<>();

            int u = scanner.nextInt();
            int k = scanner.nextInt();
            for (int j = 0; j < k; j++) {
                int v = scanner.nextInt();
                int c = scanner.nextInt();

                adj[u].add(new E(v, c));
            }
        }
    }

}