import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String[] arr = str.split(" ");
      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[1]);
      int c = Integer.parseInt(arr[2]);
      int count = 0;
      
      for(int i = a; i <= b; i++){
         if(c%i == 0){
            count++;
         }
      }
      
      System.out.println(count);
      
   }//main
}//class