
import java.util.*;
import java.io.*;

class Main{
  public static StringBuilder bl = new StringBuilder();
  public static int n;
  public static int M[][];
  public static final int INFTY = (int)Double.POSITIVE_INFINITY;
  public static final int WHITE = 0;
  public static final int GRAY = 1;
  public static final int BLACK = 2;
  public static List<List<Pair>> adj = new ArrayList<List<Pair>>();
  // public static ArrayList<ArrayList<Map<Integer,Integer>>> adj;
  public static void main(String args[])throws Exception{
    Scanner sc = new Scanner(System.in);
    int k,u,v,c;
    n = sc.nextInt();
    // adj = new ArrayList<ArrayList<Map<Integer,Integer>>>();
    // for(int i = 0 ; i < n; i++){
    //   for(int j = 0; j < n; j++){
    //     M[i][j] = INFTY;
    //   }
    // }
    for(int i = 0 ;i<n; i++){
      adj.add(new ArrayList<Pair>());
      // String s[] = br.readLine().split("\\s+");
      // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      // ArrayList<Map<Integer,Integer>>adj1 = new ArrayList<Map<Integer,Integer>>();
      u = sc.nextInt();
      k = sc.nextInt();
      for(int j =0; j<k; j++){
        v = sc.nextInt();
        c = sc.nextInt();
        adj.get(u).add(new Pair(v, c));
        // map.put(v,c);
      }
      // adj1.add(map);
      // adj.add(adj1);
    }
    dijkstra();
  }

  static void dijkstra(){
    // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    // Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
    // ArrayList<Map<Integer,Integer>>PQ = new ArrayList<Map<Integer,Integer>>();
    int color[] = new int[n];
    int d[] = new int[n];
    PriorityQueue<Pair> PQ = new PriorityQueue<Pair>();
    PQ.add(new Pair(0, 0));
    for(int i = 0; i<n; i++){
      d[i] = INFTY;
      color[i] = WHITE;
    }
    //arrays.fill(d,INFTY)でもok
    d[0] = 0;
    // map.put(0,0);
    // PQ.add(map);
    // color[0] = GRAY;
    while(PQ.isEmpty() != true){
      // map.put(PQ.get(0),PQ.remove());
      Pair f = PQ.poll();
      int u = f.second;
      color[u] = BLACK;

      if(d[u] < f.first*(-1))continue;
      for(int i = 0; i<adj.get(u).size(); i++){
        int v = adj.get(u).get(i).first;
        if(color[v] == BLACK)continue;
        int sec = adj.get(u).get(i).second;
        if(d[v] > d[u] + sec){
          d[v] = d[u] + sec;
          PQ.add(new Pair(d[v], v));
        }
      }
    }
    for(int i = 0; i<n; i++){
      bl.append(i).append(" ").append(d[i]).append("\n");
    }
    System.out.print(bl);
  }
}

class Pair implements Comparable<Pair> {
  int first;
  int second;
  public Pair(int first, int second) {
    super();
    this.first = first;
    this.second = second;
  }
  public int compareTo(Pair o) {
      return this.first - o.first;
  }

}
