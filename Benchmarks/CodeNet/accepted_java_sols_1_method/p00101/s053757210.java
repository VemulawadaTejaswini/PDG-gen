import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      String str;
      while(n > 0){
         str = sc.nextLine();
         System.out.println(str.replace("Hoshino","Hoshina"));
         n--;
      }
      
   }//main
   
   
}//class
