
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static Queue<Node> queue = new PriorityQueue<Node>(new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
            return o1.dist - o2.dist;
        }
    });

    private static List<Node> nodeList = new ArrayList<Node>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = Integer.parseInt(scan.next());
        int e = Integer.parseInt(scan.next());
        int r = Integer.parseInt(scan.next());

        List<List<Edge>> edgeList = new ArrayList<List<Edge>>();
        for (int i = 0; i < v; i++) {
            List<Edge> list = new ArrayList<Edge>();
            edgeList.add(list);
        }

        for (int i = 0; i < e; i++) {
            int s = Integer.parseInt(scan.next());
            int t = Integer.parseInt(scan.next());
            int d = Integer.parseInt(scan.next());
            edgeList.get(s).add(new Edge(s, t, d));
        }
        scan.close();

        for (int i = 0; i < v; i++) {
            nodeList.add(new Node(i, Integer.MAX_VALUE));
        }

        addNode(nodeList.get(r), 0);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (Edge edge : edgeList.get(node.id)) {
                addNode(nodeList.get(edge.t), node.dist + edge.d);
            }
        }

        for (Node node : nodeList) {
            if (node.dist != Integer.MAX_VALUE) {
                System.out.println(node.dist);
            } else {
                System.out.println("INF");
            }
        }

    }

    private static void addNode(Node node, int newDist) {
        if (node.dist <= newDist) {
            return;
        }

        node.dist = newDist;
        queue.add(node);
    }

    static class Edge {
        int s;
        int t;
        int d;

        public Edge(int s, int t, int d) {
            this.s = s;
            this.t = t;
            this.d = d;
        }
    }

    static class Node {
        int id;
        int dist;

        public Node(int id, int dist) {
            this.id = id;
            this.dist = dist;
        }
    }

}

