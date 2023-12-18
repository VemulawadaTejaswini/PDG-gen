import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      String[] arr;
      int h;
      int w;
      int i,j;
         
      while(true){
         str = sc.nextLine();
         arr = str.split(" ");
         h = Integer.parseInt(arr[0]);
         w = Integer.parseInt(arr[1]);
         
         if(h == 0 && w == 0){
            break;
         }
         
         
         for(i = 0; i < h; i ++ ){
            for(j = 0; j < w; j ++){
               System.out.print("#");
            }
            System.out.println();
         }
         System.out.println();
      
      }    
   }//main method 
}//class