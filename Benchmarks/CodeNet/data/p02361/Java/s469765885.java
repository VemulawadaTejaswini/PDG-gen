import java.util.*;

class Main {
  final static int INF = 99999999;
  static int[][] adjArr;
  static int v;
  static int[] shortDist;
  static boolean[] visited;

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    v = scan.nextInt();
    int e = scan.nextInt();
    int s = scan.nextInt();

    adjArr = new int[v][v];
    shortDist = new int[v];
    visited = new boolean[v];

    Arrays.fill(shortDist, INF);
    Arrays.fill(visited, false);
    for(int[] i : adjArr) Arrays.fill(i, 0);

    int start;
    int end;
    int weight;
    for(int i = 0 ; i < e; i++) {
      start = scan.nextInt();
      end = scan.nextInt();
      weight = scan.nextInt();
      adjArr[start][end] = weight;
    }
    shortDist[s] = 0;

    /*
    for(int i = 0 ; i < v ; i++) {
      for(int j = 0 ; j < v ; j++) {
        System.out.print(adjArr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("------------------");*/

    dijkstra();

    for(int i : shortDist) {
      if(i == INF) {
        System.out.println("INF");
      } else System.out.println(i);
    }
  }

  static void dijkstra() {
    while(true) {
      int u = getMin();
      if(u == -1) {
        break;
      }
      if(shortDist[u] == INF) {
        break;
      }
      visited[u] = true;
      for(int i = 0 ; i < v ; i++) {
        if(adjArr[u][i] > 0) {
          int neighbor = i;
          int wei = adjArr[u][i];
          int newL = shortDist[u] + wei;
          if(newL < shortDist[neighbor]) {
            shortDist[neighbor] = newL;
          }
        }
      }
    }
  }

  // startから最小の距離の頂点取得
  static int getMin() {
    int tmp = INF;
    for(int i = 0 ; i < v ; i++) {
      if(visited[i] == false && shortDist[i] < tmp) {
        tmp = i;
      }
    }
    if(tmp == INF) {
      tmp = -1;
    }
    return tmp;
  }

}
