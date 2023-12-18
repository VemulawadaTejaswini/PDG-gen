import java.io.*;
 
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
int n=Integer.parseInt(line);
System.out.println(1+n*(n+1)/2);
}
}
}