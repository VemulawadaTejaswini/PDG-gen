import java.io.*;
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(readStrToInt(br)){
}
br.close();
}
static boolean readStrToInt(BufferedReader br)throws IOException{
String str=br.readLine();
String[] arr=str.split(" ");
int x=Integer.parseInt(arr[0]);
int y=Integer.parseInt(arr[1]);
if(x==0 &&y==0) return false;
swapNum(x, y);
return true;
}
static void swapNum(int x, int y){
if(x<=y) System.out.println(x+" "+y);
System.out.println(y+" "+x);
return
}
}