

import java.util.Scanner;

public class Main {

    public static class Node {
        int parent, left, right;
        Node() {
            this.left = -1;
            this.right = -1;
        }
    }
    public static int MAX = 100005;
    public static int n;
    public static Node[] T = new Node[MAX];

    public static void preParse(int u) {
        if(u == -1) return;
        System.out.print(" " +u);
        preParse(T[u].left);
        preParse(T[u].right);
    }

    public static void inParse(int u) {
        if(u == -1) return;
        inParse(T[u].left);
        System.out.print(" " + u);
        inParse(T[u].right);
    }

    public static void postParse(int u) {
        if(u == -1) return;
        postParse(T[u].left);
        postParse(T[u].right);
        System.out.print(" " + u);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int v = 0;
        int l = 0;
        int r = 0;
        int root = 0;

        for(int i = 0; i < n; i++) {
            T[i] = new Node();
            T[i].parent = -1;
        }

        for(int i = 0; i < n; i++) {
            v = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();

            T[v].left = l;
            T[v].right = r;
            if(l != -1) T[l].parent = v;
            if(r != -1) T[r].parent = v;
        }
        for(int i = 0; i < n; i++) {
            if(T[i].parent == -1) root = i;
        }

        System.out.println("Preorder");
        preParse(root);
        System.out.println();
        System.out.println("Inorder");
        inParse(root);
        System.out.println();
        System.out.println("Postorder");
        postParse(root);
        System.out.println();
    }
}

