import java.util.*;

public class Main {
  Scanner sc = new Scanner(System.in);
  double x, h;
  void run() {
    for(;;) {
      x = sc.nextInt();
      h = sc.nextInt();
      if (x == 0 && h == 0) break;
      //System.out.println(x + "|" + h);
      double l = Math.sqrt(x*x/4 + h*h);
      double res = x*x + 2 * x * l;
      System.out.println(res);
    }
  }
  public static void main(String args[]) {
    new Main().run();
  }
}