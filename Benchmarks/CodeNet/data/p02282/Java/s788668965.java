import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    static StringBuilder sb = new StringBuilder("");
    static int index = 0;

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] preorder = new int[n];
        int[] inorder = new int[n];
        for (int i = 0; i < n; i++) {
            preorder[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }
        Node[] nodes = new Node[n];
        reconstruct(nodes, preorder, inorder, 0, n);
        System.out.println(sb);
    }

    public static int reconstruct(Node[] nodes, int[] preorder, int[] inorder, int right, int left) {
        if (left == right) return -1;

        // find root
        int root = 0;
        outside: for (int i = 0; i < preorder.length; i++) {
            for (int j = right; j < left; j++) {
                if (preorder[i] == inorder[j]) {
                    root = j;
                    break outside;
                }
            }
        }
        System.out.println(index);

        int tempIndex = index;
        index++;

        nodes[tempIndex] = new Node(inorder[root], -1, -1);
        nodes[tempIndex].left = reconstruct(nodes, preorder, inorder, right, root);
        nodes[tempIndex].right = reconstruct(nodes, preorder, inorder, root + 1, left);

        sb.append(" ").append(nodes[tempIndex].id);

        return tempIndex;
    }
}

class Node {
    public int id;
    public int left;
    public int right;

    public Node(int id, int left, int right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }
}