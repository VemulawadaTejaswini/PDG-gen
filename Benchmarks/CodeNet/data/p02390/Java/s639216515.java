import java.io.*;

class Main
{
   public static void main(String[] args) throws IOException
   {

      
      BufferedReader br =
       new BufferedReader( new InputStreamReader(System.in));

      String str = br.readLine();

      int S = Integer.parseInt(str);
      System.out.print((S/3600) + ":" + ((S%3600)/60)+ ":" + (S%60) );
   }
}