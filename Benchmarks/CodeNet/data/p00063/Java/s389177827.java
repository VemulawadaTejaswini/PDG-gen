import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int count=0;
while((line=br.readLine())!=null){
StringBuffer sb=new StringBuffer(line);
if(sb.reverse().toString().equals(line)){
count++;
}
}
System.out.println(count);
}
}