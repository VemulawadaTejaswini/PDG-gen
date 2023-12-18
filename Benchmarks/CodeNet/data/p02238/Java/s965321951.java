import java.util.Scanner;
import java.util.HashMap;
import java.util.Stack;
import java.util.HashSet;
public class Main {

  int n;
  HashMap<Integer, Integer[]> graph;
  HashSet<Integer> visited = new HashSet<Integer>();
  int timestamp;
  int[] d;
  int[] f;

  public Main(HashMap<Integer, Integer[]> graph, int n) {
    this.n = n;
    this.graph = graph;
    this.timestamp = 1;
    this.d = new int[n];
    this.f = new int[n];
  }

  public void dfs() {
    dfsHelper(1);
  }

  public void dfsHelper(Integer elem) {
    visited.add(elem);
    this.d[elem-1] = this.timestamp;
    this.timestamp++;
    for (Integer neighbor : this.graph.get(elem)) {
      if (!this.visited.contains(neighbor)) {
        dfsHelper(neighbor);
      }
    }
    this.f[elem-1] = this.timestamp;
    this.timestamp++;
  }

  public void displayResults() {
    for (int i = 0; i < n; i++) {
      System.out.println((i+1) + " " + this.d[i] + " " + this.f[i]);
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    HashMap<Integer, Integer[]> graph = new HashMap<Integer, Integer[]>();
    for (int i = 0; i < n; i++) {
      int id = s.nextInt();
      int degree = s.nextInt();
      Integer[] edges = new Integer[degree];
      for (int j = 0; j < degree; j++) {
        int val = s.nextInt();
        edges[j] = val;
      }
      graph.put(id, edges);
    }
    s.close();
    Main main = new Main(graph, n);
    main.dfs();
    main.displayResults();
  }
}

