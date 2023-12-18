import java.util.Scanner;
public class Main{
   public static void main(String args[]){
     
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
    
      int factorial = fact(num);
      System.out.println(factorial);
   }
   static int fact(int n)
   {
       int output;
       if(n==1){
         return 1;
       }
       
       output = fact(n-1)* n;
       return output;
   }
}