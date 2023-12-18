import java.io.*;

class Main
{
   public static void main(String[] args) throws IOException
   {
      int i = 0;
      int x = 0;

      while(true){

         BufferedReader br =
          new BufferedReader(new InputStreamReader(System.in));
      
         String str = br.readLine();
         x = Integer.parseInt(str);
         if(x==0) break;
         System.out.println( "Case " + (i+1) + ": " + x );
         i++;
      }
   }
}