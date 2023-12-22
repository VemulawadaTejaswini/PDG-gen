import java.io.*;
public class Main{
public static void main(String[] args)throws IOException{
BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
String str=mBufferedReader.readLine();
int h,m,s;
int x=Integer.parseInt(str);
h=x/3600;
x%=3600;
m=x/60;
x%=60;
s=x;
System.out.println(h+":"+m+":"+s);
}
}
