import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.PriorityQueue;
import java.math.BigDecimal;
import java.math.BigInteger;
     
public class Main{
 
static final InputStream in=System.in;
static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;
static final long LINF=Long.MAX_VALUE/2;
static int N,M,X;
static int[] H,prev;
static long[] dist;
static MyArrayList[] list;
 
static class Edge{
int to;
int cost;
public Edge(int to,int cost){
this.to=to; this.cost=cost;
}
}
 
static class Pair{
long x;
int y;
public Pair(long x,int y){
this.x=x; this.y=y;
}
public static final Comparator<Pair> DISTANCE_ORDER=new Comp();
private static class Comp implements Comparator<Pair>{
public int compare(Pair p1,Pair p2){
return (p1.x>p2.x)?1:(p1.x<p2.x)?-1:0;
}
}
}
 
static class MyArrayList extends ArrayList<Edge>{}
 
public static void main(String[] args) throws IOException{
InputReader ir=new InputReader(in);
N=ir.nextInt();
M=ir.nextInt();
X=ir.nextInt();
H=ir.toIntArray(N);
prev=new int[N];
dist=new long[N];
list=new MyArrayList[N];
for(int i=0;i<N;i++) list[i]=new MyArrayList();
for(int i=0;i<M;i++){
int A=ir.nextInt()-1;
int B=ir.nextInt()-1;
int T=ir.nextInt();
if(H[A]>=T) list[A].add(new Edge(B,T));
if(H[B]>=T) list[B].add(new Edge(A,T));
}
dijkstra(0);
if(dist[N-1]==LINF) out.println(-1);
else{
long nh=H[N-1];
int nv=N-1;
long ans=0;
while(nv!=0){
long d=dist[nv]-dist[prev[nv]];
nh+=d;
ans+=d;
if(nh>H[prev[nv]]){
ans+=nh-H[prev[nv]];
nh=H[prev[nv]];
}
nv=prev[nv];
}
ans+=(nh-X);
out.println(ans);
}
out.flush();
}
 
public static void dijkstra(int s){
PriorityQueue<Pair> pque=new PriorityQueue<Pair>(10,Pair.DISTANCE_ORDER);
Arrays.fill(dist,LINF);
dist[s]=0;
pque.offer(new Pair(0,s));
while(!pque.isEmpty()){
Pair p=pque.poll();
int v=p.y;
if(dist[v]<p.x) continue;
MyArrayList array=list[v];
for(int i=0;i<array.size();i++){
Edge e=array.get(i);
if(dist[e.to]>dist[v]+(long)e.cost){
dist[e.to]=dist[v]+(long)e.cost;
prev[e.to]=v;
pque.offer(new Pair(dist[e.to],e.to));
}
else if(dist[e.to]==dist[v]+(long)e.cost){
if(H[prev[e.to]]<H[v]) prev[e.to]=v;
}
}
}
}
 
static class InputReader {
private InputStream in;
private byte[] buffer=new byte[1024];
private int curbuf;
private int lenbuf;
 
public InputReader(InputStream in) {this.in=in;}
   
public int readByte() {
if(lenbuf==-1) throw new InputMismatchException();
if(curbuf>=lenbuf){
curbuf= 0;
try{
lenbuf=in.read(buffer);
}
catch (IOException e) {
throw new InputMismatchException();
}
if(lenbuf<=0)
return -1;
}
return buffer[curbuf++];
}
 
public boolean isSpaceChar(int c){return !(c>=33&&c<=126);}
 
private int skip() {int b; while((b = readByte())!=-1&&isSpaceChar(b)); return b;}
 
public String next() {
int b=skip();
StringBuilder sb=new StringBuilder();
while(!isSpaceChar(b)){
sb.appendCodePoint(b);
b=readByte();
}
return sb.toString();
}
  
public int nextInt() {
int c=readByte();
while (isSpaceChar(c)) c=readByte();
boolean minus=false;
if (c=='-') {
minus=true;
c=readByte();
}
int res=0;
do{
if(c<'0'||c>'9') throw new InputMismatchException();
res=res*10+c-'0';
c=readByte();
}while(!isSpaceChar(c));
return (minus)?-res:res;
}
 
public long nextLong() {
int c=readByte();
while (isSpaceChar(c)) c=readByte();
boolean minus=false;
if (c=='-') {
minus=true;
c=readByte();
}
long res = 0;
do{
if(c<'0'||c>'9') throw new InputMismatchException();
res=res*10+c-'0';
c=readByte();
}while(!isSpaceChar(c));
return (minus)?-res:res;
}
 
public int[] toIntArray(int n){
int[] a=new int[n];
for(int i=0;i<n;i++) a[i]=nextInt();
return a;
}
}
}