import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      int a;
      int max = 0;
      int min = 0;
      int sum = 0;
      int i;
      
      for(i = 0; i < n; i++){
         a = Integer.parseInt(sc.nextLine());
         if(i == 0){
            max = a;
            min = a;
         }
         if(a > max){
            max = a;
         }
         if(a < min){
            min = a;
         }
         
         sum += a;
         
      }
      
      System.out.println(min + " " + max + " " + sum);
     
      
   
   }//main method 
}//class