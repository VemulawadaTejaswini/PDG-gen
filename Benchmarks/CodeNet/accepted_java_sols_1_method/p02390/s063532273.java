import java.util.Scanner;

class Main
{
   public static void main(String[] args)
   {
      Scanner stdIn = new Scanner(System.in);
      int n = stdIn.nextInt();
      int ss = n%60;
      int mm = (n/60)%60;
      int hh = n/3600;
      System.out.println( hh + ":" + mm + ":" + ss );
   }
}