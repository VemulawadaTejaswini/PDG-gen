import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main{

 Scanner sc=new Scanner(System.in);;

 int INF=1<<28;
 double EPS=1e-9;

 int[][] a;
 int w, h;
 boolean[][] visited;

 void run(){
  for(;;){
   h=sc.nextInt();
   w=sc.nextInt();
   if((h|w)==0){
    break;
   }
   a=new int[h][w];
   visited=new boolean[h][w];
   for(int j=0; j<h; j++){
    String s=sc.next();
    for(int i=0; i<w; i++){
     switch(s.charAt(i)){
     case '@':
      a[j][i]=0;
      break;
     case '#':
      a[j][i]=1;
      break;
     case '*':
      a[j][i]=2;
      break;
     }
    }
   }
   solve();
  }
 }

 void solve(){
  int ans=0;
  for(int j=0; j<h; j++){
   for(int i=0; i<w; i++){
    if(!visited[j][i]){
     ans++;
     bfs(i, j);
    }
   }
  }
  println(ans+"");
 }

 void bfs(int x, int y){
  LinkedList<P> que=new LinkedList<P>();
  que.offer(new P(x, y));
  visited[y][x]=true;
  int[] dx={0, 0, -1, 1};
  int[] dy={-1, 1, 0, 0};
  for(; !que.isEmpty();){
   P p=que.poll();
   for(int i=0; i<4; i++){
    P q=new P(p.x+dx[i], p.y+dy[i]);
    if(q.x>=0&&q.x<w&&q.y>=0&&q.y<h&&!visited[q.y][q.x]
      &&a[p.y][p.x]==a[q.y][q.x]){
     que.offer(q);
     visited[q.y][q.x]=true;
    }
   }
  }
 }

 class P{
  int x, y;

  P(int x, int y){
   this.x=x;
   this.y=y;
  }
 }

 void debug(Object... os){
  System.err.println(Arrays.deepToString(os));
 }

 void print(String s){
  System.out.print(s);
 }

 void println(String s){
  System.out.println(s);
 }

 public static void main(String[] args){
  new Main().run();
 }
}

