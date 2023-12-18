import java.util.Scanner;

public class hello {

   public static void main(final String[] args) {

      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      if(x==1) {
         System.out.println(0);
      } else if(x==0) {
         System.out.println(1);
      }
   }  
}