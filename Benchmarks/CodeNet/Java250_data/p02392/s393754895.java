import java.io.*;

class Main
{
 public static void main(String[] args) throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  String[] str=br.readLine().split(" ");

  int a=Integer.parseInt(str[0]),b=Integer.parseInt(str[1]),c=Integer.parseInt(str[2]);

  if(a<b && b<c)
   System.out.println("Yes");
  else
   System.out.println("No");
 }
}