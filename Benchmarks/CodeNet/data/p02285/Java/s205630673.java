import java.util.*;

enum Lr {
    L, R
};
class ND {
    int val; 
    ND left, right;  
    
    public ND (int val, ND left,  ND right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class BST {
    public static void display_AOJ1 (ND n) {
        if (n.left != null) display_AOJ1(n.left);
        System.out.printf(" %d", n.val);
        if (n.right != null) display_AOJ1(n.right);
    }
    public static void display_AOJ2 (ND n) {
        System.out.printf(" %d", n.val);
        if (n.left != null) display_AOJ2(n.left);
        if (n.right != null) display_AOJ2(n.right);
    }
    public static void display_AOJ1() {
        display_AOJ1(root);
    }
    public static void display_AOJ2() {
        display_AOJ2(root);
    }

    static ND root;

    public static int min_bst() {
        if (root == null) return -1;
        int mn = root.val;
        ND cur = root;
        while (cur != null) {
            mn = Math.min(mn, cur.val);
            cur = cur.left;
        }
        return mn;
    }

    public static boolean search_bst(int d) {
        ND cur = root;
        while (cur != null) {
            if (cur.val == d) return true;
            else if (d < cur.val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return false;
    }

    public static void insert_bst(int d) {
        if (root == null) {
            root = new ND(d, null, null);
            return;
        }
        ND cur = root;
        while (true) {
            if (d <= cur.val) {
                if (cur.left == null) {
                    cur.left = new ND(d, null, null);
                    break;
                }
                cur = cur.left;
            } else {
                if (cur.right == null) {
                    cur.right = new ND(d, null, null);
                    break;
                }
                cur = cur.right;
            }
        }
    }

    public static void delete_bst(int d) {
        Lr lr = null;
        ND cur = root, parent = null;
        while (cur != null) {
            if (cur.val == d) {
                Lr lr_mn = Lr.R;
                ND mn = cur.right, parent_mn = cur;
                if (mn == null) {
                    if (lr == Lr.L) parent.left = cur.left;
                    else parent.right = cur.left;
                    return;
                }
                while (mn.left != null) {
                    parent_mn = mn;
                    lr_mn = Lr.L;
                    mn = mn.left;
                }
                cur.val = mn.val;
                if (mn.right != null) {
                    if (lr_mn == Lr.L) parent_mn.left = mn.right;
                    else parent_mn.right = mn.right;
                } else {
                    if (lr_mn == Lr.L) parent_mn.left = null;
                    else parent_mn.right = null;
                }
            }
            else if (d < cur.val) {
                parent = cur;
                lr = Lr.L;
                cur = cur.left;
            } else {
                parent = cur;
                lr = Lr.R;
                cur = cur.right;
            }
        }
    }
}

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String cmd = sc.next();
            if (cmd.equals("insert")) {
                int val = sc.nextInt();
                BST.insert_bst(val);
            } else if (cmd.equals("find")) {
                int val = sc.nextInt();
                boolean exist = BST.search_bst(val);
                if (exist) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else if (cmd.equals("delete")) {
                int val = sc.nextInt();
                BST.delete_bst(val);
            } else {
                BST.display_AOJ1();
                System.out.println();
                BST.display_AOJ2();
                System.out.println();
            }
        }
    }
}
