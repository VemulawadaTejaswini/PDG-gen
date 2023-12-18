
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] aN = new Node[n];
        Node nil = new Node(-1, null, null);
        
        for (int i = 0; i < n; i++) {
            aN[i] = new Node(i, nil, null);
        }
        
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            int dim = sc.nextInt();
            Node[] a = new Node[dim];
            for (int j = 0; j < dim; j++) {
                int val2 = sc.nextInt();
                aN[val2].parent = aN[val];
                a[j] = aN[val2];
            }
            aN[val].children = a;
        }
        
        for (int i = 0; i < n; i++) {
            String kind = aN[i].parent.val != -1 ? "root" : aN[i].children.length == 0 ? "leaf" : "internal node";
            String children = getStr(aN[i].children);
            
            System.out.print(
                    "node " + aN[i].val + ": parent = " + aN[i].parent.val + ", depth = " + aN[i].calcDepth() + 
                    ", " + kind + ", " + children);
            System.out.println();
        }
    }
    
    private static String getStr(Node[] a) {
        // TODO 自動生成されたメソッド・スタブ
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        for (int i = 0; i < a.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(a[i].val);
        }
        sb.append("]");
        return sb.toString();
    }

    public static class Node {
        int val;
        Node parent;
        Node[] children;
        public Node(int val, Node parent, Node[] children) {
            this.val = val;
            this.parent = parent;
            this.children = children;
        }
        
        public int calcDepth() { 
            int depth = 0;
            Node p = this.parent;
            while(p.val != -1) {
                depth++;
                p = p.parent;
            }
            return depth;
        }
    }
}

