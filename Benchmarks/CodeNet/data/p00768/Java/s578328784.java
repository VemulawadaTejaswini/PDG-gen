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
  int m=ir.nextInt();
  if(m==0) return;
  int t=ir.nextInt();
  int p=ir.nextInt();
  int r=ir.nextInt();
  int[][] dat=new int[t][3];
  int[][] ct=new int[t][p];
  for(int i=0;i<t;i++) dat[i][0]=i+1;
  for(int i=0;i<r;i++){
   int time=ir.nextInt();
   int tID=ir.nextInt()-1;
   int pID=ir.nextInt()-1;
   int cond=ir.nextInt();
   if(ct[tID][pID]<0) continue;
   if(cond==0){
    dat[tID][1]++;
    dat[tID][2]+=ct[tID][pID]*20+time;
    ct[tID][pID]=-1;
   }
   else{
    ct[tID][pID]++;
   }
  }
  Arrays.sort(dat,new Comparator<int[]>(){
   public int compare(int[] a,int[] b){
    if(a[1]!=b[1]) return -Integer.compare(a[1],b[1]);
    if(a[2]!=b[2]) return Integer.compare(a[2],b[2]);
    return -Integer.compare(a[0],b[0]);
   }
  });
  for(int i=0;i<t;){
   int st=i;
   while(i<t&&dat[i][1]==dat[st][1]&&dat[i][2]==dat[st][2]) i++;
   for(int j=st;j<i;j++){
    out.print(dat[j][0]);
    if(j!=i-1) out.print("=");
   }
   if(i!=t) out.print(",");
  }
  out.println();
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