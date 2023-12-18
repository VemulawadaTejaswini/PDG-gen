import java.io.*;
import java.util.*;

class Node {
    int n;
    Node prev;
    Node next;
    Node(int n) {
        this.n = n;
        this.prev = null;
        this.next = null;
    }
}

public class Main {
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        new Main().run();
    }
    int n, k, m;
    boolean init() {
        n = sc.nextInt();
        k = sc.nextInt();
        m = sc.nextInt();
        if (n == 0 && k == 0 && m == 0) return false;
        m--;
        return true;
    }
    void run() {
        while (init()) {
            Node root = new Node(1);
            Node prev = root;
            for (int i = 2; i <= n; i++) {
                Node node = new Node(i);
                prev.next = node;
                node.prev = prev;
                prev = node;
            }
            prev.next = root;
            root.prev = prev;
            for (int i = 0; i < m; i++) root = root.next;
            while (!(root.next == root)) {
                Node _root = root;
                Node a, b;
                a = _root.prev;
                b = _root.next;
                a.next = b;
                b.prev = a;
                for (int i = 0; i < k; i++) {
                    root = root.next;
                }
            }
            System.out.println(root.n);
        }
    }
}