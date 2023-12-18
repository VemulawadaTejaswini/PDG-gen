import java.io.*;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
int n=Integer.parseInt(str);
int[][][] residents=new int[4][3][10];
for(int i=0; i<n; i++){
String str2=br.readLine();
String[] data=str2.split(" ");
int b=Integer.parseInt(data[0])-1;
int f=Integer.parseInt(data[1])-1;
int r=Integer.parseInt(data[2])-1;
int v=Integer.parseInt(data[3]);
residents[b][f][r] += v;
}
for(int x=0;x<4;x++){
for(int y=0;y<3;y++){
for(int z=0;z<10;z++){
System.out.print(" "+residents[x][y][z]);
if(z==9) System.out.println();
if(x!=3 && y==2 && z==9) System.out.println("####################");
}
}
}
}
}