import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    static private node t = null;
    final static private StringBuilder sb = new StringBuilder();
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        String in;
        for(int i = 0; i<n; i++){
            in = br.readLine();
            if(in.charAt(0)=='p'){
                inorder(t);
                sb.append('\n');
                preorder(t);
                sb.append('\n');
            }else if(in.charAt(0)=='i'){
                insert(new node(Integer.parseInt(in.substring(7))));
            }else if(in.charAt(0)=='f'){
                sb.append(find(Integer.parseInt(in.substring(5))) ? "yes\n" : "no\n");
            }else{
                delete(Integer.parseInt(in.substring(7)));
            }
        }
        System.out.print(sb);
    }
    static void insert(node z){
        node y = null;
        node x = t;
        while(x!=null){
            y = x;
            if(z.key<x.key){
                x = x.left;
            }else{
                x = x.right;
            }
        }
        if(y==null){
            t = z;
        }else if(z.key<y.key){
            y.left = z;
        }else{
            y.right = z;
        }
    }
    static boolean find(int key){
        node x;
        for(x = t; x!=null&&x.key!=key; x = key<x.key ? x.left : x.right);
        return x!=null&&x.key==key;
    }
    static void delete(int key){
        node y = null;
        node x;
        for(x = t; x!=null&&x.key!=key; y = x, x = key<x.key ? x.left : x.right);
        if(x==null||x.key!=key) return;
        if(x.left==null){
            if(key<y.key) y.left = x.right;
            else y.right = x.right;
        }else if(x.right==null){
            if(key<y.key) y.left = x.left;
            else y.right = x.left;
        }else{
            y = x;
            node z;
            for(z = x.right; z.left!=null; y = z, z = z.left);
            x.key = z.key;
            if(z.key<y.key) y.left = z.right;
            else y.right = z.right;
        }
    }
    static void inorder(node t){
        if(t==null) return;
        inorder(t.left);
        sb.append(' ').append(t.key);
        inorder(t.right);
    }
    static void preorder(node t){
        if(t==null) return;
        sb.append(' ').append(t.key);
        preorder(t.left);
        preorder(t.right);
    }
}
class node{
    public int key;
    public node left;
    public node right;
    node(int key){
        this.key = key;
        left = right = null;
    }
}