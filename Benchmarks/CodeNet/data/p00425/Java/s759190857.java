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
import java.util.InputMismatchException;
import java.util.Map;
import java.util.PriorityQueue;
import java.math.BigInteger;
    
public class Main{

static final InputStream in=System.in;
static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;
static final long LINF=Long.MAX_VALUE/2;
static String str;

public static void main(String[] args) throws IOException{
InputReader ir=new InputReader(in);
while(true){
int n=ir.nextInt();
if(n==0) break;
int[] d={1,2,4,5,3,6};
int ans=1;
while(n-->0){
String command=ir.next();
int top=d[0];
int front=d[1];
int left=d[2];
int back=d[3];
int right=d[4];
int bottom=d[5];
if("North".equals(command)){
d[3]=top; d[0]=front; d[1]=bottom; d[5]=back;
}
else if("East".equals(command)){
d[4]=top; d[5]=right; d[2]=bottom; d[0]=left;
}
else if("West".equals(command)){
d[2]=top; d[0]=right; d[4]=bottom; d[5]=left;
}
else if("South".equals(command)){
d[1]=top; d[5]=front; d[3]=bottom; d[0]=back;
}
else if("Right".equals(command)){
d[2]=front; d[3]=left; d[4]=back; d[1]=right;
}
else{
d[4]=front; d[1]=left; d[2]=back; d[3]=right;
}
ans+=d[0];
}
out.println(ans);
}
out.flush();
}

public static boolean isPalindrome(int s,int e){
for(int i=0;i<=(e-s)/2;i++) if(str.charAt(s+i)!=str.charAt(e-i)) return false;
return true;
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