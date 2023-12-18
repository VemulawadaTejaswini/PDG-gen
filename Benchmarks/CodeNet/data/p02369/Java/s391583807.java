import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;

class problemB {
  void solve(){

    Scanner scan = new Scanner(System.in);
    int v = scan.nextInt();
    int e = scan.nextInt();

    int[][] g = new int[v][v];
    int[] visit = new int[v];
    int cycle = 0;


    for(int i=0 ; i<v ; i++){
      visit[i] = 0;
      for(int j=0 ; j<v ; j++){
        g[i][j] = -1;
      }
    }

    for(int i=0 ; i<e ; i++){
      int s = scan.nextInt();
      int t = scan.nextInt();
      if(s!=t) g[s][t] = 1;
    }

    for(int i=0 ; i<e ; i++){
      for(int j=0 ; j<e ; j++){
        if(g[i][j]==1) cycle = visitNode(j, g, visit);
      }
    }

    System.out.println(cycle);

  }//---end of solve---

  int visitNode(int s, int[][] g, int[] visit){
    visit[s] = 1;
    for(int i=0 ; i<g[s].length ; i++){
      if(g[s][i] == 1){
        if(visit[s] < 0) visitNode(i, g, visit);
        else{
         return 1;
        }
      }
    }
    return 0;
  }//----end of visitNode----
}//----end of class----

public class Main {
  public static void main(String args[]){
    new problemB().solve();
  }
}

