import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            String line = in.readLine();
            String[] split = line.split(" ");
            if (split[0].equals("insert")) {
                tree.insert(Integer.parseInt(split[1]));
            } else {
                System.out.println(tree.print());
            }
        }
    }
}

class Tree {
    Node root;

    private class Node {
        Node parent;
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
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

    public Tree() {
        root = null;
    }

    public void insert(int data) {
        Node y = null;
        Node x = root;
        Node z = new Node(data);
        while (x != null) {
            y = x;
            if (data < x.data) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        z.parent = y;

        if (y == null) {
            root = z;
        } else if (z.data < y.data) {
            y.left = z;
        } else {
            y.right = z;
        }
    }

    public String print() {
        return inorder() + "\n" + preorder();
    }

    public String preorder() {
        return root.preorder();
    }

    public String inorder() {
        return root.inorder();
    }
}

