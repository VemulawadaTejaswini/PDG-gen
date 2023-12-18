
import java.util.Scanner; 

 class Main{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int H=sc.nextInt();
 int W=sc.nextInt();
 char[][] k=new char[H][W];
 for(int i=0; i< H; i++){
String line=sc.next();
 for(int j=0; j< W; j++){
 k[i][j]=line.charAt(j);
 }
 }
 int num=0;
 for(int i=0; i<H; i++){
 for(int j=0; j<W; j++){
 if(k[i][j]!=' '){
 dfs(i,j,H,W,k);
 num++;
 }
 }
 }
 System.out.println(num);
 }
 public static void dfs(int I,int J,final int H,final int W,char[][] k){
 char p=k[I][J];
 k[I][J]=' ';
 int[] dx={-1,0,0,1};
 int[] dy={0,-1,1,0};
 for(int t=0;t<4;t++){
 if(I+dx[t]>=0&&I+dx[t]<H&&J+dy[t]>=0&&J+dy[t]<W&&p==k[I+dx[t]][J+dy[t]]&&k[I+dx[t]][J+dy[t]]!=' '){
 dfs(I+dx[t],J+dy[t],H,W,k);
 }
 }
 return;
 }
 }