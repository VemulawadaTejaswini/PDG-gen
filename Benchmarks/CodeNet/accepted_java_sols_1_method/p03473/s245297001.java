import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     x    = Integer.parseInt(scan.next());
      int     hour = 24;

      hour = hour + 24 - x;

      System.out.println(hour);
   }
}
