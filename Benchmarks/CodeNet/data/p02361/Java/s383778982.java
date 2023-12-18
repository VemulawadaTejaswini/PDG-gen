import java.util.*;

class Main {
  static final int INF = 99999999;
  static class Vertex implements Comparable<Vertex> {
    List<Route> routes = new ArrayList<Route>();
    int cost = INF;

    public void addRoute(Vertex to, int dist) {
      routes.add(new Route(this, to, dist));
    }

    public int compareTo(Vertex o) {
      return cost - o.cost;
    }
  }

  static class Route {
    Vertex from;
    Vertex to;
    int weight;

    public Route(Vertex from, Vertex to, int weight) {
      this.from = from;
      this.to = to;
      this.weight = weight;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int v = scan.nextInt();
    int e = scan.nextInt();
    int sP = scan.nextInt();

    Vertex[] vertexArr = new Vertex[v];

    for(int i = 0 ; i < v ; i++) {
      vertexArr[i] = new Vertex();
    }

    int start;
    int end;
    int weight;
    for(int i = 0 ; i < e ; i++) {
      start = scan.nextInt();
      end = scan.nextInt();
      weight = scan.nextInt();
      vertexArr[start].addRoute(vertexArr[end], weight);
    }

    vertexArr[sP].cost = 0;

    PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>(Arrays.asList(vertexArr));
    while (!pq.isEmpty()) {
      Vertex s = pq.poll();
      for (Route route : s.routes) {
        Vertex to = route.to;
        int cost = s.cost + route.weight;
        if (cost < to.cost) {
          pq.remove(to);
          to.cost = cost;
          pq.add(to);
        }
      }
    }

    for (Vertex s : vertexArr) {
      if(s.cost == INF) {
        System.out.println("INF");
      } else System.out.println(s.cost);
    }
  }
}
