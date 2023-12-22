import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      int x, a, b;

      x = Integer.parseInt(scan.next());
      a = Integer.parseInt(scan.next());
      b = Integer.parseInt(scan.next());

      System.out.println((x-a)%b);
      
    }
    catch (Exception e) {
      
    }
  }
}