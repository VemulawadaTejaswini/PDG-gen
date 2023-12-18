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
 res=ir.nextInt();
 total=0;
 map=new int[10][];
 drop=new int[10][10][3];
 for(int i=0;i<10;i++)
  map[i]=ir.nextIntArray(10);
 for(int i=0;i<10;i++)
  for(int j=0;j<10;j++)
   total+=map[i][j];
 if(search(1,1,3)){
  for(int i=1;i<9;i++){
   for(int j=1;j<9;j++){
    for(int k=0;k<3;k++){
     if(drop[i][j][k]!=0){
      for(int l=0;l<drop[i][j][k];l++){
       out.println(j+" "+i+" "+(k+1));
      }
     }
    }
   }
  }
 }
}

static int total,res; 
static final int[] sx={0,0,1,0,-1},sy={0,1,0,-1,0},mx={0,0,1,0,-1,-1,-1,1,1},my={0,1,0,-1,0,-1,1,-1,1},lx={0,0,1,0,-1,-1,-1,1,1,0,2,0,-2},ly={0,1,0,-1,0,-1,1,-1,1,2,0,-2,0};
static int[][] map;
static int[][][] drop;

static void sd(int x,int y){
 for(int i=0;i<sx.length;i++){
  map[x+sx[i]][y+sy[i]]--;
 }
 total-=5;
 res--;
}

static void sr(int x,int y){
 for(int i=0;i<sx.length;i++){
  map[x+sx[i]][y+sy[i]]++;
 }
 total+=5;
 res++;
}

static boolean scd(int x,int y){
 for(int i=0;i<sx.length;i++){
  int nx=x+sx[i];
  int ny=y+sy[i];
  if(nx<0||ny<0||nx>=10||ny>=10||map[nx][ny]==0){
   return false;
  }
 }
 return true;
}

static void md(int x,int y){
 for(int i=0;i<mx.length;i++){
  map[x+mx[i]][y+my[i]]--;
 }
 total-=9;
 res--;
}

static void mr(int x,int y){
 for(int i=0;i<mx.length;i++){
  map[x+mx[i]][y+my[i]]++;
 }
 total+=9;
 res++;
}

static boolean mcd(int x,int y){
 for(int i=0;i<mx.length;i++){
  int nx=x+mx[i];
  int ny=y+my[i];
  if(nx<0||ny<0||nx>=10||ny>=10||map[nx][ny]==0){
   return false;
  }
 }
 return true;
}

static void ld(int x,int y){
 for(int i=0;i<lx.length;i++){
  map[x+lx[i]][y+ly[i]]--;
 }
 total-=13;
 res--;
}

static void lr(int x,int y){
 for(int i=0;i<lx.length;i++){
  map[x+lx[i]][y+ly[i]]++;
 }
 total+=13;
 res++;
}

static boolean lcd(int x,int y){
 for(int i=0;i<lx.length;i++){
  int nx=x+lx[i];
  int ny=y+ly[i];
  if(nx<0||ny<0||nx>=10||ny>=10||map[nx][ny]==0){
   return false;
  }
 }
 return true;
}

public static boolean searchnext(int x,int y){
 if(x==8){
  return search(1,y+1,3);
 }
 return search(x+1,y,3);
}

public static boolean search(int x,int y,int size){
 if(res==0&&total==0){
  return true;
 }
 else if(total<res*5||total>res*13){
  return false;
 }
 else if(res==0){
  return false;
 }
 if(y==9){
  return false;
 }
 if(y>2&&x==1){
  for(int i=0;i<10;i++){
   if(map[i][y-3]!=0){
    return false;
   }
  }
 }
 while(true){
  switch(size){
   case 3:if(lcd(x,y)){
           ld(x,y);
           drop[x][y][2]++;
           if(searchnext(x,y)){
            return true;
           }
           else{
            if(scd(x,y)&&search(x,y,3)){
             return true;
            }
            lr(x,y);
            drop[x][y][2]--;
           }
          }
          size--;

   case 2:if(mcd(x,y)){
           md(x,y);
           drop[x][y][1]++;
           if(searchnext(x,y)){
            return true;
           }
           else{
            if(scd(x,y)&&search(x,y,2)){
            return true;
           }
           mr(x,y);
           drop[x][y][1]--;
          }
         }
         size--;

   case 1:if(scd(x,y)){
           sd(x,y);
           drop[x][y][0]++;
           if(searchnext(x,y)){
            return true;
           }
           else{
            if(scd(x,y)&&search(x,y,1)){
             return true;
            }
            sr(x,y);
            drop[x][y][0]--;
           }
          }
          size--;

   case 0:return searchnext(x,y);
  }
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