import java.io.*;
import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      try {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String s;
         while((s=br.readLine())!=null){
            StringTokenizer st=new StringTokenizer(s, " ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            a+=b;
            int keta=1;
            while((a/=10)!=0) keta++;
            System.out.println(keta);
         } catch(Exception e){}
      }
   }
}