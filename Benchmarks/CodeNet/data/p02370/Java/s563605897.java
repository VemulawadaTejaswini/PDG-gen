import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.math.BigInteger;

public class Main{

static PrintWriter out;
static InputReader ir;

static void solve(){
 int V=ir.nextInt();
 int E=ir.nextInt();
 G g=new G(V,false);
 for(int i=0;i<E;i++) g.addEdge(ir.nextInt(),ir.nextInt());
 int[] tpo=g.buildTPO();
 for(int i=0;i<V;i++) out.println(tpo[i]);
}

static class G{

 AL[] g;
 private int V;
 private boolean ndir;

 public G(int V,boolean ndir){
  this.V=V;
  this.ndir=ndir;
  g=new AL[V];
  for(int i=0;i<V;i++){
   g[i]=new AL();
  }
 }

 public void addEdge(int u,int v,int t){
  g[u].add(new int[]{v,t});
  if(this.ndir) g[v].add(new int[]{u,t});
 }

 public int[] dijkstra(int s,int[] prev){
  int[] dist=new int[this.V];
  java.util.PriorityQueue<int[]> pque=new java.util.PriorityQueue<int[]>(11,new Comparator<int[]>(){
   public int compare(int[] a,int[] b){
    return Integer.compare(a[0],b[0]);
   }
  });
  Arrays.fill(dist,1<<26);
  dist[s]=0;
  pque.offer(new int[]{0,s});
  while(!pque.isEmpty()){
   int[] p=pque.poll();
   int v=p[1];
   if(dist[v]<p[0]) continue;
   for(int i=0;i<g[v].size();i++){
    int to=g[v].get(i)[0],cost=g[v].get(i)[1];
    if(dist[to]>dist[v]+cost){
     dist[to]=dist[v]+cost;
     pque.offer(new int[]{dist[to],to});
    }
   }
  }
  return dist;
 }

 public int[] buildTPO(){
  boolean[] vis=new boolean[this.V];
  ArrayList<Integer> ord=new ArrayList<>();
  for(int i=0;i<this.V;i++) if(!vis[i]) ts(i,vis,ord);
  int[] ret=new int[V];
  for(int i=ord.size()-1;i>=0;i--) ret[ord.size()-1-i]=ord.get(i);
  return ret;
 }

 private void ts(int now,boolean[] vis,ArrayList<Integer> ord){
  vis[now]=true;
  int to;
  for(int i=0;i<g[now].size();i++){
   to=g[now].get(i)[0];
   if(!vis[to]) ts(to,vis,ord);
  }
  ord.add(now);
 }

 static class AL extends ArrayList<int[]>{};
}

public static void main(String[] args) throws Exception{
 ir=new InputReader(System.in);
 out=new PrintWriter(System.out);
 solve();
 out.flush();
}

static class InputReader {
 private InputStream in;
 private byte[] buffer=new byte[1024];
 private int curbuf;
 private int lenbuf;

 public InputReader(InputStream in) {this.in=in; this.curbuf=this.lenbuf=0;}
 
 public boolean hasNextByte() {
  if(curbuf>=lenbuf){
   curbuf= 0;
   try{
    lenbuf=in.read(buffer);
   }catch(IOException e) {
    throw new InputMismatchException();
   }
   if(lenbuf<=0) return false;
  }
  return true;
 }

 private int readByte(){if(hasNextByte()) return buffer[curbuf++]; else return -1;}
 
 private boolean isSpaceChar(int c){return !(c>=33&&c<=126);}
 
 private void skip(){while(hasNextByte()&&isSpaceChar(buffer[curbuf])) curbuf++;}
 
 public boolean hasNext(){skip(); return hasNextByte();}
 
 public String next(){
  if(!hasNext()) throw new NoSuchElementException();
  StringBuilder sb=new StringBuilder();
  int b=readByte();
  while(!isSpaceChar(b)){
   sb.appendCodePoint(b);
   b=readByte();
  }
  return sb.toString();
 }
 
 public int nextInt() {
  if(!hasNext()) throw new NoSuchElementException();
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
  if(!hasNext()) throw new NoSuchElementException();
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

 public double nextDouble(){return Double.parseDouble(next());}

 public BigInteger nextBigInteger(){return new BigInteger(next());}

 public int[] nextIntArray(int n){
  int[] a=new int[n];
  for(int i=0;i<n;i++) a[i]=nextInt();
  return a;
 }

 public long[] nextLongArray(int n){
  long[] a=new long[n];
  for(int i=0;i<n;i++) a[i]=nextLong();
  return a;
 }

 public char[][] nextCharMap(int n,int m){
  char[][] map=new char[n][m];
  for(int i=0;i<n;i++) map[i]=next().toCharArray();
  return map;
 }
}
}