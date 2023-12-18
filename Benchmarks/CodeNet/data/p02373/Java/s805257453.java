
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
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

    public static Node lowestCommonAncestor(TreeHelper treeHelper, int id1, int id2) {
        List<Node> pAncestors = new ArrayList<Node>();
        List<Node> qAncestors = new ArrayList<Node>();
        Stack<Node> ancestors = new Stack<Node>();
        Stack<Node> dfsStack = new Stack<Node>();
        dfsStack.push(treeHelper.root);

        Node p = treeHelper.getNodeAt(id1);
        Node q = treeHelper.getNodeAt(id2);
        if (p == null || q == null) {
            return null;
        }
        while (p != null || q != null) {  // when p or q is found, they are set to null
            if (dfsStack.isEmpty()) {
                break;
            }
            Node current = dfsStack.peek();
            if (ancestors.isEmpty() || ancestors.peek() != current) {
                // current not expanded
                for (Node child : current.children) {
                    dfsStack.push(child);
                }
                ancestors.push(current);
            } else {
                if (p == current) {
                    pAncestors.addAll(ancestors);
                    p = null;
                }
                if (q == current) {
                    // q and p cannot match same node
                    qAncestors.addAll(ancestors);
                    q = null;
                }
                dfsStack.pop();
                ancestors.pop();
            }
        }

        for (int i = 0; i < pAncestors.size(); i++) {
            if (i + 1 < pAncestors.size() && i + 1 < qAncestors.size()
                    && qAncestors.get(i + 1) == pAncestors.get(i + 1)) {
                continue;
            } else {
                return pAncestors.get(i);
            }
        }
        // should not reach here
        return null;

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
        int q = nextInt();
        while (q-- > 0) {
            int node1 = nextInt();
            int node2 = nextInt();
            out.println(lowestCommonAncestor(treeHelper, node1, node2).id);
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