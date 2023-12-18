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
            int k = scanner.nextInt();
            if (k > 0) {
                Node[] children = new Node[k];
                for (int j = 0; j < k; j++) {
                    children[j] = nodes[scanner.nextInt()];
                }
                node.setChildren(children);
            }
        }
        Node root = null;
        for (int i = 0; i < n; i++) {
            if (nodes[i].parent == null) {
                root = nodes[i];
                break;
            }
        }
        root.setDepth(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            sb.append("node " + String.valueOf(i) + ": parent = ");
            sb.append(node.parent == null ? "-1" : String.valueOf(node.parent.id));
            sb.append(", depth = " + String.valueOf(node.depth) + ", ");
            if (node.parent == null) {
                sb.append("root");
            } else if (node.children == null) {
                sb.append("leaf");
            } else {
                sb.append("internal node");
            }
            sb.append(", [");
            if (node.children != null) {
                for (int j = 0; j < node.children.length; j++) {
                    if (j > 0) {
                        sb.append(", ");
                    }
                    sb.append(node.children[j].id);
                }
            }
            sb.append("]\n");
        }
        System.out.print(sb.toString());
    }

    private static class Node {
        int id;
        Node parent;
        int depth;
        Node[] children;

        private Node(int id) {
            this.id = id;
        }

        private void setChildren(Node[] children) {
            this.children = children;
            for (Node node : children) {
                node.setParent(this);
            }
        }

        private void setParent(Node parent) {
            this.parent = parent;
        }

        private void setDepth(int depth) {
            this.depth = depth;
            if (this.children != null) {
                for (Node node : children) {
                    node.setDepth(depth + 1);
                }
            }
        }
    }

}