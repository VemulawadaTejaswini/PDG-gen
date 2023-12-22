import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      long total = 0;
      if(a + b <= c * 2) {
        total = a * x + b * y;
      } else {
        int ab = Math.min(x, y);
        total = ab * 2 * c;
        x -= ab;
        y -= ab;
        total += Math.min(a*x + b*y, (x + y) * 2 * c);
      }
      System.out.println(total);
  }
}