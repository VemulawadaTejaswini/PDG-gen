import java.util.Scanner;
import java.util.ArrayList;

class ProblemA{
  void solve(){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int q = scan.nextInt();

    DisjointSet ds = new DisjointSet(n);

    for(int i=0 ; i<q ; ++i){
      int com = scan.nextInt();
      int x = scan.nextInt();;
      int y = scan.nextInt();

      if(com == 0) ds.union(x, y);
      else if(com == 1){
        if(ds.same(x, y)) System.out.println("1");
        else System.out.println("0");
      }
    }//---- end of loop ----
  }//---- end of solve ----
}

class DisjointSet{
  ArrayList<Integer> rank = null;
  ArrayList<Integer> p = null;

  DisjointSet(){}
  DisjointSet(int size){
    rank = new ArrayList<Integer>(size);
    p = new ArrayList<Integer>(size);

    for(int i=0 ; i<size ; ++i){
      makeSet(i);
    }
  }

  void makeSet(int x){
    p.add(x);
    rank.add(0);
  }

  void union(int x, int y){
    link(findSet(x), findSet(y));
  }

  void link(int x, int y){
    if(rank.get(x) > rank.get(y)){
      p.set(x, y);
    }
    else{
      p.set(x, y);
      if(rank.get(x) == rank.get(y)){
        rank.set(y, y+1);
      }
    }
  }

  boolean same(int x, int y){
    return findSet(x) == findSet(y);
  }

  int findSet(int x){
    if(x != p.get(x)){
        p.set(x, findSet(p.get(x)));
    }
    return p.get(x);
  }
}//----end of class DisjointSet


public class Main{
  public static void main(String[] args){
    new ProblemA().solve();
  }
}

