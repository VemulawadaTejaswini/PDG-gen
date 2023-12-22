import java.util.*;
import java.lang.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      int a, b, c, d;
      a = Integer.parseInt(scan.next());
      b = Integer.parseInt(scan.next());
      c = Integer.parseInt(scan.next());
      d = Integer.parseInt(scan.next());

      System.out.println(Math.min(a,b)+Math.min(c,d));
    }
    catch (Exception e) {
      
    }
  }
}