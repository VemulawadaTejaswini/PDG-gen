import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int H=sc.nextInt();
int W=sc.nextInt();
String[][] k=new String[H][W];
for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
k[i][j]=sc.next();
}
}
int num=0;
for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
kukaku(i,j,H,W);
num++;
}
}
System.out.println(num);
}
public static void kukaku(int x,int y,int h,int w){
String p=k[x][y];
k[x][y]=".";
int[] dx={-1,0,0,1};
int[] dy={0,-1,1,0};
for(int i=0;i<4;i++){
if(p!="."&&p==k[x+dx[i]][y+dy[i]]&&x+dx[i]>=0&&x+dx[i]<h&&y+dy[i]>=0&&y+dy[i]<w){
kukaku(x+dx[i],y+dy[i],h,w);
}
}
}
}