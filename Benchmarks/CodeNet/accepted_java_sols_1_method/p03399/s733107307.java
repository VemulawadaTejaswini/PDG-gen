import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     n    = scan.nextInt();
      int     m    = scan.nextInt();
      int     N    = scan.nextInt();
      int     M    = scan.nextInt();

      System.out.println(Math.min(n, m) + Math.min(N, M));
   }
}
