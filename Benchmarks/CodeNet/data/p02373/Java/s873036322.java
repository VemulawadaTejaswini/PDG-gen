
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    static class TarjanLCA {

        Node root;
        List<Node> nodeList;
        boolean[] checked;
        int[] ancestor;
        LinkedList<Query> queryList;
        LinkedList<Query>[] queryArray;
        int[] results;
        UnionFind uf;

        public TarjanLCA(int n) {
            queryList = new LinkedList<Query>();
            nodeList = new ArrayList<Node>();
            for (int i = 0; i < n; i++) {
                nodeList.add(new Node(i));
            }
            root = nodeList.get(0);
        }

        public void createChild(int parentId, int[] children) {
            Node parent = nodeList.get(parentId);
            for (int childId : children) {
                Node child = nodeList.get(childId);
                parent.children.add(child);
                child.parent = parent;
            }

        }

        public void addQuery(int node1, int node2) {
            Query query = new Query(node1, node2);
            queryList.add(query);
        }

        @SuppressWarnings("unchecked")
        public int[] computeAnswers() {
            results = new int[Query.nextOrder];
            checked = new boolean[nodeList.size()];
            uf = new UnionFind(nodeList.size());
            ancestor = new int[nodeList.size()];
            queryArray = new LinkedList[nodeList.size()];
            for (int i = 0; i < nodeList.size(); i++) {
                queryArray[i] = new LinkedList<Query>();
            }
            for (Query q : queryList) {
                queryArray[q.name1].add(q);
                if (q.name1 != q.name2) {
                    queryArray[q.name2].add(q);
                }
            }

            LCA(root);

            return results;
        }

        private void LCA(Node node) {
            int id = node.name;
            ancestor[id] = id;
            for (Node child : node.children) {
                LCA(child);
                int childId = child.name;
                uf.union(id, childId);
                ancestor[uf.find(childId)] = id;
            }
            checked[id] = true;

            ListIterator<Query> it = queryArray[id].listIterator();
            while (it.hasNext()) {
                Query q = it.next();
                int id1 = q.name1;
                int id2 = q.name2;
                if (checked[id1] && checked[id2]) {
                    it.remove();
                    int idd = (id1 == id ? id2 : id1);
//                    results[q.order] = nodeList.get(uf.find(idd)).name;
                    results[q.order] = nodeList.get(ancestor[uf.find(idd)]).name;
//                    System.out.println("!!!" + results[q.order]);
                }
            }

        }

        static class Query {

            final int name1;
            final int name2;
            int order;
            static int nextOrder = 0;

            public Query(int name1, int name2) {
                this.name1 = name1;
                this.name2 = name2;
                order = nextOrder++;
            }
        }

        static class Node {

            int name;
            Node parent;
            List<Node> children;

            public Node(int id) {
                children = new ArrayList<Node>();
                name = id;
            }

            public Node(int name, Node parent) {
                this.name = name;
                this.parent = parent;
                children = new ArrayList<Node>();
                if (parent != null) {
                    parent.children.add(this);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        TarjanLCA tarjan = new TarjanLCA(n);
        for (int parentIdx = 0; parentIdx < n; parentIdx++) {
            int childNum = nextInt();
            int[] children = new int[childNum];
            for (int childIdx = 0; childIdx < childNum; childIdx++) {
                children[childIdx] = nextInt();
            }
            tarjan.createChild(parentIdx, children);
        }
        int q = nextInt();
        while (q-- > 0) {
            int node1 = nextInt();
            int node2 = nextInt();
            tarjan.addQuery(node1, node2);
        }
        for (int lca : tarjan.computeAnswers()) {
            out.println(lca);
        }
        out.flush();
    }

    private static final StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static String nextString() throws IOException {
        in.nextToken();
        return in.sval;
    }

    public static class UnionFind {

        int[] id;
        int count;
        int[] weight;  // size indexed by root id

        public UnionFind(int n) {
            id = new int[n];
            weight = new int[n];
            count = n;
            for (int idx = 0; idx < id.length; idx++) {
                id[idx] = idx;
                weight[idx] = 1;
            }
        }

        public void union(int p, int q) {
            int pRoot = find(p);
            int qRoot = find(q);
            if (pRoot == qRoot) {
                return;
            }
            // make smaller root point to larger one
            if (weight[pRoot] < weight[qRoot]) {
                id[pRoot] = qRoot;
                weight[qRoot] += weight[pRoot];
            } else {
                id[qRoot] = pRoot;
                weight[pRoot] += weight[qRoot];
            }
            count--;
        }

        // path compression
        public int find(int p) {
            if (id[p] != p) {
                id[p] = find(id[p]);
            }
            return id[p];
        }

        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }

        public int count() {
            return count;
        }
    }
}