import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

String str = br.readLine();
int space1 = str.indexOf(" ");
int space2 = str.indexOf(" ", space1+1);


double a = Double.parseDouble(str.substring(0, space1));
double b = Double.parseDouble(str.substring(space1+1, space2));
double c_d = Integer.parseInt(str.substring(space2+1));
double c = c_d  * Math.PI / 180;


double s = a*b*Math.cos((double)c) / 2;
double l = a+b+Math.sqrt((a-b*Math.cos((double)c))*(a-b*Math.cos((double)c)) + (b*Math.sin((double)c))*(b*Math.sin((double)c)));
double h = b*Math.sin((double)c);

System.out.println(s);
System.out.println(l);
System.out.println(h);


}
}