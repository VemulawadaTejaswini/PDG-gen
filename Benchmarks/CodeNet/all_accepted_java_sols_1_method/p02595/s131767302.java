import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d = sc.nextInt();
    int ans = 0;

    for (int cnt = 0; cnt < n; cnt++) {
      long x = sc.nextInt();
      long y = sc.nextInt();
      if (d * d >= x * x + y * y) {
        ans++;
      }
    }
    System.out.println(ans);
    sc.close();
  }
}
