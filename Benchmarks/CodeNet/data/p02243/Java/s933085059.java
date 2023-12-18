//Algorithms and Data Structures I - Graph II - Single Source Shortest Path II
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class MyList extends ArrayList<Node> {
    public Node getNode(int u) {
        Node ret = null;
        for(Node n:this){
            if(u==n.u){
                ret = n;
            }
        }
        return ret;
    }
}

class Node implements Comparable<Node> {
    public  int     u,
                    k,
                    d = Integer.MAX_VALUE;
    public  int[][] adj;
    boolean S;

    Node(int u, int k) {
        this.u = u;
        this.k = k;
        adj    = new int[2][k];
    }

    public int compareTo(Node n) {
        return this.d - n.d;
    }
}

class Main {

    private static MyList                Q = new MyList();
    private static HashMap<Integer,Node> S = new HashMap<Integer,Node>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node source = null,
             nd;
        for(int i=0;i<n;i++){
            nd = new Node(sc.nextInt(), sc.nextInt());
            for (int j = 0; j < nd.k; j++) {
                nd.adj[0][j] = sc.nextInt();
                nd.adj[1][j] = sc.nextInt();
            }
            if (nd.u == 0) { nd.d   = 0 ;
                             source = nd;}
            else           {Q.add(nd)   ;}
        }
        relax(source);
        S.put(source.u,source);

        while(!Q.isEmpty()){
            Collections.sort(Q);
            relax(Q.remove(0));
        }

        for(int i=0;i<n;i++){
            nd = S.get(i);
            System.out.println(nd.u+" "+nd.d);
        }
    }

    private static void relax(Node n){
        Node t;
        int  l;
        for(int i=0;i<n.k;i++){
            t = Q.getNode(n.adj[0][i]);
            l = n.d+n.adj[1][i];
            if(t!=null&& l<t.d){
                t.d=l;
            }
        }
        S.put(n.u,n);
    }
}