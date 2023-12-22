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
double f=(double)a/b;
System.out.printf(d+" "+r+" "+"%f",(double)f);
br.close();
}
}