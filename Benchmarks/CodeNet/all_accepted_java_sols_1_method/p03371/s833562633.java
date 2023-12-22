import java.util.Scanner;

class Main {

  private static long INF = Long.MAX_VALUE / 4;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    long[] res = new long[3];
    res[0] = Math.min(X, Y) * 2 * C;
    if (X < Y) {
      res[0] += B * (Y - X);
    } else {
      res[0] += A * (X - Y);
    }
    res[1] = A * X + B * Y;
    res[2] = Math.max(X, Y) * 2 * C;
    long ans = INF;
    for (int i = 0; i < res.length; i++) {
      ans = Math.min(res[i], ans);
    }

    System.out.println(ans);
  }

}
