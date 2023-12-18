import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] preorder = new int[n];
        int[] inorder = new int[n];
        for (int i = 0; i < n; i++) {
            preorder[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            inorder[i] = in.nextInt();
        }
        Tree tree = Tree.reconstructTree(preorder, inorder, 0, 0, n-1);
        System.out.println(tree.postorder().trim());
    }
}

class Tree {
    int id;
    Tree left;
    Tree right;

    public Tree(int id, Tree left, Tree right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }

    static Tree reconstructTree(int[] preorder, int[] inorder, int root, int left, int right) {
        if (left == right) {
            return new Tree(inorder[left], null, null);
        }

        int rootInorder = 0;
        while (inorder[rootInorder] != preorder[root]) {
            rootInorder++;
        }

        if (left == rootInorder) {
            return new Tree(preorder[root],
                    null,
                    reconstructTree(preorder, inorder, root+(rootInorder-left)+1, rootInorder + 1, right));
        } else if (right == rootInorder) {
            return new Tree(preorder[root],
                    reconstructTree(preorder, inorder, root+1, left, rootInorder - 1),
                    null);
        } else {
            return new Tree(preorder[root],
                    reconstructTree(preorder, inorder, root+1, left, rootInorder - 1),
                    reconstructTree(preorder, inorder, root+(rootInorder-left)+1, rootInorder + 1, right));
        }
    }

    boolean isLeaf() {
        return left == null && right == null;
    }

    String postorder() {
        if (isLeaf()) {
            return " " + id;
        } else if (left == null) {
            return right.postorder() + " " + id;
        } else if (right == null) {
            return left.postorder() + " " + id;
        } else {
            return left.postorder() + right.postorder() + " " + id;
        }
    }
}

