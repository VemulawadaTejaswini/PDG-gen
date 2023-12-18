import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
char[][] map;
while(!(line=br.readLine()).equals("0")){
if(line.isEmpty()){
continue;
}
int n=Integer.parseInt(line);
int m=Integer.parseInt(br.readLine());
int g=Integer.parseInt(br.readLine());
int d=Integer.parseInt(br.readLine());
map=new char[d][n+1];
for(int i=0;i<d;i++){
line="0"+br.readLine()+"0";
for(int j=0;j<=n;j++){
map[i][j]=line.charAt(j);
}
}
System.out.println(solve(m,g,map));
}
}

private static boolean canReachGoal(int m,int g,char[][] map){
int now=m;
for(int i=0;i<map.length;i++){
if(map[i][now-1]=='1'){
now--;
}
else if(map[i][now]=='1'){
now++;
}
}
return g==now;
}

private static String solve(int m,int g,char[][] map){
if(canReachGoal(m,g,map)){
return "0";
}
for(int i=0;i<map.length;i++){
for(int j=1;j<=map[0].length-2;j++){
if(map[i][j-1]=='0'&&map[i][j]=='0'&&map[i][j+1]=='0'){
map[i][j]='1';
if(canReachGoal(m,g,map)){
return String.valueOf(i+1)+" "+String.valueOf(j);
}
map[i][j]='0';
}
}
}
return "1";
}
}