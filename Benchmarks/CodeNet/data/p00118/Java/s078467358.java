import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
public int H=sc.nextInt();
public int W=sc.nextInt();
public String[][] k=new String[H][W];
for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
k[i][j]=sc.next;
}
}
solve();
}
void kukaku(int x,int y){
String p=k[x][y];
k[x][y]=".";
int[] dx={-1,0,0,1};
int[] dy={0,-1,1,0};
for(int i=0;i<4;i++){
if(p!="."&&p==k[x+dx[i]][y+dy[i]]&&x+dx[i]>=0&&x+dx[i]<H&&y+dy[i]>=0&&y+dy[i]<W){
kukaku(x+dx[i],y+dy[i]);
}
}
return;
}
public void solve(){
int num=0;
for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
kukaku(i,j);
num++;
}
}
System.out.println(num);
}
}