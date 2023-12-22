import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] arr;
      int m;
      int d;
      int sum = 0;
      int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
      String answer = "";
      
      while(true){
         sum = 0;
         arr = sc.nextLine().split(" ");
         
         m = Integer.parseInt(arr[0]);
         d = Integer.parseInt(arr[1]);
         
         if(m == 0){
            break;
         }
         
         for(int i = 1; i <= m -1; i ++){
            sum += month[i-1];
         }
         sum += d;
         
         switch(sum%7){
            case 0:
               answer = "Wednesday";
               break;
            case 1:
               answer = "Thursday";
               break;
            case 2:
               answer = "Friday";
               break;
            case 3:
               answer = "Saturday";
               break;
            case 4:
               answer = "Sunday";
               break;
            case 5:
               answer = "Monday";
               break;
            case 6:
               answer = "Tuesday";
               break;
               
         }
         
         System.out.println(answer);
      }
      
    
   }//main
}//class