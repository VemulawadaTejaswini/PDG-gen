import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] X = new int[N];
    for (int i = 0; i < N; i++) X[i] = scanner.nextInt();

    int min = 1_000_000;
    for (int i = 1; i <= 100; i++) {
      int cost = 0;
      for (int j = 0; j < N; j++) cost += (X[j] - i) * (X[j] - i);
      min = Math.min(min, cost);
    }
    System.out.println(min);
  }
}
