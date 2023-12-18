import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
line=br.readLine();
int d=line.length()/3;
char[][][] map=new char[d][3][3];
for(int i=0;i<line.length();i++){
map[(int)i/3][0][i%3]=line.charAt(i);
}
for(int j=1;j<=2;j++){
line=br.readLine();
for(int i=0;i<line.length();i++){
map[(int)i/3][j][i%3]=line.charAt(i);
}
}
outside:
for(int i=0;i<d;i++){
for(int j=0;j<3;j++){
if(map[i][j][0]!='s'&&map[i][j][0]==map[i][j][1]&&map[i][j][1]==map[i][j][2]){
System.out.println(String.valueOf(map[i][j][0]));
continue outside;
}
if(map[i][0][j]!='s'&&map[i][0][j]==map[i][1][j]&&map[i][1][j]==map[i][2][j]){
System.out.println(String.valueOf(map[i][0][j]));
continue outside;
}
}
if(map[i][1][1]=='s'){
System.out.println("d");
}
else if(map[i][0][0]==map[i][1][1]&&map[i][1][1]==map[i][2][2]){
System.out.println(String.valueOf(map[i][1][1]));
}
else if(map[i][0][2]==map[i][1][1]&&map[i][1][1]==map[i][2][0]){
System.out.println(String.valueOf(map[i][1][1]));
}
else{
System.out.println("d");
}
}
}
}