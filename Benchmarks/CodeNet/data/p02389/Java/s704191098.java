import java.util.Scanner;

class Main2
{
   public static void main(String[] args)
   {
      Scanner stdIn = new Scanner(System.in);
      int a = stdIn.nextInt();
      int b = stdIn.nextInt();
      int c = a*b;
      int d = 2*(a+b);
      System.out.println( c + " " + d );
   }
}