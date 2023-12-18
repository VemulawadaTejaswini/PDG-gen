import java.io.*;

ckass Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int count;
char[][] map=new char[12][12];
while(true){
count=0;
for(int i=0;i<12;i++){
line=br.readLine();
for(int j=0;j<12;j++){
map[i][j]=line.charAt(j);
}
}
for(int i=0;i<12;i++){
for(int j=0;j<12;j++){
if(map[i][j]=='1'){
dfs(i,j,map);
count++;
}
}
}
System.out.println(count);
line=br.readLine();
if(line==null){
break;
}
}
}
private static void dfs(int x,int y,char[][] map){
int nx,ny;
map[x][y]='0';
int[] dx={-1,0,1,0};
int[] dy={0,-1,0,1};
for(int i=0;i<4;i++){
nx=x+dx[i];
ny=x+dy[i];
if(nx>=0&&nx<12&&ny>=0&&ny<12&&map[nx][ny]=='1'){
dfs(nx,ny,map);
}
}
return;
}
}