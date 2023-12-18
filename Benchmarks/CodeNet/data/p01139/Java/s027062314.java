import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.math.BigInteger;

public class Main{

static PrintWriter out;
static InputReader ir;

static void solve(){
 for(;;){
  int w=ir.nextInt();
  int h=ir.nextInt();
  if(w==0&&h==0) return;
  char[][] map=ir.nextCharMap(h,w);
  int[][] cnd=new int[h][w];
  for(int i=0;i<h;i++){
   for(int j=0;j<w;j++){
    if(map[i][j]!='.') bfs(i,j,map[i][j]=='B'?1:2,map,cnd);
   }
  }
  int bl=0,wh=0;
  for(int i=0;i<h;i++){
   for(int j=0;j<w;j++){
    if(cnd[i][j]==1) bl++;
    if(cnd[i][j]==2) wh++;
   }
  }
  out.println(bl+" "+wh);
 }
}

static final int[] dd=new int[]{0-1,0,1};

public static boolean in(int x,int y,int h,int w){
 return (x>=0&&y>=0&&x<h&&y<w);
}

public static void bfs(int x,int y,int m,char[][] map,int[][] cnd){
 int h=map.length,w=map[0].length;
 Deque<int[]> que=new ArrayDeque<>();
/* for(int i=0;i<4;i++){
  int nx=x+dd[i],ny=y+dd[i^1];
 // if(!in(nx,ny,h,w)) continue;
 // if(map[nx][ny]=='.'&&(cnd[nx][ny]&m)==0) que.offerLast(new int[]{nx,ny});
 }*/
 /*while(!que.isEmpty()){
  int[] p=que.pollFirst();
  int px=p[0],py=p[1];
  cnd[px][py]|=m;
  for(int i=0;i<4;i++){
   int nx=px+dd[i],ny=py+dd[i^1];
   if(!in(nx,ny,h,w)) continue;
   if(map[nx][ny]=='.'&&(cnd[nx][ny]&m)==0) que.offerLast(new int[]{nx,ny});
  }
 }*/
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