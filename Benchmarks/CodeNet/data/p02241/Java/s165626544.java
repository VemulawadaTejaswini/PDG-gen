import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Main {

  public static Integer getMinNode(HashSet<Integer> Q, Integer[] C) {
    Integer min = Integer.MAX_VALUE;
    Integer minNode = null;
    for (Integer i = 0; i < C.length; i++) {
      if (C[i] < min && Q.contains(i)) {
        minNode = i;
        min = C[i];
      }
    }
    return minNode;
  }

  public static int mst(int[][] graph) {
    // Initialize Q (unhandled nodes) to contain all nodes
    HashSet<Integer> Q = new HashSet<Integer>();
    for (int i = 0; i < graph.length; i++) {
      Q.add(i);
    }

    // Initialize E (edges included in mst) to be null
    Integer[] E = new Integer[graph.length];
    for (int i = 0; i < graph.length; i++) {
      E[i] = null;
    }

    // Initialize C (minimum edge path to given nodes) to be infinity-1
    Integer[] C = new Integer[graph.length];
    for (int i = 0; i < graph.length; i++) {
      C[i] = Integer.MAX_VALUE-1;
    }

    // Initialize F (all nodes included in the final mst) to be empty
    HashSet<Integer> F = new HashSet<Integer>();

    while (!Q.isEmpty()) {
      Integer node = getMinNode(Q, C);
      Q.remove(node);
      F.add(node);
      if (E[node] != null)
        F.add(E[node]);
      for (int j = 0; j < graph[node].length; j++) {
        if (Q.contains(j) && graph[node][j] != -1 && graph[node][j] < C[j]) {
          C[j] = graph[node][j];
          E[j] = node;
        }
      }
    }

    int mstCost = 0;
    for (int i = 0; i < graph.length; i++) {
      if (E[i] != null) {
        mstCost += C[i];
      }
    }

    return mstCost;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[][] graph = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        graph[i][j] = s.nextInt();
      }
    }
    s.close();
    System.out.println(mst(graph));
  }
}

