import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      String str;
      String[] arr;
      int[] a = {};
      
      while(true){
         str = sc.nextLine();
         arr = str.split(" ");
                  
         a[0] = Integer.parseInt(arr[0]);
         a[1] = Integer.parseInt(arr[1]);
         
         Arrays.sort(a);
         if(a[1] == 0){
            break;
         }else{
            System.out.println(a[0] + " " + a[1]);
         }
      }    
      
   }//main method 
}//class