import java.util.Scanner;

public class Main {
    
    static Node[] tree;
    static StringBuilder sb;
    static final int NIL = -1;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        tree = new Node[n];
        for(int i = 0; i < n; i++){
            tree[i] = new Node();
        }
        for(int i = 0; i < n; i++){
            int id = Integer.parseInt(sc.next());
            int left = Integer.parseInt(sc.next());
            int right = Integer.parseInt(sc.next());
            tree[id].left = left;
            tree[id].right = right;
            if(left != NIL) tree[left].parent = id;
            if(right != NIL) tree[right].parent = id;
        }
        sb = new StringBuilder();
        
        int u = 0;
        while(tree[u].parent != NIL){
            u = tree[u].parent;
        }
        sb.append("Preorder").append(System.lineSeparator());
        prePerse(u);
        sb.append(System.lineSeparator());
        sb.append("Inorder").append(System.lineSeparator());
        inPerse(u);
        sb.append(System.lineSeparator());
        sb.append("Postorder").append(System.lineSeparator());
        postParse(u);
        
        System.out.println(sb);
    }
    
    static void prePerse(int u){
        
        if(u == NIL) return;
        sb.append(" ").append(u);
        prePerse(tree[u].left);
        prePerse(tree[u].right);
    }
    
    static void inPerse(int u){
        
        if(u == NIL) return;
        inPerse(tree[u].left);
        sb.append(" ").append(u);
        inPerse(tree[u].right);
    }
    
    static void postParse(int u){
        
        if(u == NIL) return;
        postParse(tree[u].left);
        postParse(tree[u].right);
        sb.append(" ").append(u);
    }
    
    static class Node {
        int parent, left, right;

        public Node() {
            parent = NIL;
            left = NIL;
            right = NIL;
        }
    }
}
