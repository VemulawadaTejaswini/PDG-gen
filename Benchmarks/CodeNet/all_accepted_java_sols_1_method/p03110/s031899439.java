import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double total =0;
    for (int i=0; i<N; i++) {
      double x = sc.nextDouble();
      String u = sc.next();
      if (u.equals("BTC")) {
        total += x * 380000;
      } else {
        total += x;
      }
    }
    System.out.println(total);
  }
}