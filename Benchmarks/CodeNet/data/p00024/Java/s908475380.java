import java.io.*;

class Main{
public static void main(String[] args){
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
while((str=br.readLine())!=null){
double n=Double.parseDouble(str);
int f=(int)(Math.pow(n,2)/98)+2;
System.out.println(f);
}
}
}