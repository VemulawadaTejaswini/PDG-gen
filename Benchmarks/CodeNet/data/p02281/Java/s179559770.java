import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    static StringBuilder sb = new StringBuilder("");

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        boolean[] isRoot = new boolean[n];

        Arrays.fill(isRoot, true);

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (left != -1) {
                isRoot[left] = false;
            }
            if (right != -1) {
                isRoot[right] = false;
            }

            nodes[id] = new Node(id, left, right);
        }

        int root = 0;
        for (int i = 0; i < n; i++) {
            if (isRoot[i]) {
                root = i;
            }
        }

        sb.append("Preorder\n");
        printPreorder(nodes, root);

        sb.append("\nInorder\n");
        printInorder(nodes, root);

        sb.append("\nPostorder\n");
        printPostorder(nodes, root);

        System.out.println(sb);
    }

    public static void printPreorder(Node[] nodes, int root) {
        if (root == -1) return;

        sb.append(" ").append(root);
        printPreorder(nodes, nodes[root].left);
        printPreorder(nodes, nodes[root].right);
    }

    public static void printInorder(Node[] nodes, int root) {
        if (root == -1) return;

        printInorder(nodes, nodes[root].left);
        sb.append(" ").append(root);
        printInorder(nodes, nodes[root].right);
    }

    public static void printPostorder(Node[] nodes, int root) {
        if (root == -1) return;

        printPostorder(nodes, nodes[root].left);
        printPostorder(nodes, nodes[root].right);
        sb.append(" ").append(root);
    }
}

class Node {
    public int id;
    public int parent;
    public int left;
    public int right;

    public Node(int id, int left, int right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }
}