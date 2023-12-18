import java.util.Scanner;

public class Main {
    
    static Node NIL;
    static Node root;
    static StringBuilder sb;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        NIL = new Node(-1);
        root = NIL;
        sb = new StringBuilder();
        int m = Integer.parseInt(sc.next());
        
        for(int i = 0; i < m; i++){
            String s = sc.next();
            switch (s) {
                case "insert":
                    intsert(Integer.parseInt(sc.next()));
                    break;
                case "find":
                    int key = Integer.parseInt(sc.next());
                    if(find(root, key) != NIL){
                        sb.append("yes").append(System.lineSeparator());
                    }else{
                        sb.append("no").append(System.lineSeparator());
                    }   break;
                case "print":
                    inPerse(root);
                    sb.append(System.lineSeparator());
                    prePerse(root);
                    sb.append(System.lineSeparator());
                    break;
                default:
                    break;
            }
        }
        System.out.print(sb);
    }
    
    static void intsert(int key){
        
        Node y = NIL;
        Node x = root;
        Node z = new Node(key);
        
        while(x != NIL){
            y = x;
            if(z.key < x.key){
                x = x.left;
            }else{
                x = x.right;
            }
        }
        z.parent = y;
        
        if(y == NIL){
            root = z;
        }else if(z.key < y.key){
            y.left = z;
        }else{
            y.right = z;
        }
    }
    
    static Node find(Node x, int key){
        
        while(x != NIL && key != x.key){
            if(key < x.key){
                x = x.left;
            }else{
                x = x.right;
            }
        }
        return x;
    }
    
    static void prePerse(Node u){
        
        if(u == NIL) return;
        sb.append(" ").append(u.key);
        prePerse(u.left);
        prePerse(u.right);
    }
    
    static void inPerse(Node u){
        
        if(u == NIL) return;
        inPerse(u.left);
        sb.append(" ").append(u.key);
        inPerse(u.right);
    }
    
    static class Node {
        int key;
        Node parent, left, right;

        public Node(int key) {
            this.key = key;
            parent = NIL;
            left = NIL;
            right = NIL;
        }
    }
}
