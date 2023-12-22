import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    while (true) {
      int n = stdin.nextInt();
      if (n == 0) {
        break;
      }

      int[] arr = new int[n];
      double m = 0;
      for (int i = 0; i < n; i++) {
        arr[i] = stdin.nextInt();
        m += arr[i];
      }
      m /= n;

      double a = 0;
      for (int i = 0; i < n; i++) {
        a += Math.pow(arr[i] - m, 2);
      }

      System.out.printf("%f%n", Math.sqrt(a / n));
    }
  }

}