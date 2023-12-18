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
 boolean[] p=sieveOfEratosthenes(100000);
 Fraction[] d=new Fraction[100001];
 for(int i=1;i<=100000;i++){
  for(int j=(int)Math.sqrt(i);j>0;j--){
   if(i%j!=0) continue;
   if(!p[j]||!p[i/j]) continue;
   d[i]=new Fraction((long)j,(long)i/j);
   break;
  }
 }
 for(;;){
  int m=ir.nextInt();
  if(m==0) return;
  Fraction f=new Fraction(ir.nextLong(),ir.nextLong());
  while(d[m]==null||d[m].subtract(f).signum()!=1) m--;
  out.println(d[m].toString());
 }
}

public static boolean[] sieveOfEratosthenes(int n){
 boolean[] ret=new boolean[n+1];
 Arrays.fill(ret,true);
 ret[0]=ret[1]=false;
 for(int i=2;i<=Math.sqrt(n);i++){
  if(ret[i]){
   for(int j=i*2;j<=n;j+=i) ret[j]=false;
  }
 }
 return ret;
}

public static long gcd(long a,long b){
 if(b==0) return a;
 return gcd(b,a%b);
}

static class Fraction{
 
 long de,nu;
 
 public Fraction(long nu,long de){
  this.nu=nu;
  this.de=de;
  long g=gcd(nu,de);
  this.nu/=g;
  this.de/=g;
 }
 
 public Fraction add(Fraction a){
  return reduct(new Fraction(this.nu*a.de+this.de*a.nu,this.de*a.de));
 }
 
 public Fraction subtract(Fraction a){
  return reduct(new Fraction(this.nu*a.de-this.de*a.nu,this.de*a.de));
 }
 
 public Fraction multiply(Fraction a){
  return reduct(new Fraction(this.nu*a.nu,this.de*a.de));
 }
 
 public Fraction divide(Fraction a){
  return reduct(new Fraction(this.nu*a.de,this.de*a.nu));
 }
 
 public Fraction reduct(Fraction a){
  long g=gcd(a.nu,a.de);
  return new Fraction(a.nu/g,a.de/g);
 }

 public double doubleValue(){
  return (double)this.nu/(double)this.de;
 }

 public static boolean signum(){
  if(nu==0) return 0;
  if(de*nu>0) return 1;
  return -1;
 }

 public String toString(){
  return Long.toString(this.nu)+" "+Long.toString(this.de);
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