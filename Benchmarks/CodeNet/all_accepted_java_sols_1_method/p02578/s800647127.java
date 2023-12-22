import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int beforeA = 0;
    long ans = 0;
    for (int cnt = 0; cnt < n; cnt++) {
      int a = sc.nextInt();
      int step = 0;
      if (beforeA > a) {
        step = beforeA - a;
      }
      ans += step;
      beforeA = a + step;
    }
    System.out.println(ans);
    sc.close();
  }
}
