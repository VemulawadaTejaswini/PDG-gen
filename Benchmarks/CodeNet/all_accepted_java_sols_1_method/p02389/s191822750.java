import java.io.*;

class Main
{
   public static void main(String[] args) throws IOException
   {

      BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

      String str1 = br.readLine();
      String str2[] = str1.split(" ");
      int a = Integer.parseInt(str2[0]);
      int b = Integer.parseInt(str2[1]);
      int c = a*b;
      int d = 2*(a+b);
      System.out.println( c + " " + d );

   }
}