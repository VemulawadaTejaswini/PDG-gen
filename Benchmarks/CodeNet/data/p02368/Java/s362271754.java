import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Runnable {
  static int V;
  static List<List<Integer>> G;
  static List<List<Integer>> rG;
  static List<Integer> vs;
  static boolean[] used;
  static int[] cmp;
  public static void main(String[] args) {
    new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
  }
  public void run() {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int e = Integer.parseInt(sc.next());
    V = n;
    G = new ArrayList<List<Integer>>(n);
    rG = new ArrayList<List<Integer>>(n);
    vs = new ArrayList<Integer>();
    used = new boolean[n];
    cmp = new int[n];

    for(int i = 0; i < n; i++) {
      G.add(new ArrayList<Integer>());
      rG.add(new ArrayList<Integer>());
    }

    for(int i = 0; i < e; i++) {
      int from = Integer.parseInt(sc.next());
      int to = Integer.parseInt(sc.next());
      G.get(from).add(to);
      rG.get(to).add(from);
    }

    for(int i = 0; i < V; i++) {
      used[i] = false;
    }
    vs.clear();

    for(int i = 0; i < V; i++) {
      if(!used[i]) dfs(i);
    }

    for(int i = 0; i < V; i++) {
      used[i] = false;
    }

    int k = 0;  
    for(int i = vs.size() - 1; i >= 0; i--) {
      if(!used[vs.get(i)]) rdfs(vs.get(i), k++);
    }

    int q = Integer.parseInt(sc.next());
    for(int i = 0; i < q; i++) {
      int s = Integer.parseInt(sc.next());
      int t = Integer.parseInt(sc.next());
      if(cmp[s] == cmp[t]) {
        System.out.println(1);
      }
      else{
        System.out.println(0);
      }
    }
  }

  static void dfs(int v) {
    used[v] = true; 
    for(int i = 0; i < G.get(v).size(); i++) {
      if(!used[G.get(v).get(i)]) dfs(G.get(v).get(i));
    }
    vs.add(v);
  }
  
  static void rdfs(int v, int k) {
    used[v] = true;
    cmp[v] = k;
    for(int i = 0; i < rG.get(v).size(); i++) {
      if(!used[rG.get(v).get(i)]) rdfs(rG.get(v).get(i), k);
    }
  }
}