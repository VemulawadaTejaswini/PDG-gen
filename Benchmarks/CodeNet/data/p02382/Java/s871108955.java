import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] x = new int[n];
    for (int i = 0; i < n; i++) {
        x[i] = sc.nextInt();
    }

    int[] y = new int[n];
    for (int i = 0; i < n; i++) {
        y[i] = sc.nextInt();
    }

    System.out.println(calc(1, x, y, n));
    System.out.println(calc(2, x, y, n));
    System.out.println(calc(3, x, y, n));
    System.out.println(calc(0, x, y, n));
  }

  public static double calc(int p, int[] x, int[] y, int n) {
      if (p == 0) {
        return IntStream.range(0, n)
            .mapToDouble(i -> Math.abs(x[i] - y[i]))
            .max()
            .getAsDouble();
      }

      double d = 0;
      for (int i = 0; i < n; i++) {
          d += Math.pow(Math.abs(x[i] - y[i]), p);
      }
      return Math.pow(d, (double)1 / p);
  }
}
