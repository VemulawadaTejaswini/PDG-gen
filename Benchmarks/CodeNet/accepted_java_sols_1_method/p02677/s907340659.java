import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

      int h = sc.nextInt();
      int m = sc.nextInt();

      long mins = h * 60 + m;

      double fen = mins * 6 % 360;
      double shi = mins * 0.5 % 360;
      double diff = ((shi - fen + 360) % 360);

      double res = 0.0;
      if(diff == 0) {
        System.out.println(Math.abs(a - b));
        return;
      }
      else if(diff == 180) {
        System.out.println(a + b);
        return;
      } else if(diff > 180) {
        diff = 360 - diff;
      }
      
      double res2 = a * a + b * b - 2.0 * a * b * Math.cos(Math.toRadians(diff));
      System.out.println(Math.sqrt(res2));
  }
}