
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;

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
            // use non recursive version to pass large data
            computeDownLink();
            computeUpLink();
        }

        private void computeDownLink() {
            // the process is strict dfs with postorder.
            // A quick way is to build dfs topology and process from backwards
            Stack<Integer> vertDfsStack = new Stack<Integer>();
            vertDfsStack.add(-1);
            vertDfsStack.add(0);
            int pos = 0;
            while (pos < vertDfsStack.size()) {
                int fromVert = vertDfsStack.get(pos);
                int vert = vertDfsStack.get(pos + 1);
                for (Edge e : vertEdges[vert]) {
                    int vertOther = e.otherVertex(vert);
                    if (vertOther != fromVert) {
                        vertDfsStack.add(vert);
                        vertDfsStack.add(vertOther);
                    }
                }
                pos = pos + 2;
            }

            // process from backwards
            while (!vertDfsStack.isEmpty()) {
                int vert = vertDfsStack.pop();
                int fromVert = vertDfsStack.pop();
                for (Edge e : vertEdges[vert]) {
                    int vertOther = e.otherVertex(vert);
                    if (vertOther == fromVert) {
                        continue;
                    }
                    // update height vert->vertOther
                    Map<Integer, Integer> map = heightMap.get(vert);
                    map.put(vertOther, e.weight + computeHeight(vertOther, vert));
                }
            }
        }

        private void computeUpLink() {
            // the process is strict dfs with inorder.
            // Maintaining a partial order suffices
            Stack<Integer> vertDfsStack = new Stack<Integer>();
            vertDfsStack.add(-1);
            vertDfsStack.add(0);
            while (!vertDfsStack.isEmpty()) {
                int vert = vertDfsStack.pop();
                int fromVert = vertDfsStack.pop();
                // first need to update height vert->fromVert
                Map<Integer, Integer> map = heightMap.get(vert);
                for (Edge e : vertEdges[vert]) {
                    int vertOther = e.otherVertex(vert);
                    if (vertOther == fromVert) {
                        map.put(fromVert, e.weight + computeHeight(fromVert, vert));
                    }
                }
                for (Edge e : vertEdges[vert]) {
                    int vertOther = e.otherVertex(vert);
                    if (vertOther != fromVert) {
                        vertDfsStack.add(vert);
                        vertDfsStack.add(vertOther);
                    }
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

        public int diameter() {
            int ret = 0;
            for (int vert = 0; vert < numNodes; vert++) {
                Map<Integer, Integer> map = heightMap.get(vert);
                int max1 = 0;
                int max2 = 0;
                for (Edge e : vertEdges[vert]) {
                    // invariant: max1 >= max2
                    int height = map.get(e.otherVertex(vert));
                    if (height >= max1) {
                        max2 = max1;
                        max1 = height;
                    } else if (height >= max2) {
                        max2 = height;
                    }
                }
                ret = Math.max(ret, max1 + max2);
            }
            return ret;
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
        System.out.println(tree.diameter());

    }
}