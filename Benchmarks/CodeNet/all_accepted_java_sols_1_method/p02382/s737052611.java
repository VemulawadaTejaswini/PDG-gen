import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int n = stdin.nextInt();
    int[] x = new int[n];
    for (int i = 0; i < n; i++) {
      x[i] = stdin.nextInt();
    }

    int[] y = new int[n];
    for (int i = 0; i < n; i++) {
      y[i] = stdin.nextInt();
    }

    for (int i = 0; i < 4; i++) {
      double D = 0;
      for (int j = 0; j < n; j++) {
        switch (i) {
          case 0:
            D += Math.abs(x[j] - y[j]);
            break;

          case 3:
            D = Math.max(D, Math.abs(x[j] - y[j]));
            break;

          default:
            D += Math.pow(Math.abs(x[j] - y[j]), i + 1);
            break;
        }
      }

      if (i == 1 || i == 2) {
        D = Math.pow(D, 1.0 / (i + 1));
      }

      System.out.println(D);
    }
  }

}