import java.io.*;
import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      try {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String s=br.readLine();
         StringTokenizer st=new StringTokenizer(s, " ");
         int a=Integer.parseInt(st.nextToken());
         int b=Integer.parseInt(st.nextToken());
         Sysmem.out.println(a*b + " " + 2*(a+b) );
      } catch(Exception e){}
   }
}