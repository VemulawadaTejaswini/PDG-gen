import java.io.*;
import java.util.*;

class Main {
  int[][] map;
  int V;
  int E;
  boolean[] used;

  public int traverse(int current, int minNum) {
    if (current == V - 1) {
      return minNum;
    }

    used[current] = true;

    for (int i = 0; i < V; i++) {
      if (Integer.MAX_VALUE != map[current][i] && 0 < map[current][i] && !used[i]) {

        int d = traverse(i, Math.min(minNum, map[current][i]));
        if (d > 0) {
          map[current][i] -= d;
          map[i][current] += d;
          return d;
        }
      }
    }
    return 0;
  }

  public void run() {
    Scanner sc = new Scanner(System.in);
    V = sc.nextInt();
    E = sc.nextInt();

    map = new int[V][V];

    for (int i = 0; i < V; i++) {
      for (int j = 0; j < V; j++) {
        map[i][j] = Integer.MAX_VALUE;
      }
    }

    // input
    for (int i = 0; i < E; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      int c = sc.nextInt();

      map[u][v] = c;
      map[v][u] = 0;
    }

    int ans = 0;

    while (true) {
      used = new boolean[V];
      int d = traverse(0,  Integer.MAX_VALUE);
      if (d == 0) break;
      ans += d;
    }

    System.out.println(ans);
  }

  public static void main(String[] args) {
    new Main().run();
  }
}

