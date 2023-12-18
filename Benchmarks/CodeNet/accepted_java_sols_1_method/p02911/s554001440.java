import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int Q = scanner.nextInt();
    int[] score = new int[N];
    for (int i = 0; i < Q; i++) score[scanner.nextInt() - 1]++;
    for (int i = 0; i < N; i++) {
      if (score[i] + K - Q > 0) System.out.println("Yes");
      else System.out.println("No");
    }
  }
}
