import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Treap treap = new Treap();
        for (int i = 0; i < n; i++) {
            String line = in.readLine();
            String[] split = line.split(" ");
            switch (split[0]) {
                case "insert":
                    treap.insert(Integer.parseInt(split[1]), Integer.parseInt(split[2]));
                    break;
                case "find":
                    if (treap.find(Integer.parseInt(split[1]))) {
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                    break;
                case "delete":
                    treap.delete(Integer.parseInt(split[1]));
                    break;
                default:
                    System.out.println(treap.print());
                    break;
            }
        }
    }
}

class Treap {
    private Treap.Node root;

    static class Node {
        Node parent;
        Node left;
        Node right;
        int data;
        int priority;

        private Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
            parent = null;
            left = null;
            right = null;
        }

        boolean isLeaf() {
            return left == null && right == null;
        }

        String preorder() {
            if (isLeaf()) {
                return " " + data;
            } else if (left == null) {
                return " " + data + right.preorder();
            } else if (right == null) {
                return " " + data + left.preorder();
            } else {
                return " " + data + left.preorder() + right.preorder();
            }
        }

        String inorder() {
            if (isLeaf()) {
                return " " + data;
            } else if (left == null) {
                return " " + data + right.inorder();
            } else if (right == null) {
                return left.inorder() + " " + data;
            } else {
                return left.inorder() + " " + data + right.inorder();
            }
        }
    }

    Treap() {
        root = null;
    }

    void insert(int data, int priority) {
        root = insertHelper(root, data, priority);
    }

    private Node insertHelper(Node node, int data, int priority) {
        if (node == null) {
            return new Node(data, priority);
        }

        if (data == node.data) {
            return node;
        }

        if (data < node.data) {
            node.left = insertHelper(node.left, data, priority);
            if (node.priority < node.left.priority) {
                node = rotateRight(node);
            }
        }
        else {
            node.right = insertHelper(node.right, data, priority);
            if (node.priority < node.right.priority) {
                node = rotateLeft(node);
            }
        }
        return node;
    }

    private Node rotateLeft(Node node) {
        Node s = node.right;
        node.right = s.left;
        s.left = node;
        return s;
    }

    private Node rotateRight(Node node) {
        Node s = node.left;
        node.left = s.right;
        s.right = node;
        return s;
    }

    boolean find(int data) {
        Node node = root;
        while (node != null) {
            if (node.data == data) {
                return true;
            }

            if (data < node.data) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return false;
    }

    void delete(int data) {
        root = deleteHelper1(root, data);
    }

    private Node deleteHelper1(Node node, int data) {
        if (node == null) {
            return null;
        }

        if (data < node.data) {
            node.left = deleteHelper1(node.left, data);
        } else if (data > node.data) {
            node.right = deleteHelper1(node.right, data);
        } else {
            return deleteHelper2(node, data);
        }

        return node;
    }

    private Node deleteHelper2(Node node, int data) {
        if (node.isLeaf()) {
            return null;
        } else if (node.left == null) {
            node = rotateLeft(node);
        } else if (node.right == null) {
            node = rotateRight(node);
        } else {
            if (node.left.priority > node.right.priority) {
                node = rotateRight(node);
            } else {
                node = rotateLeft(node);
            }
        }

        return deleteHelper1(node, data);
    }

    String print() {
        return inorder() + "\n" + preorder();
    }

    private String preorder() {
        return root.preorder();
    }

    private String inorder() {
        return root.inorder();
    }
}
