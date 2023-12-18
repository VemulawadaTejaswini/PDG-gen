
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = Integer.parseInt(scan.next());
        int e = Integer.parseInt(scan.next());
        List<Edge> edgeList = new ArrayList<Edge>(e);
        for (int i = 0; i < e; i++) {
            int s = Integer.parseInt(scan.next());
            int t = Integer.parseInt(scan.next());
            int w = Integer.parseInt(scan.next());
            edgeList.add(new Edge(s, t, w));
        }
        scan.close();

        Collections.sort(edgeList, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                if (o1.w != o2.w) {
                    return o1.w - o2.w;
                }
                if (o1.s != o2.s) {
                    return o1.s - o2.s;
                }
                return o1.t - o2.t;
            }
        });

        UnionFind uf = new UnionFind(v);
        long ans = 0;
        for (Edge edge : edgeList) {
            if (!uf.isSameParent(edge.s, edge.t)) {
                uf.union(edge.s, edge.t);
                ans += edge.w;
            }
        }

        System.out.println(ans);
    }

    static class Edge {
        int s;
        int t;
        int w;

        public Edge(int s, int t, int w) {
            this.s = s;
            this.t = t;
            this.w = w;
        }

    }

    static class UnionFind {
        int[] elements;

        public UnionFind(int elementsCount) {
            elements = new int[elementsCount];
            for (int i = 0; i < elementsCount; i++) {
                elements[i] = i;
            }
        }

        public void union(int x, int y) {
            elements[getParent(y)] = getParent(x);
        }

        public boolean isSameParent(int x, int y) {
            return getParent(x) == getParent(y);
        }

        public int getParent(int x) {
            int parent = elements[x];
            if (x != parent) {
                elements[x] = getParent(parent);
            }
            return elements[x];
        }
    }

}

