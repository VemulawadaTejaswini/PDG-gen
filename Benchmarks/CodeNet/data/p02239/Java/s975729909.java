import java.io.*;
import java.util.*;

class Main{
  static int count = 0;
  static int a = 1;
  static int[] list;

  final static int INF = 100;

  public static void main(String[] args)throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    int[][] G = new int[n+1][n];
    int[] d = new int[n+1];

    list = new int[n+1];

    for(int i=0 ; i<n ; i++){
      String[] str = bf.readLine().split(" ");
      int x = Integer.parseInt(str[0]);
      int y = Integer.parseInt(str[1]);
      d[x] = -1;

      for(int j=0 ; j<y ; j++){
        G[x][j] = Integer.parseInt(str[j+2]);
      }
    }

    d[1] = 0;
    list[0] = 1;

    search(G, d);

    for(int i=1 ; i<=n ; i++){
      System.out.println(i + " " + d[i]);
    }

  }

  static void search(int[][] G, int[] d){
    for(;count<a ; count++){
      int fr = list[count];

      for(int i=0 ; i<G[fr].length ; i++){
        int v = G[fr][i];
        if(d[v] == -1){
          d[v] = d[fr] + 1;
          list[a++] = v;
        }
      }
    }
  }
}

