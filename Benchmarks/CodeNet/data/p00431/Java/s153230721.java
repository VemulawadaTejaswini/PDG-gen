import java.util.*;

class Graph {
  public void addEdge(int a, int b) {
    if(! nodes.containsKey(a)) nodes.put(a, new Node());
    if(! nodes.containsKey(b)) nodes.put(b, new Node());

    nodes.get(a).addEdge(nodes.get(b));
    nodes.get(b).addEdge(nodes.get(a));
  }

  public int findLongestChain() {
    int max = 0;
    for(Node n : searchStartNodes()) {
      int d = n.dfs();
      if(d > max) max = d;
    }
    return max;
  }

  private Set<Node> searchStartNodes() {
    Collection<Node> ns = nodes.values();
    Set<Node> lst = new HashSet<Node>(ns);

    // 周囲のノードのうちエッジの数が極小のもののみを対象とする
    for(Node n : ns) {
      if(lst.contains(n)) {
        int rank = n.edges.size();
        for(Node s : n.edges) {
          if(lst.contains(s) && s.edges.size() <= rank) {
            lst.remove(n);
            break;
          }
        }
      }
    }

    Set<Node> snodes = new HashSet<Node>();

    // 対等なノードは1つのみで良い
    for(Node n1 : lst) {
      boolean contains = false;
      for(Node n2 : snodes) {
        if(n1.edges.equals(n2.edges)) {
          contains = true;
          break;
        }
      }
      if(! contains) snodes.add(n1);
    }

    return snodes;
  }

  private Map<Integer, Node> nodes = new HashMap<Integer, Node>();
}

class Node {
  public void addEdge(Node n) {
    edges.add(n);
  }

  public int dfs() {
    return dfs(new HashSet<Node>());
  }

  private int dfs(Set<Node> visited) {
    int max = 0;
    visited.add(this);

    for(Node e : getNeighbors(visited)) {
      if(! visited.contains(e)) {
        int n = e.dfs(visited);
        if(n > max) max = n;
      }
    }

    visited.remove(this);

    max++;
    return max;
  }

  private Set<Node> getNeighbors(Set<Node> visited) {
    Set<Node> nodes = new HashSet<Node>();

    // 対等なノードは1つのみで良い
    for(Node n1 : edges) {
      if(visited.contains(n1)) continue;

      boolean contains = false;
      for(Node n2 : nodes) {
        if(n1.edges.equals(n2.edges)) {
          contains = true;
          break;
        }
      }
      if(! contains) nodes.add(n1);
    }

    return nodes;
  }

  Set<Node> edges = new HashSet<Node>();
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