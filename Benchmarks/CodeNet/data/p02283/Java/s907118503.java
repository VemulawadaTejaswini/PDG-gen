import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static Node root;

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        IntStream.range(0, N).forEach(i -> {
            String cmd = sc.next();
            if (cmd.equals("insert")) {
                int id = sc.nextInt();
                insert(new Node(id));
            } else if(cmd.equals("print")) {
                print();
            }
        });
    }


    class Node {
        int id;
        Node parent = null, left = null, right = null;

        Node(int id) {
            this.id = id;
        }
    }

    private void insert(Node node) {
        Node parent = null;
        Node position = root;

        while(position != null) {
            parent = position;
            if(node.id < position.id) {
                position = position.left;
            } else {
                position = position.right;
            }
        }

        node.parent = parent;

        if (parent == null) {
            root = node;
        } else {
           if(node.id < parent.id) {
               parent.left = node;
           } else {
               parent.right = node;
           }
        }
    }

    private void print() {
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(" "  + node.id);
        preOrder(node.left);
        preOrder(node.right);
    }

    private void inOrder(Node node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(" " + node.id);
        inOrder(node.right);
    }
}

