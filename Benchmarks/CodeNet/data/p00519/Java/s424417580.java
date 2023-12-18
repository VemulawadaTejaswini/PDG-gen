import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

class Main{
    
static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE;

public static class Edge{
int to;
int cost;
public Edge(int to){
this.to=to; cost=0;
}
public Edge(int to,int cost){
this.to=to; this.cost=cost;
}
}

public static class Pair{
int x;
int y;
public Pair(int x,int y){
this.x=x; this.y=y;
}
public static final Comparator<Pair> DISTANCE_ORDER=new Comp();
private static class Comp implements Comparator<Pair>{
public int compare(Pair p1,Pair p2){
return (p1.x>p2.x)?1:(p1.x<p2.x)?-1:0;
}
}
}

public static class MyArrayList extends ArrayList<Edge>{}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line.split(" ")[0]);
int k=Integer.parseInt(line.split(" ")[1]);
int[] c=new int[n];
int[] d=new int[n];
int[] dist=new int[n];
boolean[][] visited=new boolean[n][n];
MyArrayList[] array=new MyArrayList[n];
for(int i=0;i<n;i++){
line=br.readLine();
c[i]=Integer.parseInt(line.split(" ")[0]);
d[i]=Integer.parseInt(line.split(" ")[1]);
array[i]=new MyArrayList();
}
MyArrayList[] carray=array.clone();
for(int i=0;i<k;i++){
line=br.readLine();
int a=Integer.parseInt(line.split(" ")[0])-1;
int b=Integer.parseInt(line.split(" ")[1])-1;
array[a].add(new Edge(b));
array[b].add(new Edge(a));
}
for(int i=0;i<n;i++) bfs(i,d[i],visited,array);
for(int i=0;i<n;i++){
for(int j=0;j<n&&j!=i;j++){
if(visited[i][j]) carray[i].add(new Edge(j,c[i]));
}
}
dijkstra(dist,carray);
}
out.flush();
}

public static void bfs(int s,int t,boolean[][] visited,MyArrayList[] array){
Arrays.fill(visited[s],false);
Deque<Pair> que=new ArrayDeque<Pair>();
que.offerLast(new Pair(s,t));
while(!que.isEmpty()){
Pair p=que.pollFirst();
int ns=p.x;
visited[s][ns]=true;
ArrayList<Edge> list=array[ns];
if(p.y<=0) continue;
for(int i=0;i<list.size();i++){
Edge e=list.get(i);
if(!visited[s][e.to]) que.offerLast(new Pair(e.to,p.y-1));
}
}
}

public static void dijkstra(int[] dist,MyArrayList[] array){
PriorityQueue<Pair> pque=new PriorityQueue<Pair>(1,Pair.DISTANCE_ORDER);
Arrays.fill(dist,INF);
dist[0]=0;
pque.offer(new Pair(0,0));
while(!pque.isEmpty()){
Pair p=pque.poll();
int v=p.y;
if(v==dist.length-1) out.println(dist[dist.length-1]);
ArrayList<Edge> list=array[v];
if(dist[v]<p.x||list.size()==0) continue;
for(int i=0;i<list.size();i++){
Edge e=list.get(i);
if(dist[e.to]>dist[v]+e.cost){
dist[e.to]=dist[v]+e.cost;
pque.offer(new Pair(dist[e.to],e.to));
}
}
}
}
}