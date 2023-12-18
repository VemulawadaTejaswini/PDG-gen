import java.util.*;
import java.io.*;
public class Main {
   public static void main(String[] args) {
      
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      try {
         String n = reader.readLine();
         
         if(n.equals("A")){
            System.out.println("T");
         }
         else if(n.equals("T")){
            System.out.println("A");
         }
         else if(n.equals("C")){
            System.out.println("G");
         }
         else{
            System.out.println("C");
         }
      }
      catch (IOException e) {
         System.out.println(e);
      }
   }
}