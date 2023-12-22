import java.util.*;
public class Main{
     public static void main(String []args){
         Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();
         
         long b = 0;
         for (int i=1;i<=a;i++){
             if ( i % 3 == 0 || i % 5 == 0 ) continue;
            
             b+=i; 
         }
         
         System.out.println(b);
     }
}