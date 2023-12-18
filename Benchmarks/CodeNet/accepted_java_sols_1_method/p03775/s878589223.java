import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int ans = String.valueOf(n).length();

    for (long i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        ans = Math.min(String.valueOf(n / i).length(), ans);
      }
    }
    System.out.println(ans);
  }
}
