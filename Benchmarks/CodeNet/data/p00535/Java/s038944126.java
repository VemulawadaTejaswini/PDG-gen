import java.io.*;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{

static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;
static int[] d={-1,0,1};

static class Pair{
int x;
int y;
Pair(int x,int y){
this.x=x; this.y=y;
}
}

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
StringTokenizer st=new StringTokenizer(line);
int h=Integer.parseInt(st.nextToken());
int w=Integer.parseInt(st.nextToken());
int[][] map=new int[h][w];
for(int i=0;i<h;i++){
line=br.readLine();
for(int j=0;j<w;j++){
map[i][j]=(line.charAt(j)=='.')?INF:(int)(line.charAt(j)-'0');
}
}
int cnt=0;
while(true){
if(bfs(h,w,map)) cnt++;
else break;
}
out.println(cnt);
out.flush();
}
}

private static boolean bfs(int h,int w,int[][] map){
Deque<Pair> que=new ArrayDeque<Pair>();
int[][] hmap=new int[h][];
boolean update=false;
for(int i=0;i<h;i++) hmap[i]=map[i].clone();
for(int i=0;i<h;i++){
for(int j=0;j<w;j++){
if(map[i][j]!=INF){
que.offerLast(new Pair(i,j));
}
}
}
while(!que.isEmpty()){
Pair p=que.pollFirst();
int x=p.x;
int y=p.y;
int nx;
int ny;
int cnt=0;
loop:
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
if(i==1&&j==1) continue loop;
nx=x+d[i];
ny=y+d[j];
if(hmap[nx][ny]==INF) cnt++;
if(cnt>=hmap[x][y]){
map[x][y]=INF;
update=true;
break loop;
}
}
}
}
return update;
}
}