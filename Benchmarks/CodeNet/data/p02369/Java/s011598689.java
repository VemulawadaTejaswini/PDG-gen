import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;

class problemB {
  ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
  int[] visit = null;

  void solve(){
    Scanner scan = new Scanner(System.in);

    int v = scan.nextInt();
    int e = scan.nextInt();

    visit = new int[v];

    int cycle = 0;

    for(int i=0 ; i<v ; ++i){
      g.add(new ArrayList<Integer>());
    }

    for(int i=0 ; i<e ; ++i){
      int s = scan.nextInt();
      int t = scan.nextInt();
      if(s!=t) g.get(s).add(t);
    }

    for(int i=0 ; i<v ; ++i){
      visitClear();
      visit[i] = 1;
      for(int j : g.get(i)){
        cycle = visitNode(j);
        if(cycle==1) break;
      }
      if(cycle==1) break;
    }
    System.out.println(cycle);

  }//---end of solve---

  int visitNode(int i){
    visit[i] = 1;
    int cycle = 0;
    for(int j : g.get(i)){
        if(visit[j]<1){
          cycle = visitNode(j);
        }
        else{
          return 1;
        }
        if(cycle==1) break;
    }
    visit[i] = -1;
    return cycle;
  }

  void visitClear(){
    for(int i=0 ; i<visit.length ; ++i) visit[i] = -1;
  }

}//----end of class----

public class Main {
  public static void main(String args[]){
    new problemB().solve();
  }
}

