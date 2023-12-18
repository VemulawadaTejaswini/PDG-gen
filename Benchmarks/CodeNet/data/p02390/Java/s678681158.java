import java.io.*;

class Main
{
   public static void main(String[] args) throws IOException
   {

      
      BufferedReader br =
       new BufferedReader( new InputStreamReader(System.in));

      String str = br.readLine();

      int sec = Integer.parseInt(str);
      int h = sec/3600;
      int m = (sec%3600)/60;
      int s = (sec%3600)% 60;
      System.out.print( h + ":" + m + ":" + s );
   }
}