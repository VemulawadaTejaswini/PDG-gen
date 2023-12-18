import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 0; i < 10000; i++) {
      double asum = (double)i * 0.08;
      double bsum = (double)i * 0.1;
      if ((int)asum == a && (int)bsum == b) {
        System.out.println((int)i);
        return;
      }
    }

    System.out.println(-1);

  }
}
