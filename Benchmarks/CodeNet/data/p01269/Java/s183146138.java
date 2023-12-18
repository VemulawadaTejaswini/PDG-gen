import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static long ans = 0, low = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt(), l = in.nextInt();
        while (n > 0) {
            Node[][] nodes = new Node[n][l + 1];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= l; j++) {
                    nodes[i][j] = new Node(i, j);
                }
            }
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1, b = in.nextInt() - 1;
                int d = in.nextInt(), e = in.nextInt();
                for (int j = 0; j <= l; j++) {
                    nodes[a][j].edges.add(new Edge(e, nodes[b][j]));
                    nodes[b][j].edges.add(new Edge(e, nodes[a][j]));
                }
                for (int j = 0; j <= l - d; j++) {
                    nodes[a][j].edges.add(new Edge(0, nodes[b][j + d]));
                    nodes[b][j].edges.add(new Edge(0, nodes[a][j + d]));
                }
            }

            PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparing(node -> node.distance));
            nodes[0][0].distance = 0;
            q.offer(nodes[0][0]);
            while (!q.isEmpty()) {
                Node node = q.poll();
                if (node.distance == Integer.MAX_VALUE) break;
                for (Edge edge : node.edges) {
                    Node next = edge.to;
                    long d = node.distance + edge.dist;
                    if (d < edge.to.distance) {
                        next.distance = d;
                        q.offer(next);
                    }
                }
            }
            long ans = Integer.MAX_VALUE;
            for (int i = 0; i <= l; i++) {
                ans = Math.min(ans, nodes[n - 1][i].distance);
            }
            out.println(ans);

            n = in.nextInt();
            m = in.nextInt();
            l = in.nextInt();
        }

        out.flush();
    }

    static class Node {
        long distance = Integer.MAX_VALUE;
        int index;
        int cost;
        List<Edge> edges = new ArrayList<>();

        Node(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }
    }

    static class Edge {
        int dist;
        Node to;

        Edge(int dist, Node to) {
            this.dist = dist;
            this.to = to;
        }
    }

}

