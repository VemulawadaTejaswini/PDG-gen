import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            Node r = null;
            while (sc.hasNext()) {
                String[] c_k = sc.nextLine().split(" ");
                if (c_k[0].equals("insert")) {
                    Node z = new Node(Integer.parseInt(c_k[1]));
                    r = insert(r, z);
                }
                if (c_k[0].equals("print")) {
                    printInorder(r);
                    System.out.println();
                    printPreorder(r);
                    System.out.println();
                }
            }
        } catch (NoSuchElementException
                | NumberFormatException e) {
            System.out.println(e);
        }
    }

    private static class Node {
        Node() {}
        Node(int key) {
            this.key = key;
        }
        int key = -1;
        Node parent, left, right;
    }

    private static Node insert(Node r, Node z) {
        Node y = null;
        Node x = r;
        while (x != null) {
            y = x;
            if (z.key < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        z.parent = y;

        if (y == null) {
            r = z;
        } else if (z.key < y.key) {
            y.left = z;
        } else {
            y.right = z;
        }
        return r;
    }

    private static void printPreorder(Node r) {
        System.out.printf(" %d", r.key);
        if (r.left != null) {
            printPreorder(r.left);
        }
        if (r.right != null) {
            printPreorder(r.right);
        }
    }

    private static void printInorder(Node r) {
        if (r.left != null) {
            printInorder(r.left);
        }
        System.out.printf(" %d", r.key);
        if (r.right != null) {
            printInorder(r.right);
        }
    }
}

