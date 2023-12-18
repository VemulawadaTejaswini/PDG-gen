import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x;
      int sum;
      
      while(true){
         sum = 0;
         x = Integer.parseInt(sc.nextLine());
         if(x == 0){
            break;
         }
         while(x > 0){
            sum += x%10;
            x /= 10;
         }
         System.out.println(sum);
      }
   }//main
}//class