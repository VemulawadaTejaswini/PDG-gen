import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] x = new int[M];
    for (int i = 0; i < M; i++) x[i] = scanner.nextInt();
    Arrays.sort(x);

    int[] d = new int[M - 1];
    for (int i = 1; i < M; i++) d[i - 1] = x[i] - x[i - 1];
    Arrays.sort(d);

    long sum = 0;
    for (int i = 0; i < M - N; i++) sum += d[i];
    System.out.println(sum);
  }
}
