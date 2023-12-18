import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        Node root = null;
        for (int i = 0; i < m; i++) {
            String cmd = scanner.next();
            if ("insert".equals(cmd)) {
                Node node = new Node(scanner.nextInt());
                if (root == null) {
                    root = node;
                    continue;
                }
                insert(root, node);
            } else if ("find".equals(cmd)) {
                System.out.println(doesContain(root, scanner.nextInt())? "yes" : "no");
            } else {
                StringBuilder sb = new StringBuilder();
                root.inOrder(sb);
                sb.append("\n");
                System.out.print(sb.toString());
                sb = new StringBuilder();
                root.preOrder(sb);
                sb.append("\n");
                System.out.print(sb.toString());
            }
        }

    }

    private static boolean doesContain(Node node, int k) {
        while (node != null && node.key != k) {
            if (k < node.key) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return node != null;
    }

    private static void insert(Node root, Node node) {
        Node parent = root;
        while (true) {
            if (node.key < parent.key) {
                if (parent.left == null) {
                    parent.left = node;
                    break;
                }
                parent = parent.left;
            } else {
                if (parent.right == null) {
                    parent.right = node;
                    break;
                }
                parent = parent.right;
            }
        }
    }

    private static class Node {
        int key;
        Node parent;
        Node left;
        Node right;

        private Node(int key) {
            this.key = key;
        }

        private void inOrder(StringBuilder sb) {
            if (left != null) {
                left.inOrder(sb);
            }
            sb.append(" " + String.valueOf(key));
            if (right != null) {
                right.inOrder(sb);
            }
        }

        private void preOrder(StringBuilder sb) {
            sb.append(" " + String.valueOf(key));
            if (left != null) {
                left.preOrder(sb);
            }
            if (right != null) {
                right.preOrder(sb);
            }
        }
    }
}