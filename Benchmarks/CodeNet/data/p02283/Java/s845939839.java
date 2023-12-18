import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    static Node root = null;
    static StringBuilder sb = new StringBuilder("");

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        String input;

        for (int i = 0; i < m; i++) {
            input = sc.nextLine();
            if (input.charAt(0) == 'i') {
                insert(new Node(Integer.parseInt(input.substring(7))));
            } else {
                print();
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

    public static void print() {
        printInorder(root);
        sb.append("\n");
        printPreorder(root);
        sb.append("\n");
    }

    public static void printPreorder(Node node) {
        if (node == null) return;
        sb.append(" ").append(node.key);
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void printInorder(Node node) {
        if (node == null) return;
        printInorder(node.left);
        sb.append(" ").append(node.key);
        printInorder(node.right);
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