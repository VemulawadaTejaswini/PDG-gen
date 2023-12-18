import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

  static int n, m;
  static List<Integer> step;
  static Graph g;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);

    step = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      step.add(-1);
    }

    g = new Graph(n);

    for (int i = 0; i < m; i++) {
      in = br.readLine().split(" ");
      int a = Integer.parseInt(in[0]) - 1;
      int b = Integer.parseInt(in[1]) - 1;
      g.add_edge(a, b, false);
    }

    br.close();

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(0);

    while(!pq.isEmpty()){
      int now = pq.poll();
      for (int next : g.adjacency[now]) {
        if(step.get(next) != -1) continue;
        step.set(next, now);
        pq.add(next);
      }
    }

    out.println("Yes");

    for (int i = 1; i < n; i++) {
      out.println(step.get(i) + 1);
    }

    out.flush();
  }
}

class Graph {
  public ArrayList<Integer>[] adjacency;

  Graph(int n) {
    adjacency = new ArrayList[n];
    for (int i = 0; i < n; i++) {
      adjacency[i] = new ArrayList<Integer>();
    }
  }

  public void add_edge(int from, int to, boolean is_directed) {
    adjacency[from].add(to);
    if (!is_directed) {
      adjacency[to].add(from);
    }
  }
}