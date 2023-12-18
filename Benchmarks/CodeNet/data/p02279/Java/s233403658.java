import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static int MAX = 1000005;
    public static int NIL = -1;
    public static Node[] T;
    public static int[] D = new int[MAX];
    public static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        T = new Node[n];
        for(int i = 0; i < n; i++){
            T[i] = new Node();
            T[i].p = T[i].l = T[i].r = NIL;
        }

        for(int i = 0; i < n; i++){
            String[] in = br.readLine().split(" ");
            int v = Integer.parseInt(in[0]);
            int d = Integer.parseInt(in[1]);
            int l = 0;
            for(int j = 0; j < d; j++){
                int c = Integer.parseInt(in[2 + j]);
                if(j == 0) T[v].l = c;
                else T[l].r = c;
                l = c;
                T[c].p = v;
            }
        }
        int r = 0;
        for(int i = 0; i < n; i++){
            if(T[i].p == NIL) r = i;
        }

        rec(r, 0);

        for(int i = 0; i < n; i++) print(i);

    }


    //find depth                                                                     
    public static void rec(int u, int p){
        D[u] = p;
        if(T[u].r != NIL) rec(T[u].r, p);
        if(T[u].l != NIL) rec(T[u].l, p + 1);

    }

    public static void print(int u){
        int i, c;
        StringBuilder sb = new StringBuilder();
        sb.append("node ").append(u).append(": ");
        sb.append("parent = ").append(T[u].p).append(", ");
        sb.append("depth = ").append(D[u]).append(", ");

        if(T[u].p == NIL) sb.append("root, ");
        else if(T[u].l == NIL) sb.append("leaf, ");
        else sb.append("internal node");

        sb.append("[");

        for(i = 0, c = T[u].l; c != NIL; i++, c = T[c].r){
            if(i != 0) sb.append(", ");
            sb.append(c);
        }
        sb.append("]\n");
        System.out.print(sb);
    }

}

class Node{
    int p, l, r;
}