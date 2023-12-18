import java.util.*;
import java.io.*;

class Main{
  public static StringBuilder bl = new StringBuilder();
  public static int n;
  public static int M[][];
  public static final int INFTY = (int)Double.POSITIVE_INFINITY;
  public static final int WHITE = 0;
  public static final int GRAY = 1;
  public static final int BLACK = 2;

  public static void main(String args[])throws Exception{
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // n = Integer.parseInt(br.readLine());
    Scanner sc = new Scanner(System.in);
    int k;
    int u;
    int v;
    n = sc.nextInt();
    M = new int[n][n];

    for(int i = 0 ; i < n; i++){
      for(int j = 0; j < n; j++){
        M[i][j] = INFTY;
      }
    }

    for(int i = 0 ;i<n; i++){
      // String s[] = br.readLine().split("\\s+");
      u = sc.nextInt();
      k = sc.nextInt();
      for(int j =0; j<k; j++){
        v = sc.nextInt();
        M[u][v] = sc.nextInt();
      }
    }
    dijkstra(0);
  }

  static void dijkstra(int s){
    int color[] = new int[n];
    int d[] = new int[n]; //最短経路コスト
    int p[] = new int[n];//親
    int minv;

    //初期化
    for(int i = 0; i < n; i++){
      d[i] = INFTY;
      color[i] = WHITE;
    }
    
    d[s]= 0;
    p[s] = -1;
    color[s] = GRAY;
    //
    while(true){
      minv = INFTY;
      int u = -1;
      for(int i = 0; i<n;i++){
        if(minv>d[i] && color[i]!=BLACK){
          u = i;
          minv = d[i];
        }
      }
      if(u == -1)break;
      color[u] = BLACK;
      for( int v = 0; v < n; v++){
        if(color[v] != BLACK && M[u][v] != INFTY){
          if(d[v] > d[u] + M[u][v]){
            d[v] = d[u] + M[u][v];
            color[v] = GRAY;
          }
        }
      }
    }
    for( int i = 0; i<n; i++){
      bl.append(i).append(" ").append((d[i]==INFTY ? -1 : d[i])).append("\n");
    }
    System.out.print(bl);
  }
}
