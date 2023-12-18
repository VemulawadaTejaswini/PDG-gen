import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;

class problemB {
  void solve(){

    Scanner scan = new Scanner(System.in);

    int v = scan.nextInt();
    int e = scan.nextInt();

    int[][] g = new int[v][v];
    int[] s = new int[e];
    int[] t = new int[e];
    int[] visit = new int[v];
    int cycle = 0;


    for(int i=0 ; i<v ; i++){
      visit[i] = 0;
      for(int j=0 ; j<v ; j++){
        g[i][j] = -1;
      }
    }

    for(int i=0 ; i<e ; i++){
      s[i] = scan.nextInt();
      t[i] = scan.nextInt();
      if(s!=t) g[s[i]][t[i]] = 1;
    }

    for(int i=0 ; i<v ; i++){
      cycle = visitNode(v, i, visit, g);
      if(cycle==1) break;
    }

    System.out.println(cycle);

  }//---end of solve---

  int visitNode(int v, int i, int[] visit, int[][] g){
    visit[i] = 1;
    for(int j=0 ; j<v ; j++){
      if(g[i][j]==1){
        if(visit[j]<1){
          return visitNode(v, j, visit, g);
        }
        return 1;
      }
    }
    return 0;
  }

}//----end of class----

public class Main {
  public static void main(String args[]){
    new problemB().solve();
  }
}

