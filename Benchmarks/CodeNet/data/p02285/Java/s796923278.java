import java.util.Arrays;
import java.util.Scanner;

public class Main {

    Node rootNode;

    class Node {
        int value;
        Node p, l, r;

        public Node(int value) {
            this.value = value;
        }
    }

    void insert(Node n) {
        if (rootNode == null) {
            rootNode = n;
            return;
        }
        Node x = rootNode;
        Node y = x;
        while (x != null) {
            y = x;
            n.p = x;
            if (x.value < n.value) {
                x = x.r;
            } else {
                x = x.l;
            }
        }
        if (y.value < n.value) {
            y.r = n;
        } else {
            y.l = n;
        }
    }

    void find(int k) {
        Node x = rootNode;
        while (x != null) {
            if (x.value == k) {
                System.out.println("yes");
                return;
            } else if (x.value > k) {
                x = x.l;
            } else {
                x = x.r;
            }
        }
        System.out.println("no");
    }

    Node findNode(int k) {
        Node x = rootNode;
        while (x != null) {
            if (x.value == k) {
                return x;
            } else if (x.value > k) {
                x = x.l;
            } else {
                x = x.r;
            }
        }
        return null;
    }

    void delete(Node z) {
        if (z == null) return;

        Node x, y;

        // 削除される対象
        if (z.l != null && z.r != null) {
            y = getNextSuccessor(z);
        } else {
            y = z;
        }

        // yの子xを決める
        if (y.l != null) {
            x = y.l;
        } else {
            x = y.r;
        }

        // xの親を設定する
        if (x != null) {
            x.p = y.p;
        }

        if (y.p == null) {
            rootNode = x;
        } else if (y.p.l != null && y.value == y.p.l.value) {
            y.p.l = x;
        } else {
            y.p.r = x;
        }

        if (y != z) {
            z.value = y.value;
        }
    }

    Node getNextSuccessor(Node z) {
        Node x = z;
        // 右の子が存在すれば、右二分木で一倍小さいやつ
        if (z.r != null) {
            return getMinimum(x);
        }

        // それ以外は、親を辿っていって、最初に左の子になっているような接点の親
        Node y = x.p;
        while (y != null && y.r != null && x.value == y.r.value) {
            x = y;
            y = y.p;
        }
        return y;
    }

    Node getMinimum(Node x) {
        if (x.l != null) {
            x = x.l;
        }
        return x;
    }

    void print() {
        preorder(rootNode);
        System.out.println();
        inorder(rootNode);
        System.out.println();
    }

    void inorder(Node n) {
        if (n == null) return;
        System.out.print(" " + n.value);
        inorder(n.l);
        inorder(n.r);
    }

    void preorder(Node n) {
        if (n == null) return;
        preorder(n.l);
        System.out.print(" " + n.value);
        preorder(n.r);
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("insert")) {
                int k = sc.nextInt();
                insert(new Node(k));
            } else if (s.equals("print")) {
                print();
            } else if (s.equals("find")) {
                int k = sc.nextInt();
                find(k);
            } else if (s.equals("delete")) {
                int k = sc.nextInt();
                delete(findNode(k));
            }
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

