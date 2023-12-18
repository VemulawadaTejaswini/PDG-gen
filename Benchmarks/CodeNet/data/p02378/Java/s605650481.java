import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static class FlowEdge {
        private static final double FLOATING_POINT_EPSILON = 1E-10;

        final int v;
        final int w;
        final double capacity;
        double flow;

        FlowEdge(int v, int w, double capacity) {
            this.v = v;
            this.w = w;
            this.capacity = capacity;
            this.flow = 0.;
        }

        public double residualCapacity(int vertex) {
            if      (vertex == v) return flow;              // backward edge
            else if (vertex == w) return capacity - flow;   // forward edge
            else throw new IllegalArgumentException("invalid endpoint");
        }

        public void addResidualFlow(int vertex, double delta) {
            if (!(delta >= 0.0)) throw new IllegalArgumentException("Delta must be nonnegative");

            if      (vertex == v) flow -= delta;           // backward edge
            else if (vertex == w) flow += delta;           // forward edge
            else throw new IllegalArgumentException("invalid endpoint");

            // round flow to 0 or capacity if within floating-point precision
            if (Math.abs(flow) <= FLOATING_POINT_EPSILON)
                flow = 0;
            if (Math.abs(flow - capacity) <= FLOATING_POINT_EPSILON)
                flow = capacity;

            if (!(flow >= 0.0))      throw new IllegalArgumentException("Flow is negative");
            if (!(flow <= capacity)) throw new IllegalArgumentException("Flow exceeds capacity");
        }

        public String toString() {
            return v + "->" + w + " " + flow + "/" + capacity;
        }

        public int other(int vertex) {
            if      (vertex == v) return w;
            else if (vertex == w) return v;
            else throw new IllegalArgumentException("invalid endpoint");
        }
    }

    @SuppressWarnings("unchecked")
    static class FlowNetwork {
        private static final String NEWLINE = "\n";
        private int E = 0;

        final int V;
        final LinkedList<FlowEdge>[] adj;

        FlowNetwork(int V) {
            this.V = V;
            this.adj = new LinkedList[V];
            for (int v = 0; v < V; v++){
                adj[v] = new LinkedList<>();
            }
        }

        void addEdge(FlowEdge edge) {
            adj[edge.v].add(edge);
            adj[edge.w].add(edge);
            E++;
        }

        public Iterable<FlowEdge> adj(int v) {
            return adj[v];
        }

        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append(V + " " + E + NEWLINE);
            for (int v = 0; v < V; v++) {
                s.append(v + ":  ");
                for (FlowEdge e : adj[v]) {
                    if (e.w != v) s.append(e + "  ");
                }
                s.append(NEWLINE);
            }
            return s.toString();
        }
    }

    static class FordFulkerson {
        private boolean[] marked;
        private FlowEdge[] edgeTo;
        double value;

        FordFulkerson(FlowNetwork G, int s, int t){
            value = 0.;
            while (hasAugmentingPath(G, s, t)) {

                // compute bottleneck capacity
                double bottle = Double.POSITIVE_INFINITY;
                for (int v = t; v != s; v = edgeTo[v].other(v)) {
                    bottle = Math.min(bottle, edgeTo[v].residualCapacity(v));
                }

                // augment flow
                for (int v = t; v != s; v = edgeTo[v].other(v)) {
                    edgeTo[v].addResidualFlow(v, bottle);
                }

                value += bottle;
            }
        }

        private boolean hasAugmentingPath(FlowNetwork G, int s, int t) {
            edgeTo = new FlowEdge[G.V];
            marked = new boolean[G.V];

            // breadth-first search
            Queue<Integer> queue = new LinkedList<>();
            queue.add(s);
            marked[s] = true;
            while (!queue.isEmpty() && !marked[t]) {
                int v = queue.poll();

                for (FlowEdge e : G.adj(v)) {
                    int w = e.other(v);

                    // if residual capacity from v to w
                    if (e.residualCapacity(w) > 0) {
                        if (!marked[w]) {
                            edgeTo[w] = e;
                            marked[w] = true;
                            queue.add(w);
                        }
                    }
                }
            }

            // is there an augmenting path?
            return marked[t];
        }

    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int E = scanner.nextInt();

        int V = X + Y + 2;
        FlowNetwork network = new FlowNetwork(V);

        // edges for X -> Y
        for (int e = 0; e < E; e++){
            int v = scanner.nextInt() + 1;
            int w = scanner.nextInt() + 1 + X;
            FlowEdge edge = new FlowEdge(v, w, 1);
            network.addEdge(edge);
        }

        // edges for s -> X
        for (int x = 0; x < X; x++){
            int v = 0;
            int w = x + 1;
            FlowEdge edge = new FlowEdge(v, w, 1);
            network.addEdge(edge);
        }

        // edges for Y -> t
        for (int y = 0; y < Y; y++){
            int v = y + 1 + X;
            int w = V - 1;
            FlowEdge edge = new FlowEdge(v, w, 1);
            network.addEdge(edge);
        }

        FordFulkerson ff = new FordFulkerson(network, 0, V - 1);

//        System.out.println(network.toString());

        System.out.println(String.format("%s", (int) ff.value));
    }
}

