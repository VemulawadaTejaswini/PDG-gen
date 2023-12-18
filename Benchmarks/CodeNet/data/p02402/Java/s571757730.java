import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      String str = sc.nextLine();
      String[] arr = str.split(" ");
      
      int max = Integer.parseInt(arr[0]);
      int min = Integer.parseInt(arr[0]);
      long sum = 0;
      
      int a;
      int i;
      
      for(i = 0; i < n; i ++){
         a = Integer.parseInt(arr[i]);
         if(a > max){
            max = a;
         }else if(a < min){
            min  = a;
         }
         sum += a;
      }
      
      
      
      
            
      System.out.println(min + " " + max + " " + sum);
     
      
   
   }//main method 
}//class