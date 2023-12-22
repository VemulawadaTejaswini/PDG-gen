import java.util.*;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    sc.close();

    for(int i = 0; i < 3; i++) {
      switch (i) {
        case 0:
          long d = a / b;
          System.out.print(d + " ");
          break;
        case 1:
          long r = a % b;
          System.out.print(r + " ");
          break;
        case 2:
          DecimalFormat f = new DecimalFormat("0.00000");
          double e = (double)a / (double)b;
          System.out.print(f.format(e));
          break;
      }
    }
  }
}
