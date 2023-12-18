import java.io.*;
import java.util.Arrays;

class Main{

static final int INF=Integer.MAX_VALUE/2;

static class Edge{
int from;
int to;
int cost;
Edge(int from,int to,int cost){
this.from=from; this.to=to; this.cost=cost;
}
}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int v=Integer.parseInt(line);
int e=Integer.parseInt(br.readLine());
int r=Integer.parseInt(br.readLine());
Edge[] es=new Edge[e];
int[] d=new int[v];
for(int i=0;i<e;i++){
int s=Integer.parseInt(br.readLine());
int t=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
es[i]=new Edge(s,t,c);
}
BellmanFord(e,r,es,d);
for(int i=0;i<v;i++) System.out.println(d[i]);
}
}

private static void BellmanFord(int e,int r,Edge[] es,int[] d){
Arrays.fill(d,INF);
d[r]=0;
while(true){
boolean update=false;
for(int i=0;i<e;i++){
Edge ee=es[i];
if(d[ee.to]>d[ee.from]+d[ee.cost]){
d[ee.to]=d[ee.from]+d[ee.cost];
update=true;
}
}
if(!update) break;
}
}
}