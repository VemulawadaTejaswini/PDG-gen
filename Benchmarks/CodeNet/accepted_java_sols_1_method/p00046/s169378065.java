import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
double height;
double max=Double.parseDouble(br.readLine());
double min=max;
while((line=br.readLine())!=null){
height=Double.parseDouble(line);
max=Math.max(max,height);
min=Math.min(min,height);
}
System.out.println(max-min);
}
}