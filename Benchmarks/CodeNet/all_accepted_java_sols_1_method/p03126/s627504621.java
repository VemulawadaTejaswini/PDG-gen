import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] freq = new int[M];
    for (int i = 0; i < N; i++) {
      int K = scanner.nextInt();
      for (int j = 0; j < K; j++) {
        int a = scanner.nextInt() - 1;
        freq[a]++;
      }
    }
    int tot = 0;
    for (int f : freq) if (f == N) tot++;
    System.out.println(tot);
  }
}
