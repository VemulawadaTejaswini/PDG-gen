import java.io.*;
class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

String str = br.readLine();
double a = Double.parseDouble(str);
double area = a*a*3.141592653589;
double circum = 2*a*3.141592653589;

System.out.println(area +" "+ circum);
}
}