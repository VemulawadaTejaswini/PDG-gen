import java.util.Scanner;

public class Main {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    int n = in.nextInt();
    long ans = 0;
    for (long i = 1; i <= n; i++) {
      for (long j = 1; j * i < n; j++) {
        ans++;
      }
    }
    System.out.println(ans);

  }
}
