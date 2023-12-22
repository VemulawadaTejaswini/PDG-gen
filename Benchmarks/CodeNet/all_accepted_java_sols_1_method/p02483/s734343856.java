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
      int c = Integer.parseInt(str2[2]);
      int w;
      
      if( a > b ) {
         w = a;
         a = b;
         b = w;
      }
      
      if ( b > c ) {
         w = b;
         b = c;
         c = w;
      }
      
      if( a > b ) {
         w = a;
         a = b;
         b = w;
      }

      System.out.println( a + " " + b + " " + c );

   }
}