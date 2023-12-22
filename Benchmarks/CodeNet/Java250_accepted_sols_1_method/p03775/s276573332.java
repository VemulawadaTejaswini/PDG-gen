import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int ans = String.valueOf(n).length();
    
    for (long i = 1; i * i <= n; i++) {
      final int length = String.valueOf(n / i).length();
      if (n % i == 0 && length < ans) {
        ans = length;
      }
    }
    System.out.println(ans);
  }
}
