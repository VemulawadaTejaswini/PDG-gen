import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s1 = scanner.next().toCharArray();
    char[] s2 = scanner.next().toCharArray();

    final int M = 1000000007;
    boolean pVertical = false;
    long res = 1;
    for (int i = 0; i < N; i++) {
      if (i < N - 1 && s1[i] == s1[i + 1]) {
        if (i == 0) {
          res *= 6;
        } else if (pVertical) {
          res *= 2;
        } else {
          res *= 3;
        }
        i++;
        pVertical = false;
      } else {
        if (i == 0) {
          res *= 3;
        } else if (pVertical) {
          res *= 2;
        }
        pVertical = true;
      }
      res %= M;
    }
    System.out.println(res % M);
  }
}
