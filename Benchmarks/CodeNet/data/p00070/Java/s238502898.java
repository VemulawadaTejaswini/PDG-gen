import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.math.BigDecimal;
import java.math.BigInteger;
    
public class Main{
 
static PrintWriter out;
static InputReader ir;
static final int INF=Integer.MAX_VALUE;
static final long LINF=Long.MAX_VALUE;
 
static void solve(){
 int[][][] dp=new int[2][1<<9][10101];
 while(ir.hasNext()){
  int n=ir.nextInt();
  int s=ir.nextInt();
  if(n>=10){
   out.println(0);
   continue;
  }
  for(int i=0;i<2;i++){
   for(int j=0;j<1<<9;j++){
    for(int k=0;k<10101;k++){
     dp[i][j][k]=0;
    }
   }
  }
  dp[0][0][0]=1;
  for(int i=0;i<n;i++){
   int now=i%2;
   for(int j=0;j<1<<9;j++){
    for(int k=0;k<9;k++){
     if((j&(1<<k))==0){
      for(int l=0;l+(i+1)*k<10101;l++){
       dp[now^1][j|(1<<k)][l+(i+1)*k]+=dp[now][j][l];
      }
     }
    }
   }
  }
  int ans=0;
  for(int i=0;i<1<<9;i++){
   ans+=dp[n%2][i][s];
  }
  out.println(ans);
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
 
 public BigInteger nextBigInteger(){return new BigInteger(next());}
 
 public BigDecimal nextBigDecimal(){return new BigDecimal(next());}
 
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