import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     X    = scan.nextInt();
      int     Y    = scan.nextInt();
      int     Z    = scan.nextInt();

      System.out.println((X - Z) / (Y + Z));
   }
}
