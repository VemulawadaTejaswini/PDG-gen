import java.util.*;
import java.io.*;

public class Main{
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
   int a = s.nextInt();
   int b = s.nextInt();
   int c = s.nextInt();
   
   if(a>b){
     System.out.print(0);
   }
   else{
   int result = Math.min(c, b/a);
   System.out.print(result);
   
   }
   }
}