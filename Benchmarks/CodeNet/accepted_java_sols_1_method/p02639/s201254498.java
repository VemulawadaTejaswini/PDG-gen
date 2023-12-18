import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int num3 = scanner.nextInt();
      int num4 = scanner.nextInt();
      int num5 = scanner.nextInt();
      
      if (num1 == 0)
      {
         System.out.println(1);
      }
      
      else if (num2 == 0)
      {
         System.out.println(2);
      }
      
      else if (num3 == 0)
      {
         System.out.println(3);
      }
      
      else if (num4 == 0)
      {
         System.out.println(4);
      }
      
      else
      {
         System.out.println(5);
      }
   }
}