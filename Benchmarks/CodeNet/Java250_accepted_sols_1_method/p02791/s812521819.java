import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] P = new int[N];
    for (int i = 0; i < N; i++) P[i] = scanner.nextInt();
    int min = P[0];
    int count = 1;
    for (int i = 1; i < N; i++) {
      if (P[i] < min) count++;
      min = Math.min(min, P[i]);
    }
    System.out.println(count);
  }
}
