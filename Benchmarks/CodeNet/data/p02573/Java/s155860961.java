import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] rank = new int[n + 1];
        int[] parent = new int[n + 1];
        int[][] edge = new int[m][2];
        for(int i = 0; i <= n; i++){
            parent[i] = i;
            rank[i] = 1;
        }
        for(int i = 0; i < m; i++){
            edge[i][0] = sc.nextInt();
            edge[i][1] = sc.nextInt();
        }
        for(int[] e : edge){
            union(e[0], e[1], rank, parent);
        }
        int res = 0;
        for(int i = 1; i <= n; i++){
            //System.out.println(rank[i]);
            res = Math.max(res, rank[i]);
        }

        System.out.println(res);
    }
    public static void union(int a, int b, int[] rank, int[] parent){
        int A = find(a, parent);
        int B = find(b, parent);
        if(A == B)
            return;
        if(rank[A] < rank[B]){
            parent[A] = B;
            rank[B] += rank[A];
        }
        else{
            parent[B] = A;
            rank[A] += rank[B];
        }
    }
    public static int find(int u, int[] parent){
        while(u != parent[u]){
            u = parent[u];
        }
        return u;
    }
}