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
      String s = "";
      
      for(int i = n - 1; i >= 0 ; i--){
         s += arr[i];
         if(i != 0){
            s += " ";
         }
      } 
      System.out.println(s);   
   }//main method 
}//class