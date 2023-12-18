import java.io.*;
import java.util.*;
 
class Main
{
   public static void main(String[] args)
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       char c[]=(br.readLine()).toCharArray();
       if(c[1]>='A' && 'Z'<=c[1])
       { 
         System.out.println("A");
       }
        if(c[1]>='a' && 'z'<=c[1])
       { 
         System.out.println("a");
       }
     
     
   
   }
}
