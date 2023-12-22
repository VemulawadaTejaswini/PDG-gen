import java.io.*;
import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      int x=0, y=0;
      try {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String s=br.readLine();
         StringTokenizer st=new StringTokenizer(s, " ");
         x=Integer.parseInt(st.nextToken());
         y=Integer.parseInt(st.nextToken());
      }
      catch(Exception e){}
      System.out.println(x*y + " " + 2*(x+y));
   }
}