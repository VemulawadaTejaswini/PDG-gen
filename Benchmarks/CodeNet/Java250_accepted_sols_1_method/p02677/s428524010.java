
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();
    sc.close();

    double hd = (60 * h + m) * 0.5;
    double md = m * 6;

    double r = 0.000000000;
    if(hd < md) {
      r = md - hd;
      if(r > 180) {
        r = 360 - r;
      }
      double ans = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(r * Math.PI/180));
      System.out.println(ans);
    }else if(hd > md) {
      r = hd - md;
      if(r > 180) {
        r = 360 - r;
      }
      double ans = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(r * Math.PI/180));
      System.out.println(ans);
    }else {
      System.out.println(Math.abs(a-b));
    }
  }

}
