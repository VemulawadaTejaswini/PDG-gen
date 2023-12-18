import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;

class Main {
  public static final int WHITE = 0;
  public static final int GRAY  = 1;
  public static final int BLACK = 2;
  public static int SIZE;
  public static int TIME;

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    SIZE = sc.nextInt();
    Map<Node, List<Integer>> graph = new LinkedHashMap<>(SIZE);

    Node node;
    int size;
    for (int i = 0; i < SIZE; i++) {
      node = new Node(sc.nextInt());
      size = sc.nextInt();
      List<Integer> elements = new ArrayList<>(size);
      for (int j = 0; j < size; j++) {
        elements.add(sc.nextInt());
      }
      graph.put(node, elements);
    }
    dfs(graph);
    print(graph);
  }

  public static void dfs(Map<Node, List<Integer>> graph) {
    for (Map.Entry<Node, List<Integer>> entry : graph.entrySet()) {
      if (entry.getKey().color == WHITE) {
        visit(entry.getKey(), graph);;
      }
    }
  }

  public static void visit(Node node, Map<Node, List<Integer>> graph) {
    node.color = GRAY;
    node.first = ++TIME;
    for (int addr : graph.get(node)) {
      Node connect = getNode(addr, graph);
      if (connect.color == WHITE) {
        visit(connect, graph);
      }
    }
    node.color = BLACK;
    node.second = ++TIME;
  }

  public static Node getNode(int value, Map<Node, List<Integer>> graph) {
    for (Map.Entry<Node, List<Integer>> entry : graph.entrySet()) {
      if (entry.getKey().value == value) {
        return entry.getKey();
      }
    }
    return null;
  }

  public static void print(Map<Node, List<Integer>> graph) {
    StringBuilder sb = new StringBuilder();
    for (Map.Entry<Node, List<Integer>> entry : graph.entrySet()) {
      Node node = entry.getKey();
      sb.append(node.value).append(' ');
      sb.append(node.first).append(' ');
      sb.append(node.second);
      System.out.println(sb);
      sb.setLength(0);
    }
  }
}

class Node {
  public int value;
  public int color;
  public int first;
  public int second;

  public Node() {
    this(0);
  }

  public Node(int value) {
    this.value = value;
  }
}

