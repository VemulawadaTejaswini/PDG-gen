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
      
         edge(width);
         System.out.println();
         middle(height - 2, width);
         edge(width);
         System.out.println("\n");
      
      }
      
         
   }//main method 
   
   
   public static void edge(int width){
      for(int i = 0; i < width; i++){
         System.out.print("#");
      }
   }
   
   public static void middle(int n,int  width){
      for(int i = 0; i < n; i ++){
         System.out.print("#");
         for(int j = 0; j < width - 2; j++){
            System.out.print(".");
         }
         System.out.print("#\n");
      }
   }
}//class