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
static int[][] drop=new int[10][10];
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
if(nx<0||ny<0||nx>=10||ny>=10||map[nx][ny]<=0){
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
if(nx<0||ny<0||nx>=10||ny>=10||map[nx][ny]<=0){
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
if(nx<0||ny<0||nx>=10||ny>=10||map[nx][ny]<=0){
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
if(drop[i][j]!=0){
System.out.println(i+" "+j+" "+drop[i][j]);
}
}
}
}
}
static boolean searchnext(int x,int y){
if(y==8){
return search(x+1,1,3);
}
return search(x,y+1,3);
}
static boolean search(int x,int y,int size){
if(res==0&&total==0){
return true;
}
else if(total<5){
return false;
}
if(x==9){
return false;
}
if(x>2&&y==1){
for(int i=0;i<10;i++){
if(map[x-3][i]!=0){
return false;
}
}
}
switch(size){
case 3:if(lcd(x,y)){
       ld(x,y);
       if(searchnext(x,y)){
       drop[x][y]=size;
       return true;
       break;
       }
       else{
       lr(x,y);
       }
       }
       size--;
case 2:if(mcd(x,y)){
       md(x,y);
       if(searchnext(x,y)){
       drop[x][y]=size;
       return true;
       break;
       }
       else{
       mr(x,y);
       }
       }
       size--;
case 1:if(scd(x,y)){
       sd(x,y);
       if(searchnext(x,y)){
       drop[x][y]=size;
       return true;
       break;
       }
       else{
       sr(x,y);
       }
       }
       size--;
case 0:drop[x][y]=size;
       return searchnext(x,y);
       break;
}
}
}