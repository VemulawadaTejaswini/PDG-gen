import java.util.*;

public class MainE {
  final static int INF = 99999999;
  static int[][] adjArr;
  static int v;
  static int[] dist;
  static boolean[] visited;

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    v = scan.nextInt();
    int e = scan.nextInt();
    int s = scan.nextInt();

    adjArr = new int[v][v];
    dist = new int[v];
    visited = new boolean[v];

    Arrays.fill(dist, INF);
    Arrays.fill(visited, false);
    for(int[] i : adjArr) Arrays.fill(i, INF);

    int start;
    int end;
    int weight;
    for(int i = 0 ; i < e; i++) {
      start = scan.nextInt();
      end = scan.nextInt();
      weight = scan.nextInt();
      adjArr[start][end] = weight;
    }

    /*
    for(int i = 0 ; i < v ; i++) {
      for(int j = 0 ; j < v ; j++) {
        System.out.print(adjArr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("------------------");*/

    dist[s] = 0;
    dijkstra();

    for(int i = 0 ; i < v ; i++) {
      if(dist[i] == INF) {
        System.out.println("INF");
      } else System.out.println(dist[i]);
    }
  }

  static void dijkstra() {
    int shortestDist;
    int shortestPoint = 0;
    for(int i = 0 ; i < v ; i++) {
      shortestDist = INF;
      for(int j = 0 ; j < v ; j++) { // 最小距離調査
        if(visited[j]==false &&  dist[j] < shortestDist) {
          shortestDist = dist[j];
          shortestPoint = j;
        }
      }

      visited[shortestPoint] = true;

      for(int j = 0 ; j < v ; j++) { // 距離設定
        if(dist[shortestPoint] + adjArr[shortestPoint][j] < dist[j]) {
          dist[j] = dist[shortestPoint] + adjArr[shortestPoint][j];
        }
      }
    }
  }
}
