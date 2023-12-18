import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Comparator;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    DijkstraVerify solver = new DijkstraVerify();
    solver.solve(1, in, out);
    out.close();
  }

  static class DijkstraVerify {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      Graph g = new Graph(n);
      for (int i = 0; i < n; i++) {
        int from = in.nextInt();
        int deg = in.nextInt();
        for (int j = 0; j < deg; j++) {
          int to = in.nextInt();
          int cost = in.nextInt();
          g.addEdge(from, to, cost);
        }
      }
      long[] d = g.dijkstra(0);
      for (int i = 0; i < n; i++) {
        out.println(i + " " + d[i]);
      }
    }

  }

  static class Pair<T, U> {

    private T x;
    private U y;

    public Pair(T t, U u) {
      this.x = t;
      this.y = u;
    }

    public T getX() {
      return x;
    }

    public U getY() {
      return y;
    }

    public String toString() {
      return this.x.toString() + " " + this.y.toString();
    }

    public int hashCode() {
      return super.hashCode();
    }

  }

  static class Edge {

    int to;
    int cost = 1;

    public Edge(int to) {
      this.to = to;
    }

    public Edge(int to, int cost) {
      this.to = to;
      this.cost = cost;
    }

    public String toString() {
      return "to :" + to + ", cost :" + cost;
    }

  }

  static class Vertex {

    private List<Edge> adj;

    public Vertex() {
      this.adj = new ArrayList<>();
    }

    public void addEdge(Edge e) {
      adj.add(e);
    }

    public List<Edge> getAdj() {
      return adj;
    }

    public int getSize() {
      return adj.size();
    }

  }

  static class Graph {

    private Vertex[] v;
    private int size;

    public Graph(int size) {
      this.size = size;
      v = new Vertex[this.size];
      for (int i = 0; i < this.size; i++) {
        v[i] = new Vertex();
      }
    }

    public void addEdge(int from, int to, int cost) {
      v[from].addEdge(new Edge(to, cost));
    }

    public long[] dijkstra(int from) {
      PriorityQueue<Pair<Long, Integer>> pq =
          new PriorityQueue<>(Comparator.comparing(x -> x.getX()));
      long[] d = new long[size];
      Arrays.fill(d, (int) 1e9 + 5);
      d[from] = 0;
      pq.add(new Pair<>((long) 0, from));
      while (!pq.isEmpty()) {
        Pair ip = pq.peek();
        pq.poll();
        long c = (long) ip.getX();
        int now = (int) ip.getY();
        if (d[now] < c) {
          continue;
        }
        for (int i = 0; i < v[now].getSize(); i++) {
          Edge e = v[now].getAdj().get(i);
          // System.out.println(e.toString());
          if (d[e.to] > d[now] + e.cost) {
            d[e.to] = d[now] + e.cost;
            Pair<Long, Integer> p = new Pair<>(d[e.to], e.to);
            pq.add(p);
            // System.out.println("d[" + e.to + "] update");
          }
        }
      }
      return d;
    }

  }
}


