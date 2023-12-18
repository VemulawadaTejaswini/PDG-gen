import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        Tree tree = new Tree();
        for (int i = 0; i < m; i++) {
            String cmd = scanner.next();
            if ("insert".equals(cmd)) {
                Node node = new Node(scanner.nextInt());
                if (tree.root == null) {
                    tree.root = node;
                    continue;
                }
                insert(tree.root, node);
            } else if ("delete".equals(cmd)) {
                Node node = find(tree.root, scanner.nextInt());
                if (node != null) {
                    delete(tree, node);
                }
            } else if ("find".equals(cmd)) {
                System.out.println(find(tree.root, scanner.nextInt()) != null ? "yes" : "no");
            } else {
                StringBuilder sb = new StringBuilder();
                tree.root.inOrder(sb);
                sb.append("\n");
                System.out.print(sb.toString());
                sb = new StringBuilder();
                tree.root.preOrder(sb);
                sb.append("\n");
                System.out.print(sb.toString());
            }
        }

    }

    private static Node find(Node node, int k) {
        while (node != null && node.key != k) {
            if (k < node.key) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return node;
    }

    private static void insert(Node root, Node node) {
        Node parent = root;
        while (true) {
            if (node.key < parent.key) {
                if (parent.left == null) {
                    parent.left = node;
                    node.parent = parent;
                    break;
                }
                parent = parent.left;
            } else {
                if (parent.right == null) {
                    parent.right = node;
                    node.parent = parent;
                    break;
                }
                parent = parent.right;
            }
        }
    }

    private static void delete(Tree tree, Node node) {
        if (node.left == null && node.right == null) {
            if (node.parent == null) {
                tree.root = null;
                return;
            }
            if (node.parent.left == node) {
                node.parent.left = null;
            } else {
                node.parent.right = null;
            }
        } else if (node.left == null || node.right == null) {
            if (node.left != null) {
                if (node.parent == null) {
                    tree.root = node.left;
                    node.left.parent = null;
                } else {
                    if (node.parent.left == node) {
                        node.parent.left = node.left;
                    } else {
                        node.parent.right = node.left;
                    }
                    node.left.parent = node.parent;
                }
            } else {
                if (node.parent == null) {
                    tree.root = node.right;
                    node.right.parent = null;
                } else {
                    if (node.parent.left == node) {
                        node.parent.left = node.right;
                    } else {
                        node.parent.right = node.right;
                    }
                    node.right.parent = node.parent;
                }
            }
        } else {
            Node next = node.right;
            while (next.left != null) {
                next = next.left;
            }
            node.key = next.key;
            delete(tree, next);
        }
    }

    private static class Tree {
        Node root;
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