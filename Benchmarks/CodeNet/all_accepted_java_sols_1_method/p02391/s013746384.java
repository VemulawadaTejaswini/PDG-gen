import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      String temp;
      Scanner sc = new Scanner(System.in);
      temp = sc.nextLine();
      String[] ab = temp.split(" ",0);       
      int a = Integer.parseInt(ab[0]);
      int b = Integer.parseInt(ab[1]);
      
      
      if(a == b){
         System.out.println("a == b");
      }else if(a > b){
         System.out.println("a > b");
      }else{
         System.out.println("a < b");
      }
      
      
      
      
      
           
   }//main method
   
         
}//class