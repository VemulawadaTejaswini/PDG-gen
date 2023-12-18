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
 int n=ir.nextInt();
 int m=ir.nextInt();
 int K=ir.nextInt();
 int[] a=new int[m],b=new int[m],l=new int[m];
 G g=new G(n,true);
 for(int i=0;i<m;i++){
  a[i]=ir.nextInt()-1;
  b[i]=ir.nextInt()-1;
  l[i]=ir.nextInt();
  g.addEdge(a[i],b[i],l[i]);
 }
 int[] s=ir.nextIntArray(K);
 for(int i=0;i<K;i++) s[i]--;
 int[][] d=new int[n][];
 for(int i=0;i<n;i++) d[i]=g.dijkstra(i);
 int[] md=new int[n];
 for(int i=0;i<n;i++){
  md[i]=1<<27;
  for(int j=0;j<K;j++){
   md[i]=Math.min(md[i],d[i][s[j]]);
  }
 }
 int ma=0;
 for(int i=0;i<n;i++){
  for(int j=0;j<g.g[i].size();j++){
   ma=Math.max(ma,(int)(md[i]+md[g.to(i,j)]+g.cost(i,j)+1)/2);
  }
 }
 out.println(ma);
}

static class G{

 AL[] g,rg;
 private int V;
 private boolean ndir;

 public G(int V,boolean ndir){
  this.V=V;
  this.ndir=ndir;
  g=new AL[V];
  for(int i=0;i<V;i++) g[i]=new AL();
 }

 public void addEdge(int u,int v,int t){
  g[u].add(new int[]{v,t});
  if(this.ndir) g[v].add(new int[]{u,t});
 }

 public void addEdge(int u,int v){
  addEdge(u,v,0);
 }

 public int to(int from,int ind){return g[from].get(ind)[0];}

 public int cost(int from,int ind){return g[from].get(ind)[1];}

 public int size(int from){return g[from].size();}

 public int[] dijkstra(int s){
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
    int to=to(v,i),cost=cost(v,i);
    if(dist[to]>dist[v]+cost){
     dist[to]=dist[v]+cost;
     pque.offer(new int[]{dist[to],to});
    }
   }
  }
  return dist;
 }

 public int[] tporder(){
  boolean[] vis=new boolean[V];
  ArrayList<Integer> ord=new ArrayList<>();
  for(int i=0;i<V;i++) if(!vis[i]) ts(i,vis,ord);
  int[] ret=new int[V];
  for(int i=ord.size()-1;i>=0;i--) ret[ord.size()-1-i]=ord.get(i);
  return ret;
 }

 public int[] scc(){
  rg=new AL[V];
  for(int i=0;i<V;i++) rg[i]=new AL();
  int from,to;
  for(int i=0;i<V;i++){
   for(int j=0;j<g[i].size();j++){
    to=i;
    from=to(i,j);
    rg[from].add(new int[]{to,0});
   }
  } 
  int[] ord=tporder();
  int k=0;
  boolean[] vis=new boolean[V];
  int[] ret=new int[V+1];
  for(int i=0;i<V;i++) if(!vis[i]) rs(ord[i],vis,ret,k++);
  ret[V]=k;
  return ret;
 }

 private void ts(int now,boolean[] vis,ArrayList<Integer> ord){
  vis[now]=true;
  int to;
  for(int i=0;i<g[now].size();i++){
   to=to(now,i);
   if(!vis[to]) ts(to,vis,ord);
  }
  ord.add(now);
 }

 private void rs(int now,boolean[] vis,int[] ret,int k){
  vis[now]=true;
  ret[now]=k;
  int to;
  for(int i=0;i<rg[now].size();i++){
   to=rg[now].get(i)[0];
   if(!vis[to]) rs(to,vis,ret,k);
  }
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