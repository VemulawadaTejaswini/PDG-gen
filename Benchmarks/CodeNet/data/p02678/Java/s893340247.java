import java.io.*;
import java.util.*;

public class Main {
    static int[] enter;
    static int[] level;
    static int visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        Node[] ary = new Node[n];
        for( int i = 0; i < n; i++ ) ary[i] = new Node(i);
        while(m-->0) {
            tmp = br.readLine().split(" ");
            int u = Integer.parseInt(tmp[0])-1;
            int v = Integer.parseInt(tmp[1])-1;
            ary[u].adj.add(ary[v]);
            ary[v].adj.add(ary[u]);
        }
        enter = new int[n];
        Arrays.fill(enter,-1);
        level = new int[n];
        visited = 0;
        dfs(ary[0],1);
        if( visited-1 == n ) {
            pw.println("Yes");
            for( int i = 1; i < n; i++ ) {
                pw.println(enter[i]);
            }
        } else {
            pw.println("No");
        }
        pw.close();
    }
    static void dfs(Node n,int L) {
        visited++;
        for( Node node : n.adj ) {
            if( enter[node.i] == -1 ) {
                enter[node.i] = n.i+1;
                level[node.i] = L;
                dfs(node,L+1);
            } else {
                if( L < level[node.i] ) {
                    enter[node.i] = n.i+1;
                    level[node.i] = L;
                }
            }
        }
    }
    static class Node {
        int i;
        ArrayList<Node> adj = new ArrayList<>();
        public Node(int i) {
            this.i = i;
        }
    }
}