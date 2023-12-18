import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] W = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
      W[i] = scanner.nextInt();
      sum += W[i];
    }

    int min = sum;
    int s = 0;
    for (int i = 0; i < N - 1; i++) {
      s += W[i];
      min = Math.min(min, Math.abs(sum - s * 2));
    }
    System.out.println(min);
  }
}
