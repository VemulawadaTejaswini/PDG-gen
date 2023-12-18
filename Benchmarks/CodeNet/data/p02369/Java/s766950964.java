import java.util.*;

public class Main {
  static final int WHITE = 0;
  static final int GRAY = 1;
  static final int BLACK = 2;
  static int v;
  static Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
  static int color[];
  static boolean judge = false;

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    v = scan.nextInt();
    int e = scan.nextInt();

    int start,end = 0;
    for(int i = 0 ; i < e ; i++) {
      start = scan.nextInt();
      end = scan.nextInt();
      if(!adjList.containsKey(start)) {
        adjList.put(start, new ArrayList<Integer>());
      }
      adjList.get(start).add(end);
    }

    color = new int[v];
    for(int i : adjList.keySet()){
      dfs(i);
    }

    if(judge) {
      System.out.println(1);
    } else System.out.println(0);
  }

  static void dfs(int u) {
    color[u] = GRAY;
    if(adjList.containsKey(u)) {
      for(int ne : adjList.get(u)) {
        if(color[ne] == GRAY) {
          judge = true;
          break;
        }
        if(color[ne] == WHITE) dfs(ne);
      }
    }
    color[u] = BLACK;
  }
}
