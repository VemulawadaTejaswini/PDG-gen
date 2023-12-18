import java.io.*;

class Main
{
 public static void main(String[] args) throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  String str1 = br.readLine();
  String str2 = br.readLine();

  int x=Integer.parseInt(str1);
  int y=Integer.parseInt(str2);

  System.out.println(x*y + " " + (2*x+2*y));
 }
}