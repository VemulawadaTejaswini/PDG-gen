import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int k = scan.nextInt();
    long sum = 0;

    for (int i = 1; i <= k; i++) {
      for (int j = 1; j <= k; j++) {
        for (int l = 1; l <= k; l++) {
          int first = gcd(Math.max(i, j), Math.min(i, j));
          int res = gcd(Math.max(first, l), Math.min(first, l));
          sum += res;
        }
      }
    }

    System.out.println(sum);

  }

  private static int gcd(int a, int b) {
    int r = a % b;
    if (r == 0) {
      return b;
    } else {
      return gcd(b, r);
    }
  }

}