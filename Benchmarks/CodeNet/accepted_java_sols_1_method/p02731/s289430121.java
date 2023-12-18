import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      double n = sc.nextDouble();
      double ans = Math.pow(n / 3, 3);
      System.out.printf("%f\n", ans);
    } finally {
      sc.close();
    }
  }
}