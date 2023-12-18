import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

class Graph {
  public HashSet<Integer>[] adjacency;

  Graph(int n) {
    adjacency = new HashSet[n];
    for (int i = 0; i < n; i++) {
      adjacency[i] = new HashSet<Integer>();
    }
  }

  public void add_edge(int from, int to, boolean is_directed) {
    adjacency[from].add(to);
    if (!is_directed) {
      adjacency[to].add(from);
    }
  }
}


public class Main {

  static int n, m, ans;
  static Graph g;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);

    g = new Graph(n);

    for (int i = 0; i < m; i++) {
      in = br.readLine().split(" ");
      int a = Integer.parseInt(in[0]);
      int b = Integer.parseInt(in[1]);
      a--; b--;
      g.add_edge(a, b, false);
    }

    ans = 0;

    boolean[] seen = new boolean[n];

    for (int i = 0; i < n; i++) {
      if(seen[i]) continue;
      Queue<Integer> que = new ArrayDeque<>();
      que.add(i);
      int tmp = 0;

      while(!que.isEmpty()){

        int now = que.poll();
        if(seen[now]) continue;
        tmp++;
        seen[now] = true;

        for (int next : g.adjacency[now]) {
            if(seen[next]) continue;
            que.add(next);
        }
      }

      ans = Math.max(ans, tmp);
    }

    out.println(ans);
    out.flush();
  }
}
