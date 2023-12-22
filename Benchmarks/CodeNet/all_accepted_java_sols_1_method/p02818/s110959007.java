import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    long a = sc.nextLong();
    long k = sc.nextLong();
    if (k >= t + a) {
      System.out.println("0 0");
      return;
    }
    String tRest;
    String kRest;
    if (t >= k) {
      tRest = Long.toString(t - k);
      kRest = Long.toString(a);
      System.out.println(tRest + " " + kRest);
    } else if (k - t > a) {
      System.out.println("0 0");
    } else if (a >= k - t) {
      kRest = Long.toString(a - (k - t));
      System.out.println("0 " + kRest);
    }
  }
}