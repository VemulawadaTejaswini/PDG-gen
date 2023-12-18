import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int k = sc.nextInt();
            int[] children = new int[k];
            for (int j = 0; j < k; j++) {
                children[j] = sc.nextInt();
            }
            nodes[id] = new Node(id, children);
        }

        solve(nodes);

        for (int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];
            String type = node.type == Type.INTERNAL_NODE ? "internal node" : node.type == Type.LEAF ? "leaf" : "root";
            System.out.println("node " + node.id + ": parent = " + node.parent + ", depth = " + node.depth + ", "
                               + type + ", " + Arrays.toString(node.children));
        }
    }

    private static void solve(Node[] nodes) {
        for (int i = 0; i < nodes.length; i++) {
            Node n = nodes[i];
            for (int j = 0; j < n.children.length; j++) {
                nodes[n.children[j]].parent = n.id;
            }
        }

        int root = -1;
        for (int i = 0; i < nodes.length; i++) {
            Node n = nodes[i];
            if (n.parent == -1) {
                root = n.id;
                n.type = Type.ROOT;
                n.depth = 0;
            }
        }

        rec(nodes, root, 1);
    }

    private static void rec(Node[] nodes, int parent, int depth) {
        int[] children = nodes[parent].children;
        for (int i = 0; i < children.length; i++) {
            Node child = nodes[children[i]];
            child.depth = depth;
            if (child.children.length != 0) {
                child.type = Type.INTERNAL_NODE;
                rec(nodes, child.id, depth + 1);
            } else {
                child.type = Type.LEAF;
            }
        }
    }

    static class Node {

        Node(int id, int[] children) {
            this.id = id;
            this.children = children;
            this.parent = -1;
        }

        int id;
        int parent;
        int depth;
        int[] children;
        Type type;
    }

    enum Type {
        ROOT, INTERNAL_NODE, LEAF;
    }
}