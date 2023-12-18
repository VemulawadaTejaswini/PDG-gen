import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
    
class Main{
    
static final int INF=Integer.MAX_VALUE/2;
static final PrintWriter out=new PrintWriter(System.out);
    
static class Pair{
int x;
int y;
Pair(int x,int y){
this.x=x; this.y=y;
}
static final Comparator<Pair> DISTANCE_ORDER=new DistanceOrderComparator();
public static class DistanceOrderComparator implements Comparator<Pair>{
public int compare(Pair p1,Pair p2){
return (p1.x>p2.x)?-1:(p1.x<p2.x)?1:0;
}
}
}

static class Edge{
int to;
int cost;
Edge(int to,int cost){
this.to=to; this.cost=cost;
}
}

static class MyArrayList extends ArrayList<Edge>{}
    
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
StringTokenizer st1=new StringTokenizer(line);
int v=Integer.parseInt(st1.nextToken());
int e=Integer.parseInt(st1.nextToken());
int r=Integer.parseInt(st1.nextToken());
MyArrayList[] array=new MyArrayList[v];
int[] d=new int[v];
for(int i=0;i<v;i++) array[i]=new MyArrayList();
for(int i=0;i<e;i++){
line=br.readLine();
StringTokenizer st2=new StringTokenizer(line);
int s=Integer.parseInt(st2.nextToken());
int t=Integer.parseInt(st2.nextToken());
int c=Integer.parseInt(st2.nextToken());
array[s].add(new Edge(t,c));
}
djkstra(r,d,array);
for(int i=0;i<v;i++){
out.println((d[i]==INF)?"INF":d[i]);
}
out.flush();
}
}

private static void djkstra(int r,int[] d,MyArrayList[] array){
PriorityQueue<Pair> pque=new PriorityQueue<Pair>(1,Pair.DISTANCE_ORDER);
Arrays.fill(d,INF);
d[r]=0;
pque.offer(new Pair(0,r));
while(!pque.isEmpty()){
Pair p=pque.poll();
int v=p.y;
ArrayList<Edge> list=array[v];
if(d[v]<p.x||list.size()==0) continue;
for(int i=0;i<list.size();i++){
Edge e=list.get(i);
int to=e.to;
int dv=d[v];
int cost=e.cost;
if(d[to]>dv+cost){
d[to]=dv+cost;
pque.offer(new Pair(d[to],to));
}
}
}
}
}