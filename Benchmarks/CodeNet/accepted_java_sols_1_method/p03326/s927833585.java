import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    long[][] s = new long[4][N];
    for (int i = 0; i < N; i++) {
      long x = scanner.nextLong();
      long y = scanner.nextLong();
      long z = scanner.nextLong();
      s[0][i] =  x + y + z;
      s[1][i] = -x + y + z;
      s[2][i] =  x - y + z;
      s[3][i] =  x + y - z;
    }

    for (int i = 0; i < 4; i++) {
      Arrays.sort(s[i]);
    }

    long max = 0;
    for (int i = 0; i < 4; i++) {
      long a = 0;
      for (int j = 0; j < M; j++) {
        a += s[i][j];
      }
      if (a > max) max = a;
      if (-a > max) max = -a;

      a = 0;
      for (int j = 0; j < M; j++) {
        a += s[i][N - j - 1];
      }
      if (a > max) max = a;
      if (-a > max) max = -a;
    }
    System.out.println(max);
  }
}
