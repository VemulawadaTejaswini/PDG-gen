import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    sc.close();
    long res = 0;
    long min = 0;
    long max = 0;
    for (int i = 0; i < k - 1; i++) {
      min += i;
      max += n - i;
    }
    for (int i = k; i <= n + 1; i++) {
      min += i - 1;
      max += n - (i - 1);
      res += max - min + 1;
    }
    res %= Math.pow(10, 9) + 7;
    System.out.println(res);
  }
}