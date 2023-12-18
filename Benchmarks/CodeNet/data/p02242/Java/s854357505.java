import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    int[] distTo = null;
    int[] parentOf = null;

    public Main(ArrayList<ArrayList<Edge>> G){
        distTo = new int[G.size()];
        Arrays.fill(distTo, Integer.MAX_VALUE);
        parentOf = new int[G.size()];

        PriorityQueue<SDto> pq = new PriorityQueue<>();

        pq.add(new SDto(0, 0, -1));
        while (!pq.isEmpty()) {

            SDto optim = pq.poll();

            if (optim.d < distTo[optim.v]) {
                distTo[optim.v] = optim.d;
                parentOf[optim.v] = optim.from;
                for (Edge e : G.get(optim.v)) {
                    if (optim.from != e.v) { // prevent go back
                        pq.add(new SDto(e.v, distTo[optim.v] + e.c, optim.v));
                    }
                }

            }
        }

    }

    private static class SDto implements Comparable<SDto> { // Shortest distance to vertex
        int v, d, from;

        SDto(int v, int d, int from) {
            this.v = v;
            this.d = d;
            this.from = from;
        }

        @Override
        public int compareTo(SDto that) {
            if(this.d > that.d) return 1;
            else if(this.d < that.d) return -1;
            return 0;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<ArrayList<Edge>> G = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            G.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int u = in.nextInt();
            int k = in.nextInt();
            for (int j = 0; j < k; j++) {
                int v = in.nextInt(), c = in.nextInt();
                G.get(i).add(new Edge(v, c));
//                G.get(v).add(new Edge(i, c));
            }
        }

        Main dijkstra = new Main(G);

        for (int i = 0; i < G.size(); i++) {
            System.out.printf("%d %d\n", i, dijkstra.distTo[i]);
        }
    }
}

class Edge {
    int v, c;

    Edge(int v, int c) {
        this.v = v;
        this.c = c;
    }

    @Override
    public String toString() {
        return String.format("(v=%d, c=%d)", v, c);
    }
}
