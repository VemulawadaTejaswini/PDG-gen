import java.io.*;
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
String[] arr=str.split(" ");
int a=Integer.parseInt(arr[0]);
int b=Integer.parseInt(arr[1]);
int d=a/b;
int r=a%b;
float fa=(float)a;
float fb=(float)b;
float f=fa/fb;

System.out.println(d+" "+r+" "+f);
br.close();
}
}