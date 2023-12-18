import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N + 2];
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      A[i] = scanner.nextInt();
      sum += Math.abs(A[i] - A[i - 1]);
    }
    sum += Math.abs(A[N]);
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= N; i++) {
      sb.append(sum - Math.abs(A[i] - A[i - 1]) - Math.abs(A[i] - A[i + 1]) + Math.abs(A[i + 1] - A[i - 1])).append('\n');
    }
    System.out.print(sb.toString());
  }
}
