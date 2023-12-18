import java.util.*;
import java.io.*;

class Main{
   public static void main(String args[]){
     int[][] adj;
     int i,j,k=0,n,num,ans;
     Scanner scan = new Scanner(System.in);
     n = scan.nextInt();
     adj = new int[n*n][3];
     @SuppressWarnings("unchecked")
     List<Edge>[] edges = new List[n*n];

       for(i=0;i<n;i++){
         for(j=0;j<n;j++){
           num = scan.nextInt();
           if(num!=-1){
             adj[k][0] = i;
             adj[k][1] = j;
             adj[k][2] = num;
             k++;
           }
         }
       }

        for(i=0;i<k;i++) {
            edges[i] = new ArrayList<Edge>();
        }

        for(i=0;i<k;i++) {
            edges[adj[i][0]].add(new Edge(adj[i][0], adj[i][1], adj[i][2]));
            edges[adj[i][1]].add(new Edge(adj[i][1], adj[i][0], adj[i][2]));
        }
        ans = prim(n, edges);
        System.out.println(ans);
  }

    static int prim(int n, List<Edge>[] edges) {
        boolean[] done = new boolean[n];

        Queue<Edge> q = new PriorityQueue<Edge>();
        q.add(new Edge(0, 0, 0));

        int totalCost = 0;
        while (!q.isEmpty()) {
            Edge e = q.poll();
            if (done[e.target]) {
                continue;
            }

            done[e.target] = true;
            totalCost += e.cost;
            q.addAll(edges[e.target]);
        }

        return totalCost;
    }

  static class Edge implements Comparable<Edge> {
          public int source = 0;
          public int target = 0;
          public int cost = 0;

          public Edge(int source, int target, int cost) {
              this.source = source;
              this.target = target;
              this.cost = cost;
          }

          public int compareTo(Edge o) {
              return this.cost - o.cost;
          }
      }
}

