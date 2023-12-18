import java.util.Scanner;

public class Main {
  private static double EPS = 0.5;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long a = in.nextLong();
    double b = in.nextDouble();
    long flooredB = (long) (b * 100 + EPS);
    double ans = (a * flooredB) / 100.0;
    System.out.println((long) ans);
    in.close();
  }
}

