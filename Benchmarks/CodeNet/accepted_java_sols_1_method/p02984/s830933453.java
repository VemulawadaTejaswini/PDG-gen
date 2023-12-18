import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    long sum = 0;
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
      sum += (i % 2 == 0 ? 1 : - 1) * A[i];
    }
    long x = sum / 2;
    StringBuilder sb = new StringBuilder();
    sb.append(x * 2).append(' ');
    for (int i = 0; i < N - 1; i++) {
      x = A[i] - x;
      sb.append(x * 2).append(' ');
    }
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }
}
