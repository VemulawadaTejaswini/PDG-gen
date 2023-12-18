
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static class TopologicalSort_DFS {

        boolean hasCycle;
        LinkedList<Integer> sortedOrder;
        TreeSet<Integer> unmarkedV;
        int[] markStatus;
        final int MARK_TEMP = 1;
        final int MARK_PERM = 2;

        public TopologicalSort_DFS(WeightedDigraph graph) {
            markStatus = new int[graph.numVertex];
            unmarkedV = new TreeSet<Integer>();
            for (int v = 0; v < graph.numVertex; v++) {
                unmarkedV.add(v);
            }
            sortedOrder = new LinkedList<Integer>();

            try {
                while (!unmarkedV.isEmpty()) {
                    int v = unmarkedV.first();
                    dfs(v, graph);
                }
            } catch (Exception ex) {
                hasCycle = true;
                sortedOrder.clear();
            }
        }

        private void dfs(int vert, WeightedDigraph graph) throws Exception {
            if (markStatus[vert] == MARK_TEMP) {
                throw new Exception("cycle deteced v:" + vert);
            }
            if (unmarkedV.contains(vert)) {
                markStatus[vert] = MARK_TEMP;
                for (WeightedDigraph.Edge edge : graph.srcEdges[vert]) {
                    dfs(edge.targetVertex, graph);
                }
                unmarkedV.remove(vert);
                markStatus[vert] = 0;
                sortedOrder.addFirst(vert);
            }
        }

        public boolean hasCycle() {
            return hasCycle;
        }

        public Iterator<Integer> sortedOrder() {
            return sortedOrder.iterator();
        }
    }

    public static class WeightedDigraph {

        int numVertex;
        int numEdge;

        List<Edge>[] srcEdges;

        @SuppressWarnings("unchecked")
        public WeightedDigraph(int numV, int numE) {
            this.numVertex = numV;
            this.numEdge = numE;
            srcEdges = new List[numV];

            for (int i = 0; i < numV; i++) {
                srcEdges[i] = new ArrayList<Edge>();
            }
        }

        public void addEdge(int srcVertex, int targetVertex, int weight) {
            Edge e = new WeightedDigraph.Edge(srcVertex, targetVertex, weight);
            srcEdges[srcVertex].add(e);
        }

        public static class Edge {

            int srcVertex;
            int targetVertex;
            int weight;

            public Edge(int srcVertex, int targetVertex, int weight) {
                this.srcVertex = srcVertex;
                this.targetVertex = targetVertex;
                this.weight = weight;
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e = in.nextInt();
        WeightedDigraph graph = new WeightedDigraph(v, e);
        while (e-- > 0) {
            graph.addEdge(in.nextInt(), in.nextInt(), 1);
        }
        TopologicalSort_DFS topSort = new TopologicalSort_DFS(graph);
        Iterator<Integer> it = topSort.sortedOrder();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}