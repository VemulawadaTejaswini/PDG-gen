import java.util.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;             
    static final int MAXN = 111111; 
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] a = new int[n][2];
        int[] parentOf = new int[n];
        for (int i = 0; i < parentOf.length; ++i) parentOf[i] = -1;
        for (int i = 0; i < n; ++i) {
            int id = input.nextInt();
            a[id][0] = input.nextInt();
            a[id][1] = input.nextInt();
            if (a[id][0] >= 0) parentOf[a[id][0]] = id;
            if (a[id][1] >= 0) parentOf[a[id][1]] = id;
        }
        int root = 0;
        for (int i = 0; i < n; ++i) {
            if (parentOf[i] == -1) root = i;
        }
        System.out.println("Preorder");
        preorder(root, a);
        System.out.println("");
        System.out.println("Inorder");
        inorder(root, a);
        System.out.println("");
        System.out.println("Postorder");
        postorder(root, a);
        System.out.println("");                
    }              
    
    static void preorder(int u, int[][] a) {
        System.out.print(" " + u);
        if (a[u][0] >= 0) preorder(a[u][0], a);
        if (a[u][1] >= 0) preorder(a[u][1], a);
    }
    
    static void inorder(int u, int[][] a) {
        if (a[u][0] >= 0) inorder(a[u][0], a);
        System.out.print(" " + u);
        if (a[u][1] >= 0) inorder(a[u][1], a);
    }
    
    static void postorder(int u, int[][] a) {
        if (a[u][0] >= 0) postorder(a[u][0], a);
        if (a[u][1] >= 0) postorder(a[u][1], a);
        System.out.print(" " + u);
    }
}