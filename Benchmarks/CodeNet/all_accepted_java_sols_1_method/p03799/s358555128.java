import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long m = sc.nextLong();

    long ans = 0;

    if (2 * n < m) {
      ans = n + ((m - 2 * n) / 4);
    } else {
      ans = m / 2;
    }
    System.out.println(ans);
  }
}