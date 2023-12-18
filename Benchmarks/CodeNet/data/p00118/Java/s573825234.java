import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int H=sc.nextInt();
int W=sc.nextInt();
String[][] k=new String[H][W];
for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
k[i][j]=sc.next;
}
}
solve();
}
void kukaku(int x,int y){
String p=this.k[x][y];
this.k[x][y]=".";
int[] dx={-1,0,0,1};
int[] dy={0,-1,1,0};
for(int i=0;i<4;i++){
if(p!="."&&p==this.k[x+dx[i]][y+dy[i]]&&x+dx[i]>=0&&x+dx[i]<this.H&&y+dy[i]>=0&&y+dy[i]<this.W){
kukaku(x+dx[i],y+dy[i]);
}
}
return;
}
public void solve(){
int num=0;
for(int i=0;i<this.H;i++){
for(int j=0;j<this.W;j++){
kukaku(i,j);
num++;
}
}
System.out.println(num);
}
}