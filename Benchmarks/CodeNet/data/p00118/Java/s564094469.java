import java.util.*;
 
public class Main{
 
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
 
if(k[i][j]!="."){
 
kukaku(k,i,j,H,W);
 
num++;
 
}
 
}
 
}
 
System.out.println(num);
 
}
 
public static void kukaku(String k[][],int I,int J,int h,int w){
 
String p=k[I][J];
 
k[I][J]=".";
 
int[] dx={-1,0,0,1};
 
int[] dy={0,-1,1,0};
 
for(int i=0;i<4;i++){
 
if(p==k[I+dx[i]][J+dy[i]]&&I+dx[i]>=0&&I+dx[i]<h&&J+dy[i]>=0&&J+dy[i]<w){
 
kukaku(k,I+dx[i],J+dy[i],h,w);
 
}
 
 
}

return;
 
}
 
}