import java.util.Scanner;

public class Main{
   public static void main(String[] args){
      Scanner reader = new Scanner(System.in);
      int number = 0;
      
      for(int i = 2; i >= 0; i--){
            number += reader.nextInt()*Math.pow(10, i);
      }
      
      double det = number/4.0;
      
      if((det%1.0) > 0){
         System.out.println(" NO");
      } else {
         System.out.println("YES");
      }
   }
}