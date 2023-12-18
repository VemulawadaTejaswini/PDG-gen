import java.util.*;

class ProblemC{
  long[] d = null;//sからの最短経路
  ArrayList<ArrayList<Edge>> g = new ArrayList<ArrayList<Edge>>();
  long inf = 1000000000;

  void solve(){
    Scanner scan = new Scanner(System.in);
    int v = scan.nextInt();
    int e = scan.nextInt();
    int r = scan.nextInt();

    d = new long[v];

    for(int i=0 ; i<v ; ++i){
      g.add(new ArrayList<Edge>());
    }

    for(int i=0 ; i<e ; ++i){
      int s = scan.nextInt();
      int t = scan.nextInt();
      int d = scan.nextInt();
      g.get(s).add(new Edge(t, d));
    }

    dijkstra(r, v);

    for(int i=0 ; i<d.length ; ++i){
      if(d[i] == inf) System.out.println("INF");
      else System.out.println(d[i]);
    }

  }

  void dijkstra(int r, int vn){
    PriorityQueue<IntPair> que = new PriorityQueue<IntPair>();
    for(int i=0 ; i<vn ; ++i) d[i] = inf;
    d[r] = 0;
    que.add(new IntPair(0, r));
    while(!que.isEmpty()){
      IntPair p = que.poll();//IntPair(Key:頂点番号, Value:最短距離)
      int v = p.value;//頂点番号
      if(d[v] < p.key) continue;
      for(int i=0 ; i<g.get(v).size() ; ++i){

        Edge e = g.get(v).get(i);
        if(d[e.to] > d[v] + e.cost){
          d[e.to] = d[v] + e.cost;
          que.add(new IntPair(d[e.to], (int)e.to));
        }
      }
    }//----end of while----
  }//----end of dijkstra----
}

class IntPair implements Comparable<IntPair>{
  public long key;
  public int value;

  IntPair(long key, int value){
    this.key = key;
    this.value = value;
  }

  public int compareTo(IntPair other){
    if(key < other.key) return -1;
    if(key > other.key) return 1;

    if(value < other.key) return -1;
    if(value > other.key) return 1;

    return 0;
  }
}

class Edge{
  int to = 0;
  int cost = 0;

  Edge(int to, int cost){
    this.to = to;
    this.cost = cost;
  }
}


public class Main{
  public static void main(String[] args){
    new ProblemC().solve();
  }
}

