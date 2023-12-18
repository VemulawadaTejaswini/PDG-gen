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
 while(true){
  int n=ir.nextInt();
  if(n==0) return;
  P[] ps=new P[n];
  for(int i=0;i<n;i++){
   ps[i]=new P(ir.nextDouble(),ir.nextDouble());
  }
  P[] c=convexHull(ps);
  out.println(ps.length-c.length);
  System.gc();
 }
}

public static P[] convexHull(P[] ps){
 int n=ps.length;
 Arrays.sort(ps,new Comparator<P>(){
  public int compare(P a,P b){
   if(a.getX()!=b.getY()) return Double.compare(a.getX(),b.getX());
   return Double.compare(a.getY(),b.getY());
  }
 });
 int p=0;
 P[] qs=new P[2*n];
 for(int i=0;i<n;i++){
  while(p>1&&(qs[p-1].sub(qs[p-2])).det(ps[i].sub(qs[p-1]))<=0) p--;
  qs[p++]=ps[i];
 }
 for(int i=n-2,t=p;i>=0;i--){
  while(p>t&&(qs[p-1].sub(qs[p-2])).det(ps[i].sub(qs[p-1]))<=0) p--;
  qs[p++]=ps[i];
 }
 return Arrays.copyOf(qs,p-1);
}

static final double EPS=1e-10;

public static double accurateTotal(double a,double b){
 if(Math.abs(a+b)<EPS*(Math.abs(a)+Math.abs(b))) return 0.0;
 return a+b;
}

static class P{

 public double x,y;

 public P(double x,double y){
  this.x=x; this.y=y;
 }

 public double getX(){
  return this.x;
 }

 public double getY(){
  return this.Y;
 }

 public P add(P v){
  return new P(accurateTotal(this.x,v.x),accurateTotal(this.y,v.y));
 }

 public P sub(P v){
  return new P(accurateTotal(this.x,-v.x),accurateTotal(this.y,-v.y));
 }

 public P mul(double k){
  return new P(this.x*k,this.y*k);
 }

 public double dot(P v){
  return accurateTotal(this.x*v.x,this.y*v.y);
 }

 public double det(P v){
  return accurateTotal(this.x*v.y,-this.y*v.x);
 }
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
 
 private boolean isSpaceChar(int c){return !(c>=33&&c<=126)||(c==',');}
 
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