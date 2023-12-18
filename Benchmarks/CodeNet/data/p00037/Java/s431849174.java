import java.io.*;
import java.awt.*;
import java.util.*;
 
class Main{
static char[][] map=new char[9][5];
static String[] dp=new String[40];
//n??????????????????????????¨????(?????????n=0??????¨??????"")
static int[][] times=new int[5][5];
//????????????x,y?????????£???????????¨????(?????????0,0???0???¨??????)
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
for(int i=0;i<9;i++){
line=br.readLine();
for(int j=0;j<4;j++){
map[i][j]=line.charAt(j);
}
if(i%2==1){
map[i][4]=line.charAt(4);
}
}
gotoPath(0,1);
System.out.print("\n");
}
static String turnLeft(String dir){
if(dir=="R"){
return "U";
}
if(dir=="U"){
return "L";
}
if(dir=="L"){
return "D";
}
else{
return "R";
}
}
static String turnRight(String dir){
if(dir=="R"){
return "D";
}
if(dir=="U"){
return "R";
}
if(dir=="L"){
return "U";
}
else{
return "L";
}
}
static void gotoDirection(String dir,int x,int y){
if(dir=="R"){
y++;
}
if(dir=="U"){
x--;
}
if(dir=="L"){
y--;
}
else{
x++;
}
}
static String returntoStart(String dir){
if(dir=="R"){
return "L";
}
if(dir=="U"){
return "D";
}
if(dir=="L"){
return "R";
}
else{
return "U";
}
}
static boolean cangoNext(String dir,int x,int y){
if(dir=="R"){
if(y+1<=4&&map[2*x][y]=='1'){
return true;
}
else{
return false;
}
}
if(dir=="U"){
if(x-1>=0&&map[2*x-1][y]=='1'){
return true;
}
else{
return false;
}
}
if(dir=="L"){
if(y-1>=0&&map[2*x][y-1]=='1'){
return true;
}
else{
return false;
}
}
else{
if(x+1<=4&&map[2*x+1][y]=='1'){
return true;
}
else{
return false;
}
}
}
static void gotoPath(int x,int y){
Point p=new Point(x,y);
int count=0;
times[0][0]=count++;
dp[count]="R";
System.out.print("R");
Deque<Point> que=new ArrayDeque<Point>();
que.offerLast(p);
while(que.peekFirst()!=null){
p=que.pollFirst();
int px=p.x;
int py=p.y;
if((px&py)==0){
return;
}
int t=times[px][py];
if(t!=0){
for(int i=t;i>0;i--){
String str=dp[i];
System.out.print(returntoStart(str));
}
px=0;
py=0;
}
times[px][py]=count;
String dir=dp[count];
String dirl=turnLeft(dir);
String dirr=turnRight(dir);
if(cangoNext(dirl,px,py)){
gotoDirection(dirl,px,py);
System.out.print(dirl);
dp[count+1]=dirl;
}
else if(cangoNext(dir,px,py)){
gotoDirection(dir,px,py);
System.out.print(dir);
dp[count+1]=dir;
}
else if(cangoNext(dirr,px,py)){
gotoDirection(dirr,px,py);
System.out.print(dirr);
dp[count+1]=dirr;
}
else{
for(int i=count;i>0;i--){
String str=dp[i];
System.out.print(returntoStart(str));
}
px=0;
py=0;
}
count++;
Point np=new Point(px,py);
que.offerLast(np);
}
}
}