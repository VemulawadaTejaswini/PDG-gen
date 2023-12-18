import java.util.Scanner;

public class Main {
  public static int[] square(int[] data, int n) {
    int[] ret = new int[1000];
    for(int i = 0; i < n; i++) {
      ret[i] = data[i] * data[i];
    }
    return ret;
  }

  public static double average(int[] data, int n) {
    int sum = 0;
    for(int i = 0; i < n; i++) {
      sum += data[i];
    }
    return (double) sum / n;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int n = sc.nextInt();
      if(n == 0) {
        break;
      }
      int[] data = new int[1000];

      for(int i = 0; i < n; i++) {
        data[i] = sc.nextInt();
      }

      double ave = average(data, n);
      double s2 = average(square(data, n), n) - ave * ave;
      System.out.printf("%.5f\n", Math.sqrt(s2));
    }
  }
}