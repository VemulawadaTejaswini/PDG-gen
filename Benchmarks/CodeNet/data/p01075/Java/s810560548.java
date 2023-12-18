import java.util.*;
public class Main{
  Scanner cin = new Scanner(System.in);
  int N,M;
  ArrayList<ArrayList<E>> graph;

  private class E{
    int v,c;
    public E(int v,int c){
      this.v = v;
      this.c = c;
    }
  }

  public int dfs(int v,int t){
    if(v == N - 1){
      return t;
    }
    int ret = -1;
    for(E e : graph.get(v)){
      if(t <= e.c){
        ret = Math.max(ret,dfs(e.v,e.c));
      }
    }
    return ret;
  }

  public void solve(){
    N = cin.nextInt();
    M = cin.nextInt();
    graph = new ArrayList<ArrayList<E>>();
    for(int i = 0;i < N;i++){
      graph.add(new ArrayList<E>());
    }

    for(int i = 0;i < M;i++){
      int a = cin.nextInt() - 1;
      int b = cin.nextInt() - 1;
      int c = cin.nextInt();
      graph.get(a).add(new E(b,c));
    }

    System.out.println(dfs(0,0));
  }
  public static void main(String[] args){
    new Main().solve();
  }
}