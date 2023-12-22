import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long A = scanner.nextLong();
    long B = scanner.nextLong();
    int[] X = new int[N];
    for (int i = 0; i < N; i++) X[i] = scanner.nextInt();

    long cost = 0;
    for (int i = 1; i < N; i++) cost += Math.min(A * (X[i] - X[i - 1]), B);
    System.out.println(cost);
  }
}
