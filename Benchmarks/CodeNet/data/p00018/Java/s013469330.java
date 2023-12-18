import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String[] arr = str.split(" ");
      
      Arrays.sort(arr);
      for(int i = arr.length - 1; i >= 0; i --){
         System.out.print(arr[i]);
         if(i != 0){
            System.out.print(" ");
         }
      }
   }//main   
}//class