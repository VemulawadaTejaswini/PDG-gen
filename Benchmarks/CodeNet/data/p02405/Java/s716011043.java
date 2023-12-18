import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      String[] arr;
      int height;
      int width;
      
      while(true){
         str = sc.nextLine();
         arr = str.split(" ");
         height = Integer.parseInt(arr[0]);
         width = Integer.parseInt(arr[1]);
         
         if(height == 0){
            break;
         }
         
         for(int i = 0; i < height; i ++){
            if(i%2 == 0){
               even(width);
            }else{
               odd(width);
            }
         }
         System.out.println();
         
      }
         
   }//main method 
   
   public static void even(int width){
      for(int i = 0; i < width; i++){
         if(i%2 == 0){
            System.out.print("#");
         }else{
            System.out.print(".");
         }   
      }
      System.out.println();
   }
   
   public static void odd(int width){
      for(int i = 0; i < width; i++){
         if(i%2 == 0){
            System.out.print(".");
         }else{
            System.out.print("#");
         }
         
      }
      System.out.println();
   }
   
   
   
}//class