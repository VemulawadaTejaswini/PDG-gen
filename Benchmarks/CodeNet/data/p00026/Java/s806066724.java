import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int[][] di=new int[10][10];
int count=0;
int max=0;
String str;
while((str=br.readLine())!=null){
String[] value=str.split(",");
int x=Integer.parseInt(value[0]);
int y=Integer.parseInt(value[1]);
int s=Integer.parseInt(value[2]);
drop(x,y,s,di);
}
for(int i=0;i<10;i++){
for(int j=0;j<10;j++){
max=Math.max(max,di[i][j]);
if(di[i][j]==0){
count++;
}
}
}
System.out.println(count);
System.out.println(max);
}
static void drop(int x,int y,int s,int[][] di){
if(s==1||s==2||s==3){
di[x][y]++;
int[] sx={1,0,-1,0};
int[] sy={0,1,0,-1};
for(int i=0;i<sx.length;i++){
if(x+sx[i]>=0&&x+sx[i]<10&&y+sy[i]>=0&&y+sy[i]<10){
di[x+sx[i]][y+sy[i]]++;
}
}
if(s==2||s==3){
int[] mx={-1,-1,1,1};
int[] my={-1,1,-1,1};
for(int i=0;i<mx.length;i++){
if(x+mx[i]>=0&&x+mx[i]<10&&y+my[i]>=0&&y+my[i]<10){
di[x+mx[i]][y+my[i]]++;
}
}
if(s==3){
int[] lx={-2,0,2,0};
int[] ly={0,-2,0,2};
for(int i=0;i<lx.length;i++){
if(x+lx[i]>=0&&x+lx[i]<10&&y+ly[i]>=0&&y+ly[i]<10){
di[x+lx[i]][y+ly[i]]++;
}
}
}
}
}
}
}