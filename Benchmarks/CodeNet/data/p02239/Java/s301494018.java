import java.util.Scanner;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
public class Main {

  public class Node {
    int val;
    int dist;
    public Node(Integer val, int dist) {
      this.val = val;
      this.dist = dist;
    }
  }

  int n;
  HashMap<Integer, Integer[]> graph;
  HashSet<Integer> visited = new HashSet<Integer>();
  int[] distances;

  public Main(HashMap<Integer, Integer[]> graph, int n) {
    this.n = n;
    this.graph = graph;
    this.distances = new int[n];
    for (int i = 0; i < n; i++)
      this.distances[i] = -1;
  }

  public void bfs() {
    Queue<Node> q = new LinkedList<Node>();
    q.add(new Node(1, 0));
    this.visited.add(1);
    while(!q.isEmpty()) {
      Node currNode = q.remove();
      this.distances[currNode.val-1] = currNode.dist;
      Integer[] neighbors = this.graph.get(currNode.val);
      for (Integer neighbor : neighbors) {
        if (!this.visited.contains(neighbor)) {
          q.add(new Node(neighbor, currNode.dist + 1));
          this.visited.add(neighbor);
        }
      }
    }
  }

  public void displayResults() {
    for (int i = 0; i < this.n; i++) {
      System.out.println((i+1) + " " + this.distances[i]);
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
    main.bfs();
    main.displayResults();
  }
}

