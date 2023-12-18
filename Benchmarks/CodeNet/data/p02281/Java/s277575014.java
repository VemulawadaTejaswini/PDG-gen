import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 0; i < n; i++) {
            Node node = nodes[scanner.nextInt()];
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            if (left != -1) {
                node.left = nodes[left];
                nodes[left].parent = node;
            }
            if (right != -1) {
                node.right = nodes[right];
                nodes[right].parent = node;
            }
        }
        Node root = null;
        for (int i = 0; i < n; i++) {
            if (nodes[i].parent == null) {
                root = nodes[i];
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Preorder\n");
        root.preOrder(sb);
        sb.append("\n");
        sb.append("Inorder\n");
        root.inOrder(sb);
        sb.append("\n");
        sb.append("Postorder\n");
        root.postOrder(sb);
        System.out.println(sb.toString());
    }

    private static class Node {
        int id;
        Node parent;
        Node left;
        Node right;

        public Node(int id) {
            this.id = id;
        }

        private void preOrder(StringBuilder sb) {
            sb.append(" " + String.valueOf(id));
            if (left != null) {
                left.preOrder(sb);
            }
            if (right != null) {
                right.preOrder(sb);
            }
        }

        private void inOrder(StringBuilder sb) {
            if (left != null) {
                left.inOrder(sb);
            }
            sb.append(" " + String.valueOf(id));
            if (right != null) {
                right.inOrder(sb);
            }
        }

        private void postOrder(StringBuilder sb) {
            if (left != null) {
                left.postOrder(sb);
            }
            if (right != null) {
                right.postOrder(sb);
            }
            sb.append(" " + String.valueOf(id));
        }
    }
}