
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Main {

    static class Node {

        int id;
        Node parent;
        List<Node> children;

        public Node(int id) {
            children = new ArrayList<Node>();
            this.id = id;
        }

        public Node(int id, Node parent) {
            this.id = id;
            this.parent = parent;
            children = new ArrayList<Node>();
            if (parent != null) {
                parent.children.add(this);
            }
        }
    }

    static class TreeHelper {

        Node root;
        List<Node> nodeList;
        int n;

        public TreeHelper(int n) {
            nodeList = new ArrayList<Node>();
            for (int i = 0; i < n; i++) {
                nodeList.add(new Node(i));
            }
            root = nodeList.get(0);
            this.n = n;
        }

        public void createChild(int parentId, int[] children) {
            Node parent = nodeList.get(parentId);
            for (int childId : children) {
                Node child = nodeList.get(childId);
                parent.children.add(child);
                child.parent = parent;
            }
        }

        public Node getNodeAt(int idx) {
            return nodeList.get(idx);
        }
    }

    static class ReductionToRMQ {

        int[] euler;
        int[] level;
        int[] h;
        TreeHelper treeHelper;
        SegmentTree segTree;

        public ReductionToRMQ(TreeHelper treeHelper) {
            this.treeHelper = treeHelper;
            int n = treeHelper.n;
            euler = new int[2 * n - 1];
            level = new int[2 * n - 1];
            h = new int[n];
            int depth = 0;
            int visitIdx = 0;

            Stack<NodeWithIterator> dfsStack = new Stack<NodeWithIterator>();
            dfsStack.push(new NodeWithIterator(treeHelper.root));
            while (!dfsStack.isEmpty()) {
                Iterator<Node> it = dfsStack.peek().it;
                if (it.hasNext()) {
                    Node child = it.next();
                    dfsStack.push(new NodeWithIterator(child));
                    depth++;
                    visitIdx++;
                    euler[visitIdx] = child.id;
                    level[visitIdx] = depth;
                    h[child.id] = visitIdx;
                } else {
                    dfsStack.pop();
                    depth--;
                    if (!dfsStack.isEmpty()) {
                        visitIdx++;
                        euler[visitIdx] = dfsStack.peek().node.id;
                        level[visitIdx] = depth;
                    }
                }
            }
            segTree = new SegmentTree(level);
        }

        public Node lca(Node n1, Node n2) {
            int n1VisitIdx = h[n1.id];
            int n2VisitIdx = h[n2.id];
            int minIdx = segTree.query(n1VisitIdx, n2VisitIdx);
            int lcaIdx = euler[minIdx];
            return treeHelper.nodeList.get(lcaIdx);
        }

        class NodeWithIterator {

            final Node node;
            final Iterator<Node> it;

            public NodeWithIterator(Node node) {
                this.node = node;
                it = node.children.iterator();
            }
        }
    }

    public static class SegmentTree {

        int[] tree;
        int[] raw;
        int rawLen;

        public SegmentTree(int[] arr) {
            int len = Integer.highestOneBit(arr.length) << 2;
            tree = new int[len];
            raw = arr;
            rawLen = raw.length;
            initTree(1, 0, arr.length - 1);
        }

        /**
         * @param treeNodeIdx of tree[]
         * @param rangeBegin of raw[]
         * @param rangeEnd of raw[]
         */
        private void initTree(int treeNodeIdx, int rangeBegin, int rangeEnd) {
            if (rangeBegin == rangeEnd) {
                tree[treeNodeIdx] = raw[rangeBegin];
            } else {
                initTree(treeNodeIdx * 2, rangeBegin, (rangeEnd + rangeBegin) / 2);
                initTree(treeNodeIdx * 2 + 1, (rangeEnd + rangeBegin) / 2 + 1, rangeEnd);
                tree[treeNodeIdx] = tree[treeNodeIdx * 2] < tree[treeNodeIdx * 2 + 1] ? tree[treeNodeIdx * 2] : tree[treeNodeIdx * 2 + 1];
            }
        }

        /**
         * 
         * @param left
         * @param right
         * @return index not value
         */
        public int query(int left, int right) {
            return query(1, 0, rawLen - 1, left, right);
        }

        /**
         * Invariant: rangeBegin <= left <= right <= rangeEnd
         * @param treeNodeIdx treeNodeIdx of tree[]
         * @param rangeBegin
         * @param rangeEnd
         * @param left
         * @param right
         * @return index to raw array
         */
        private int query(int treeNodeIdx, int rangeBegin, int rangeEnd, int left, int right) {
            Integer leftResult = null;
            Integer rightResult = null;
            if (rangeBegin == rangeEnd) {
                return rangeBegin;
            }
            int rangeMid = (rangeBegin + rangeEnd) / 2;
            if (left <= rangeMid) {
                leftResult = query(treeNodeIdx * 2, rangeBegin, rangeMid, left, Math.min(right, rangeMid));
            }
            if (rangeMid + 1 <= right) {
                rightResult = query(treeNodeIdx * 2 + 1, rangeMid + 1, rangeEnd, Math.max(left, rangeMid + 1), right);
            }
            if (leftResult == null) {
                return rightResult;
            } else if (rightResult == null) {
                return leftResult;
            } else {
                return raw[leftResult] < raw[rightResult] ? leftResult : rightResult;
            }
        }

    }
        
    public static void main(String[] args) throws IOException {
        int n = nextInt();
        TreeHelper treeHelper = new TreeHelper(n);
        for (int parentIdx = 0; parentIdx < n; parentIdx++) {
            int childNum = nextInt();
            int[] children = new int[childNum];
            for (int childIdx = 0; childIdx < childNum; childIdx++) {
                children[childIdx] = nextInt();
            }
            treeHelper.createChild(parentIdx, children);
        }
        ReductionToRMQ rmqSolver = new ReductionToRMQ(treeHelper);

        int q = nextInt();
        while (q-- > 0) {
            int id1 = nextInt();
            int id2 = nextInt();
            out.println(rmqSolver.lca(treeHelper.getNodeAt(id1), treeHelper.getNodeAt(id2)).id);
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

}