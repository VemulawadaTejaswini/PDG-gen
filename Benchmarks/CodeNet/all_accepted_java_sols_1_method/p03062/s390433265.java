import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long sum = 0;
    int min = Integer.MAX_VALUE;
    int cntm = 0;
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      sum += Math.abs(a);
      min = Math.min(min, Math.abs(a));
      if (a < 0) cntm++;
    }

    if (cntm % 2 == 0) {
      System.out.println(sum);
      return;
    }
    sum -= min * 2;
    System.out.println(sum);
  }
}
