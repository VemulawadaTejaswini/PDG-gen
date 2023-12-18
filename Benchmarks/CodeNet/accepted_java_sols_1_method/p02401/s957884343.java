import java.io.*;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x=0;
boolean i=true;
while(i){
String str=br.readLine();
String[] arr=str.split(" ");
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[2]);
switch(arr[1]){
case "+": x=a+b; break;
case "-": x=a-b; break;
case "*": x=a*b; break;
case "/": x=a/b; break;
case "?": i=false; break;
default: break;
}
if(i==true) System.out.println(x);
}
br.close();
}
}