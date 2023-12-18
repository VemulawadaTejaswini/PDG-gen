import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    long N = sc.nextLong();
    long M = sc.nextLong();
    long D = sc.nextLong();
    double c = D == 0 ? N : (N - D) * 2;
    c /= N;
    c *= (M - 1);
    c /= N;
    System.out.printf("%.8f\n", c);
  }

}