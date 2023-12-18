import java.util.Scanner;

public class Main {

  private static long power(long m, long n) {
    long res;
    long MODE = 1000000007;

    if (n == 0) {
      return 1;
    }
    res = power(m * m % MODE, n / 2);
    if (n % 2 == 1) {
      res = res * m % MODE;
    }
    return res;
  }

  public static void main(String[] args) {

    Scanner stdIn = new Scanner(System.in);
    long m = stdIn.nextInt();
    long n = stdIn.nextInt();

    System.out.println(power(m, n));
  }

}