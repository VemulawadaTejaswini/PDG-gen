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
import java.math.BigDecimal;
      
public class Main{
  
static final InputStream in=System.in;
static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;
static final long LINF=Long.MAX_VALUE/2;
static int n,m,a,b,c;
static Deque<Integer> queA,queB,queC;
  
public static void main(String[] args) throws IOException{
InputReader ir=new InputReader(in);
while(true){
n=ir.nextInt();
m=ir.nextInt();
if(n==0&&m==0) break;
queA=new ArrayDeque<Integer>();
queB=new ArrayDeque<Integer>();
queC=new ArrayDeque<Integer>();
a=ir.nextInt();
for(int i=0;i<a;i++) queA.offerFirst(ir.nextInt());
b=ir.nextInt();
for(int i=0;i<b;i++) queB.offerFirst(ir.nextInt());
c=ir.nextInt();
for(int i=0;i<c;i++) queC.offerFirst(ir.nextInt());
int ans=dfs(0,0);
out.println(ans>m?-1:ans);
}
out.flush();
}

public static int dfs(int depth,int prev){
if(depth>m||queA.size()==n||queC.size()==n) return depth;
int s=m+1,t=m+1,u=m+1,v=m+1;
if(prev!=3&&!queA.isEmpty()){
if(queB.isEmpty()||(!queB.isEmpty()&&queA.peekFirst()>queB.peekFirst())){
int temp=queA.pollFirst();
queB.offerFirst(temp);
s=dfs(depth+1,1);
queB.pollFirst();
queA.offerFirst(temp);
}
}
if(prev!=4&&!queC.isEmpty()){
if(queB.isEmpty()||(!queB.isEmpty()&&queC.peekFirst()>queB.peekFirst())){
int temp=queC.pollFirst();
queB.offerFirst(temp);
t=dfs(depth+1,2);
queB.pollFirst();
queC.offerFirst(temp);
}
}
if(!queB.isEmpty()){
if(prev!=1){
if(queA.isEmpty()){
int temp=queB.pollFirst();
queA.offerFirst(temp);
u=dfs(depth+1,3);
queA.pollFirst();
queB.offerFirst(temp);
}
else if(queB.peekFirst()>queA.peekFirst()){
int temp=queB.pollFirst();
queA.offerFirst(temp);
u=dfs(depth+1,3);
queA.pollFirst();
queB.offerFirst(temp);
}
}
if(prev!=2){
if(queC.isEmpty()){
int temp=queB.pollFirst();
queC.offerFirst(temp);
v=dfs(depth+1,4);
queC.pollFirst();
queB.offerFirst(temp);
}
else if(queB.peekFirst()>queC.peekFirst()){
int temp=queB.pollFirst();
queC.offerFirst(temp);
v=dfs(depth+1,4);
queC.pollFirst();
queB.offerFirst(temp);
}
}
}
return Math.min(Math.min(s,t),Math.min(u,v));
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