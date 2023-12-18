import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Node {
    Integer p, l, r;

    public Node(){}
}

public class Main {

    int n;
    Node[] nodes;
    List<Integer> preorderList = new ArrayList<>();
    List<Integer> inorderList = new ArrayList<>();
    List<Integer> postorderList = new ArrayList<>();

    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l != -1) {
                nodes[id].l = l;
                nodes[l].p = id;
            }

            if (r != -1) {
                nodes[id].r = r;
                nodes[r].p = id;
            }
        }

        System.out.println("Preorder");
        int rootId = getRoot();
        preorder(rootId);
        System.out.print(" ");
        System.out.println(preorderList.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        System.out.println("Inorder");
        int leftId = getLeft(rootId);
        inorder(leftId);
        System.out.print(" ");
        System.out.println(inorderList.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        System.out.println("Postorder");
        postorder(leftId);
        System.out.print(" ");
        System.out.println(postorderList.stream().map(String::valueOf).collect(Collectors.joining(" ")));

    }

    int getRoot() {
        int rootId = 0;
        for (int i = 0; i < n; i++) {
            if (nodes[i].p == null) {
                rootId = i;
            }
        }
        return rootId;
    }

    int getLeft(int id) {
        if (nodes[id].l == null) return id;
        else return getLeft(nodes[id].l);
    }

    void preorder(int id) {
        preorderList.add(id);
        if (nodes[id].l != null) preorder(nodes[id].l);
        if (nodes[id].r != null) preorder(nodes[id].r);
    }

    void inorder(int id) {
        if (nodes[id].l != null && !inorderList.contains(nodes[id].l)) inorder(nodes[id].l);
        if (!inorderList.contains(id)) inorderList.add(id);
        if (nodes[id].r != null && !inorderList.contains(nodes[id].r)) inorder(nodes[id].r);
        if (nodes[id].p != null) inorder(nodes[id].p);
    }

    void postorder(int id) {
        if (nodes[id].l != null && !postorderList.contains(nodes[id].l)) postorder(nodes[id].l);
        if (nodes[id].r != null && !postorderList.contains(nodes[id].r)) postorder(nodes[id].r);
        if (!postorderList.contains(id)) postorderList.add(id);
        if (nodes[id].p != null) postorder(nodes[id].p);
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
