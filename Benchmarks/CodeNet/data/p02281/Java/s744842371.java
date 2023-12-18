import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Node {
    public int parent;
    public int left;
    public int right;
}

public class Main implements Runnable {
    static final int MAX = 25;
    static final int NIL = -1;
    Node[] T = new Node[MAX];

    public static void main(String[] args) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        int nodeTotalCount = 0;
        int root = 0;

        // 入力
        for (int i = 0; i < T.length; i++) {
            T[i] = new Node();
            T[i].parent = NIL;
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            nodeTotalCount = Integer.parseInt(br.readLine());
            for (int i = 0; i < nodeTotalCount; i++) {
                String[] line = br.readLine().split(" ");
                int id = Integer.parseInt(line[0]);
                int left = Integer.parseInt(line[1]);
                int right = Integer.parseInt(line[2]);
                T[id].left = left;
                T[id].right = right;
                if (T[id].left != NIL) {
                    T[left].parent = id;
                }
                if (T[id].right != NIL) {
                    T[right].parent = id;
                }
            }
            for (int i = 0; i < nodeTotalCount; i++) {
                if (T[i].parent == NIL) {
                    root = i;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 出力
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

    void postParse(int u) {
        if (u == NIL) {
            return;
        }
        postParse(T[u].left);
        postParse(T[u].right);
        System.out.printf(" %d", u);
    }

    void preParse(int u) {
        if (u == NIL) {
            return;
        }
        System.out.printf(" %d", u);
        preParse(T[u].left);
        preParse(T[u].right);
    }

    void inParse(int u) {
        if (u == NIL) {
            return;
        }
        inParse(T[u].left);
        System.out.printf(" %d", u);
        inParse(T[u].right);
    }
}

