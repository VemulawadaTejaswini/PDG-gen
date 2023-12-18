import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      int animals = scanner.nextInt();
      int legs = scanner.nextInt();
      
      boolean possible = false;
      
      if (legs % 2 == 0)
      {
         if (4 * animals > legs)
         {
            possible = true;
         }
      }
      
      if (possible)
      {
         System.out.println("Yes");
      }
      
      else
      {
         System.out.println("No");
      }
   }
}
   
   