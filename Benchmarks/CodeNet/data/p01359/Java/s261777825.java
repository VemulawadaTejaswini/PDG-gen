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
 for(;;){
  int n=ir.nextInt();
  int q=ir.nextInt();
  if(n==0&&q==0) return;
  Era[] es=new Era[n];
  for(int i=0;i<n;i++){
   String name=ir.next();
   int eby=ir.nextInt();
   int wy=ir.nextInt();
   es[i]=new Era(wy-eby+1,wy,name);
  }
  Arrays.sort(es,new Comparator<Era>(){
   public int compare(Era a,Era b){
    return Integer.compare(a.begin,b.begin);
   }
  });
  while(q-->0){
   int qs=ir.nextInt();
   int ind=upper_bound(es,0,n-1,qs)-1;
   if(ind<0||qs>es[ind].end) out.println("Unknown");
   else out.println(es[ind].name);
  }
 }
}

static class Era{

 int begin,end;
 String name;

 public Era(int begin,int end,String name){
  this.begin=begin;
  this.end=end;
  this.name=name;
 }
}

public static int upper_bound(Era[] a,int fromIndex,int toIndex,int val){
 if(a[fromIndex].begin>val) return fromIndex;
 if(a[toIndex].begin<=val) return toIndex+1;
 int lb=fromIndex-1,ub=toIndex;
 while(ub-lb>1){
  int mid=(ub+lb)/2;
  if(a[mid].begin>val){
   ub=mid;
  }
  else{
   lb=mid;
  }
 }
 return ub;
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