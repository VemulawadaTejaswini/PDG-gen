import java.io.*;

public class Main
{
   public static void main(String[] args)
   {
      try {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String st=br.readLine();
         int x=Integer.parseInt(st);
         System.out.println(x*x*x);
      } catch(Exception e){}
   }
}