import java.io.*;

class Main
{
 public static void main(String[] args) throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  String str = br.readLine();

  int x=Integer.parseInt(str);
     
  int h=x/3600;
  x%=3600;
  
  int m=x/60;
  x%=60;
     
  int s=x;

  System.out.println(h+":"+m+":"+s);
 }
}