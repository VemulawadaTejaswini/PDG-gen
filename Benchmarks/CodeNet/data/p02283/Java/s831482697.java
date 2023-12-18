import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    static Node root = null;

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        String input;
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < m; i++) {
            input = sc.nextLine();
            if (input.charAt(0) == 'i') {
                insert(new Node(Integer.parseInt(input.substring(7))));
            } else {
                print(sb, root);
            }
        }
        System.out.print(sb);
    }

    public static void insert(Node node) {
        Node parent = null;
        Node child = root;
        while (child != null) {
            parent = child;
            if (node.key < child.key) {
                child = child.left;
            } else {
                child = child.right;
            }
        }

        if (parent == null) {
            root = node;
        } else if (node.key < parent.key) {
            parent.left = node;
        } else {
            parent.right = node;
        }
    }

    public static void print(StringBuilder sb, Node root) {
        printInorder(sb, root);
        sb.append("\n");
        printPreorder(sb, root);
        sb.append("\n");
    }

    public static void printPreorder(StringBuilder sb, Node node) {
        if (node == null) return;
        sb.append(" ").append(node.key);
        printPreorder(sb, node.left);
        printPreorder(sb, node.right);
    }

    public static void printInorder(StringBuilder sb, Node node) {
        if (node == null) return;
        printInorder(sb, node.left);
        sb.append(" ").append(node.key);
        printInorder(sb, node.right);
    }
}

class Node {
    public int key;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}