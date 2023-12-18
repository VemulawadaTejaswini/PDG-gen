import java.io.*;
       
class Main{
static int[] sx={0,0,1,0,-1};
static int[] sy={0,1,0,-1,0};
static int[] mx={0,0,1,0,-1,-1,-1,1,1};
static int[] my={0,1,0,-1,0,-1,1,-1,1};
static int[] lx={0,0,1,0,-1,-1,-1,1,1,0,2,0,-2};
static int[] ly={0,1,0,-1,0,-1,1,-1,1,2,0,-2,0};
static int total;
static int res;
static int[][] map=new int[10][10];
static int[][][] drop=new int[10][10][3];
static void sd(int x,int y){
for(int i=0;i<sx.length;i++){
map[x+sx[i]][y+sy[i]]--;
}
total-=5;
res--;
}
static void sr(int x,int y){
for(int i=0;i<sx.length;i++){
map[x+sx[i]][y+sy[i]]++;
}
total+=5;
res++;
}
static boolean scd(int x,int y){
for(int i=0;i<sx.length;i++){
int nx=x+sx[i];
int ny=y+sy[i];
if(nx<0||ny<0||nx>=10||ny>=10||map[nx][ny]==0){
return false;
}
}
return true;
}
static void md(int x,int y){
for(int i=0;i<mx.length;i++){
map[x+mx[i]][y+my[i]]--;
}
total-=9;
res--;
}
static void mr(int x,int y){
for(int i=0;i<mx.length;i++){
map[x+mx[i]][y+my[i]]++;
}
total+=9;
res++;
}
static boolean mcd(int x,int y){
for(int i=0;i<mx.length;i++){
int nx=x+mx[i];
int ny=y+my[i];
if(nx<0||ny<0||nx>=10||ny>=10||map[nx][ny]==0){
return false;
}
}
return true;
}
static void ld(int x,int y){
for(int i=0;i<lx.length;i++){
map[x+lx[i]][y+ly[i]]--;
}
total-=13;
res--;
}
static void lr(int x,int y){
for(int i=0;i<lx.length;i++){
map[x+lx[i]][y+ly[i]]++;
}
total+=13;
res++;
}
static boolean lcd(int x,int y){
for(int i=0;i<lx.length;i++){
int nx=x+lx[i];
int ny=y+ly[i];
if(nx<0||ny<0||nx>=10||ny>=10||map[nx][ny]==0){
return false;
}
}
return true;
}
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
res=Integer.parseInt(br.readLine());
total=0;
for(int i=0;i<10;i++){
String[] value=br.readLine().split(" ");
for(int j=0;j<10;j++){
int num=Integer.parseInt(value[j]);
map[i][j]=num;
total+=num;
}
}
if(search(1,1,3)){
for(int i=1;i<9;i++){
for(int j=1;j<9;j++){
for(int k=0;k<3;k++){
if(drop[i][j][k]!=0){
for(int l=0;l<drop[i][j][k];l++){
int m=k+1;
System.out.println(j+" "+i+" "+m);
}
}
}
}
}
}
}
static boolean searchnext(int x,int y){
if(x==8){
return search(1,y+1,3);
}
return search(x+1,y,3);
}
static boolean search(int x,int y,int size){
if(res==0&&total==0){
return true;
}
else if(total<res*5||total>res*13){
return false;
}
else if(res==0){
return false;
}
if(y==9){
return false;
}
if(y>2&&x==1){
for(int i=0;i<10;i++){
if(map[i][y-3]!=0){
return false;
}
}
}
while(true){
switch(size){
case 3:if(lcd(x,y)){
       ld(x,y);
       drop[x][y][2]++;
       if(searchnext(x,y)){
       return true;
       }
       else{
       if(scd(x,y)&&search(x,y,3)){
       return true;
       }
       lr(x,y);
       drop[x][y][2]--;
       }
       }
       size--;
case 2:if(mcd(x,y)){
       md(x,y);
       drop[x][y][1]++;
       if(searchnext(x,y)){
       return true;
       }
       else{
       if(scd(x,y)&&search(x,y,2)){
       return true;
       }
       mr(x,y);
       drop[x][y][1]--;
       }
       }
       size--;
case 1:if(scd(x,y)){
       sd(x,y);
       drop[x][y][0]++;
       if(searchnext(x,y)){
       return true;
       }
       else{
       if(scd(x,y)&&search(x,y,1)){
       return true;
       }
       sr(x,y);
       drop[x][y][0]--;
       }
       }
       size--;
case 0:return searchnext(x,y);
}
}
}
}