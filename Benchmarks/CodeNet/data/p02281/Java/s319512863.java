
import java.util.Scanner;

public class Main {

    static int n;
    static Node[] node;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        node = new Node[n];
        int l,r;
        l = r = 0;
        for(int i = 0; i < n; i++){
            node[i] = new Node();
        }
        int v;
        for(int i = 0; i< n;i++){
            v = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            node[v].l = l;
            node[v].r = r;
            if( l != -1) node[l].p = v;
            if( r != -1) node[r].p = v;
        }

        int root=0;
        for(int i = 0; i< n;i++){
            if (node[i].p == -1) root = i;
        }
        System.out.println("Preorder");
        preOrder(root);
        System.out.println("\nInorder");
        Inorder(root);
        System.out.println("\nPostorder");
        Postorder(root);
        System.out.println();

    }
    
    static void preOrder(int u){
        if(u == -1)return;
        System.out.print(" " + u);
        preOrder(node[u].l);
        preOrder(node[u].r);
        return;
    }
    
    static void Inorder(int u){
        if(u == -1) return;
        Inorder(node[u].l);
        System.out.print(" "+ u);
        Inorder(node[u].r);
    }
    
    static void Postorder(int u){
        if(u == -1) return;
        Postorder(node[u].l);
        Postorder(node[u].r);
        System.out.print(" "+ u);
    }

}

class Node{
    int p,r,l;
    Node(){
        p = r = l = -1;
    }
}
