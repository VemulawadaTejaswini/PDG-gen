import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      String list[];
      int i;
      int min;
      int max;
      int total=0;
      int temp;
      
      list = sc.nextLine().split(" ", 0);
      max = Integer.parseInt(list[0]);
      min = Integer.parseInt(list[0]);
      
                  
      for(i = 0; i < n; i++){
         
         temp = Integer.parseInt(list[i]);         
         
         total += temp;
         
         if(temp > max){
            max = temp;
         }
         if(temp < min){
            min = temp;
         }
      }
      
      System.out.print(max+ " " + min + " " + total);
      
      
      
   }//main method
}//class