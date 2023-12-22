import java.util.*;

public class Main{

     public static void main(String[] args){
         
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         
         if( Integer.lowestOneBit(a) != 1 || Integer.lowestOneBit(b) != 1){
            System.out.println("Even");
         } else{
            System.out.println("Odd");
         }
       
     }
}