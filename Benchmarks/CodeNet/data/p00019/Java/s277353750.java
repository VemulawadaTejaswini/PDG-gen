import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long n = Integer.parseInt(sc.nextLine());
      System.out.println(factorial(n));
   }//main   
   
   public static long factorial(long n){
      if(n == 1){
         return 1;
      }else{
         return n * factorial(n - 1);
      }
   }