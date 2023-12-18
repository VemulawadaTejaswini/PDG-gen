import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String[] arr = str.split(" ");
      int[] list = new int[arr.length];
      
      for(int i = 0; i < arr.length; i ++){
         list[i] = Integer.parseInt(arr[i]);
      }
      
      Arrays.sort(list);
      
      for(int i = list.length - 1; i >= 0; i --){
         System.out.print(list[i]);
         if(i != 0){
            System.out.print(" ");
         }
      }
      System.out.println();
   }//main   
}//class