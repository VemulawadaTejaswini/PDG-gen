import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String str;
      String[] arr;
      int a;
      int b;
      
      while(true){
         str = sc.nextLine();
         arr = str.split(" ");
         Arrays.sort(arr);
         
         a = Integer.parseInt(arr[0]);
         b = Integer.parseInt(arr[1]);
         if(a == 0 && b == 0){
            break;
         }else{
            System.out.println(a + " " + b);
         }
      }    
      
      
            
   
   }//main method 
}//class