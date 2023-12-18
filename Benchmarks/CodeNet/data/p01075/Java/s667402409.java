import java.util.*;
public class Main{
  Scanner cin = new Scanner(System.in);
  int N,M;
  ArrayList<E>[] graph;

  private class E{
    int v,c;
    public E(int v,int c){
      this.v = v;
      this.c = c;
    }
  }

  private class P{
    int a,b;
    public P(int a,int b){
      this.a = a;
      this.b = b;
    }
  }

  public void solve(){
    N = cin.nextInt();
    M = cin.nextInt();
    graph = new ArrayList[N];
    for(int i = 0;i < N;i++){
      graph[i] = new ArrayList<E>();
    }

    for(int i = 0;i < M;i++){
      int a = cin.nextInt() - 1;
      int b = cin.nextInt() - 1;
      int c = cin.nextInt();
      graph[a].add(new E(b,c));
    }

    Queue<P> q = new ArrayDeque<P>();
    int ans = -1;
    q.offer(new P(0,0));
    while(q.size() > 0){
      P p = q.poll();

      if(p.a == N - 1){
        ans = Math.max(ans,p.b);
      }

      for(E edge : graph[p.a]){
        if(p.b <= edge.c){
          q.offer(new P(edge.v,edge.c));
        }
      }
    }

    System.out.println(ans);
  }
  public static void main(String[] args){
    new Main().solve();
  }
}