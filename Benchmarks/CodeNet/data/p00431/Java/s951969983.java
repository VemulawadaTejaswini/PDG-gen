import java.util.*;

class Graph {
  public void addEdge(int a, int b) {
    if(! nodes.containsKey(a)) nodes.put(a, new Node());
    if(! nodes.containsKey(b)) nodes.put(b, new Node());

    nodes.get(a).addEdge(nodes.get(b));
    nodes.get(b).addEdge(nodes.get(a));
  }

  public int findLongestChain() {
    int s = nodes.size();
    int max = 0;
    for(Node n : nodes.values()) {
      int d = n.dfs(s);
      if(d > max) max = d;
    }
    return max;
  }

  private Map<Integer, Node> nodes = new HashMap<Integer, Node>();
}

class Node {
  public void addEdge(Node n) {
    edges.add(n);
  }

  public int dfs(int s) {
    return dfs(new HashSet<Node>(), s - 1);
  }

  private int dfs(Set<Node> visited, int rest) {
    Set<Node> ns = new HashSet<Node>(visited);
    ns.add(this);

    int max = 0;

    for(Node e : edges) {
      if(! visited.contains(e)) {
        int n = e.dfs(ns, rest - 1);
        if(n > max) max = n;
        if(max == rest) break;
      }
    }

    max++;
    return max;
  }

  private Set<Node> edges = new HashSet<Node>();
}

public class Main {
  private Scanner sc = new Scanner(System.in);

  public void run() {
    while(sc.hasNextInt()) {
      int n = sc.nextInt();
      if(n == 0) break;

      Graph g = new Graph();

      for(int i = 0; i < n; i++) {
        g.addEdge(sc.nextInt(), sc.nextInt());
      }

      System.out.println(g.findLongestChain());
    }
  }

  public static void main(String[] args) {
    new Main().run();
  }
}