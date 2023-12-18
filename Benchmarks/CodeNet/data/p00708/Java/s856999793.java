
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(scan.next());
            if (n == 0) {
                scan.close();
                return;
            }

            List<Node> nodeList = new ArrayList<Node>();
            for (int i = 0; i < n; i++) {
                double x = Double.parseDouble(scan.next());
                double y = Double.parseDouble(scan.next());
                double z = Double.parseDouble(scan.next());
                double r = Double.parseDouble(scan.next());
                nodeList.add(new Node(i, x, y, z, r));
            }

            List<Edge> edgeList = new ArrayList<Edge>();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    edgeList.add(new Edge(nodeList.get(i), nodeList.get(j)));
                }
            }
            Collections.sort(edgeList);

            double ans = 0;
            UnionFind uf = new UnionFind(n);
            for (Edge edge : edgeList) {
                if (!uf.same(edge.n1.id, edge.n2.id) || edge.dist == 0) {
                    uf.unite(edge.n1.id, edge.n2.id);
                    ans += edge.dist;
                }
            }

            System.out.println(String.format("%.3f", ans));
        }
    }

    static class Node {
        int id;
        double x;
        double y;
        double z;
        double r;

        public Node(int id, double x, double y, double z, double r) {
            this.id = id;
            this.x = x;
            this.y = y;
            this.z = z;
            this.r = r;
        }
    }

    static class Edge implements Comparable<Edge> {
        Node n1;
        Node n2;
        double dist;

        public Edge(Node n1, Node n2) {
            this.n1 = n1;
            this.n2 = n2;

            double x = (n1.x - n2.x) * (n1.x - n2.x);
            double y = (n1.y - n2.y) * (n1.y - n2.y);
            double z = (n1.z - n2.z) * (n1.z - n2.z);
            double distance = Math.sqrt(x + y + z);
            dist = distance - n1.r - n2.r;
            if (dist < 0) {
                dist = 0;
            }
        }

        @Override
        public int compareTo(Edge o) {
            if (dist < o.dist) {
                return -1;
            } else if (dist > o.dist) {
                return 1;
            } else if (n1.id != o.n1.id) {
                return n1.id - o.n1.id;
            } else {
                return n2.id - o.n2.id;
            }
        }
    }

    static class UnionFind {

        /** ルートノード */
        private int[] roots;

        /**
         * コンストラクタ.
         *
         * @param n ノード数
         */
        public UnionFind(int n) {
            roots = new int[n];
            for (int i = 0; i < n; i++) {
                roots[i] = i;
            }
        }

        /**
         * 各々のノードが属するグループを結合する.
         *
         * @param x
         * @param y
         */
        public void unite(int x, int y) {
            roots[getRoot(y)] = getRoot(x);
        }

        /**
         * 各々のノードが属するグループが同じかどうかを判定する.
         *
         * @param x
         * @param y
         * @return 同じグループに属するならtrue
         */
        public boolean same(int x, int y) {
            return getRoot(x) == getRoot(y);
        }

        /**
         * ルートノードを返す.<br>
         * 再帰によって経路圧縮を行っている.
         *
         * @param x
         * @return ルートノード
         */
        public int getRoot(int x) {
            int parent = roots[x];
            if (x != parent) {
                roots[x] = getRoot(parent);
            }
            return roots[x];
        }

    }

}

