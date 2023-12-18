import java.io.*;

public class Main
{
   public static void main(String[] args)
   {
      int count=1;
      try {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String s=br.readLine();
         int x=Integer.parseInt(s);
         while(x!=0){
            System.out.println("Case " + count++ + ": " + x);
            s=br.readLine();
            x=Integer.parseInt(s);
         }
      } catch(Exception e){}
   }
}