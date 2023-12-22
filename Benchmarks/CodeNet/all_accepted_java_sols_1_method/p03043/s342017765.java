import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    double result = 0;
    int now = 0;

    for (int i = 1; i <= n; i++) {

      now = i;
      int count = 0;

      while (now < k) {
        now *= 2;
        count++;
      }

      result += Math.pow(0.5, count) / n;
    }

    System.out.println(result);
  }
}
