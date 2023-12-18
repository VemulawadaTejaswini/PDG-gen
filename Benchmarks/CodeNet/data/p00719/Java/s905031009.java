import java.util.*;

class State implements Comparable<State>{
  int cityId;
  int usedTicket;
  double cost;

  State(int cityId, int usedTicket, double cost){
    this.cityId = cityId;
    this.usedTicket = usedTicket;
    this.cost = cost;
  }

  public int compareTo(State st){
    if(this.cost < st.cost)
      return -1;
    if(this.cost == st.cost)
      return 0;
    return 1;
  }
}

class Edge{
  int from, to, cost;

  Edge(int from, int to, int cost){
    this.from = from;
    this.to = to;
    this.cost = cost;
  }
}

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int n = sc.nextInt();
      int m = sc.nextInt();
      int p = sc.nextInt();
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;

      if(n == 0) break;

      int[] t = new int[n];

      for(int i = 0; i < n; i++){
        t[i] = sc.nextInt();
      }

      ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();

      for(int i = 0; i < m; i++){
        graph.add(new ArrayList<Edge>());
      }

      for(int i = 0; i < p; i++){
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
        int z = sc.nextInt();

        graph.get(x).add(new Edge(x, y, z));
        graph.get(y).add(new Edge(y, x, z));
      }

      PriorityQueue<State> open = new PriorityQueue<State>();
      open.add(new State(a, 0, 0));
      boolean[][] closed = new boolean[m][1 << n];
      double ansCost = -1;

      while(!open.isEmpty()){
        State st = open.poll();

        if(closed[st.cityId][st.usedTicket]) continue;
        closed[st.cityId][st.usedTicket] = true;

        if(st.cityId == b){
          ansCost = st.cost;
          break;
        }

        for(int i = 0; i < n; i++){
          if((st.usedTicket & (1 << i)) != 0) continue;

          for(Edge edge : graph.get(st.cityId)){
            int nextUsedTicket = st.usedTicket | (1 << i);
            double nextCost = st.cost + (double)edge.cost / t[i];

            open.add(new State(edge.to, nextUsedTicket, nextCost));
          }
        }
      }

      if(ansCost == -1){
        System.out.println("Impossible");
      }
      else{
        System.out.printf("%.3f\n", ansCost);
      }
    }
  }
}