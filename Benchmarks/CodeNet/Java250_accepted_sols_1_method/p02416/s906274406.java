import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      int sum;
      
      while(true){
         sum = 0;
         str = sc.nextLine();
         if(str.equals("0")){
            break;
         }else{
            for(int i = 0; i < str.length(); i ++){
               sum += Character.getNumericValue(str.charAt(i));
            }
            System.out.println(sum);
         }
         
         
      }
   }//main
}//class