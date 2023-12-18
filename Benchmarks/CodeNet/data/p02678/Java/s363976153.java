import java.io.*;
import java.util.*;

public class Main {
    static int[] enter;
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
        boolean firstDone = false;
        boolean possible = true;
        for( Node node : ary ) {
            if(enter[node.i]==-1) {
                if(firstDone) {
                    possible = false;
                    break;
                }
                firstDone = true;
                dfs(node);
            }
            if( node.i == 0 ) enter[node.i] = 1;
        }
        if( possible ) {
            pw.println("Yes");
            for( int i = 1; i < n; i++ ) {
                pw.println(enter[i]);
            }
        } else {
            pw.println("No");
        }
        pw.close();
    }
    static void dfs(Node n) {
        for( Node node : n.adj ) {
            if( enter[node.i] == -1 ) {
                enter[node.i] = n.i+1;
                dfs(node);
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