
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static class Tree {

        List<Edge>[] vertEdges;
        List<Map<Integer, Integer>> heightMap;
        int numNodes;

        @SuppressWarnings("unchecked")
        public Tree(int n) {
            numNodes = n;
            heightMap = new ArrayList<Map<Integer, Integer>>();
            vertEdges = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                vertEdges[i] = new ArrayList<Edge>();
                heightMap.add(new HashMap<Integer, Integer>());
            }
        }

        class Edge {

            int v1;
            int v2;
            int weight;

            public Edge(int v1, int v2, int weight) {
                this.v1 = v1;
                this.v2 = v2;
                this.weight = weight;
            }

            public int otherVertex(int v) {
                return v1 == v ? v2 : v1;
            }

            public boolean equals(Object o) {
                if (o instanceof Edge) {
                    Edge edge = (Edge) o;
                    return ((v1 == edge.v1 && v2 == edge.v2) || (v1 == edge.v2 && v2 == edge.v1));
                }
                return false;
            }

        }

        public void addEdge(int n1, int n2, int weight) {
            Edge e = new Edge(n1, n2, weight);
            vertEdges[n1].add(e);
            vertEdges[n2].add(e);
        }

        public void compute() {
            // init heightMap according to existing edges
            for (int i = 0; i < numNodes; i++) {
                for (Edge e : vertEdges[i]) {
                    Map<Integer, Integer> map = heightMap.get(i);
                    map.put(e.otherVertex(i), 0);
                }

            }
            dfsComputeDownLink(0, -1);
            dfsComputeUpLink(0, -1);
        }

        private void dfsComputeDownLink(int vert, int fromVert) {
            for (Edge e : vertEdges[vert]) {
                int vertOther = e.otherVertex(vert);
                if (vertOther == fromVert) {
                    continue;
                }
                dfsComputeDownLink(vertOther, vert);
                // update height vert->vertOther
                Map<Integer, Integer> map = heightMap.get(vert);
                map.put(vertOther, e.weight + computeHeight(vertOther, vert));
            }
        }

        private void dfsComputeUpLink(int vert, int fromVert) {
            // first need to update height vert->fromVert
            Map<Integer, Integer> map = heightMap.get(vert);
            for (Edge e : vertEdges[vert]) {
                int vertOther = e.otherVertex(vert);
                if (vertOther == fromVert) {
                    map.put(fromVert, e.weight + computeHeight(fromVert, vert));
                }
            }
            // then recursively call children
            for (Edge e : vertEdges[vert]) {
                int vertOther = e.otherVertex(vert);
                if (vertOther != fromVert) {
                    dfsComputeUpLink(vertOther, vert);
                }
            }
        }

        private int computeHeight(int vert, int fromVert) {
            int ret = 0;
            Map<Integer, Integer> map = heightMap.get(vert);
            for (Entry<Integer, Integer> entry : map.entrySet()) {
                int vertOther = entry.getKey();
                if (vertOther != fromVert) {
                    ret = Math.max(ret, entry.getValue());
                }
            }

            return ret;
        }

        public int getHeight(int k) {
            return computeHeight(k, -1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Tree tree = new Tree(n);
        for (int i = 0; i < n - 1; i++) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            int weight = scanner.nextInt();
            tree.addEdge(s, t, weight);
        }
        tree.compute();
        for (int i = 0; i < n; i++) {
            System.out.println(tree.getHeight(i));
        }
    }
}