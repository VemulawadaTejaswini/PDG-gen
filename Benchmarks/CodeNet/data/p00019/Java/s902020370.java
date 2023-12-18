import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
while((str=br.readLine())!=null){
int x=Integer.parseInt(str);
System.out.println(fact(x));
}
}
private static long fact(int x){
if(x==0){return 1;}
return x*fact(x-1);
}
}