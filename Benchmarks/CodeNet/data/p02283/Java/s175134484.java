import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int NIL = - 2 << 31 - 1;
    static int n;

    public static void main(String[] args) {
        n = sc.nextInt();

        BinaryTree bt = new BinaryTree();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            if (command.equals("insert")) {
                int z = sc.nextInt();
                bt.insert(z);
            } else if (command.equals("print")) {
                System.out.println(" " + bt.toStringInorder());
                System.out.println(" " + bt.toStringPreorder());
            }
        }
    }

    public static class BinaryTree {
        int node;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree() {
            node = NIL;
        }

        public boolean isEmpty() {
            return this.node == NIL;
        }

        public void insert(int z) {
            if (this.isEmpty()) {
                this.node = z;
                this.left = new BinaryTree();
                this.right = new BinaryTree();
                return;
            }

            if (z < this.node) {
                left.insert(z);
            } else {
                right.insert(z);
            }
        }

        public String toStringPreorder() {
            if (this.isEmpty()) return "";
            String l = " " + this.left.toStringPreorder();
            String r = " " + this.right.toStringPreorder();

            if (l.trim().equals("")) {
                l = "";
            }
            if (r.trim().equals("")) {
                r = "";
            }

            return this.node + l + r;
        }

        public String toStringInorder() {
            if (this.isEmpty()) return "";
            String l = this.left.toStringInorder() + " ";
            String r = " " + this.right.toStringInorder();

            return (l + this.node + r).trim();
        }
    }

}