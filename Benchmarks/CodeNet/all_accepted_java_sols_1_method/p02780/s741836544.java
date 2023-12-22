import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] p = new int[N];
    for (int i = 0; i < N; i++) p[i] = scanner.nextInt() + 1;
    int sum = 0;
    for (int i = 0; i < K; i++) sum += p[i];
    int max = sum;
    for (int i = K; i < N; i++) {
      sum += p[i];
      sum -= p[i - K];
      max = Math.max(max, sum);
    }
    System.out.printf("%f\n", max * 0.5d);
  }
}
