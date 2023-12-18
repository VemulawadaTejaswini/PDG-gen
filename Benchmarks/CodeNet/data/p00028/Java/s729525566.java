import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   static final int SIZE = 100;
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[] counter = new int[SIZE];
      int a;
      int max = 0;
      
      while(sc.hasNext()){
         a = Integer.parseInt(sc.nextLine());
         counter[a - 1] ++;
         if(counter[a - 1] > max){
            max = counter[a - 1];
         }
      }
      
      for(int i = 0; i < SIZE; i ++){
         if(counter[i] == max){
            System.out.println(i);
         }
      }
   }//main
}//class
