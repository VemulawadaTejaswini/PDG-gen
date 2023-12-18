import java.io.*;
class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

String str = br.readLine();
double a = Double.parseDouble(str);
double area = a*a*Math.PI;
double circum = 2*a*Math.PI;

System.out.println(area +" "+ circum);
}
}