import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int M = 1_000_000_007;
    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    long res = 1;
    Arrays.sort(s);
    int cnt = 1;
    for (int i = 1; i < N; i++) {
      if (s[i] == s[i - 1]) {
        cnt++;
      } else {
        res *= cnt + 1;
        res %= M;
        cnt = 1;
      }
    }
    res *= cnt + 1;
    res %= M;
    System.out.println(res - 1);
  }
}
