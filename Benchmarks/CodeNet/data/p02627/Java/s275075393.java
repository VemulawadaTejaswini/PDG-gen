import java.io.*;
import java.util.*;
 
class Main
{
   public static void main(String[] args)
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       char c=br.read();
       if(c>='A' && 'Z'<=c)
       { 
         System.out.println("A");
       }
        if(c>='a' && 'z'<=c)
       { 
         System.out.println("a");
       }
     
     
   
   }
}