import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] s = new int[M];
    for (int i = 0; i < M; i++) {
      int k = scanner.nextInt();
      for (int j = 0; j < k; j++) {
        int ss = scanner.nextInt() - 1;
        s[i] |= (1 << ss);
      }
    }
    int[] p = new int[M];
    for (int i = 0; i < M; i++) p[i] = scanner.nextInt();

    int count = 0;
    for (int i = 0; i < (1 << N); i++) {
      boolean possible = true;
      for (int j = 0; j < M; j++) {
        possible &= Integer.bitCount(s[j] & i) % 2 == p[j];
      }
      if (possible) count++;
    }
    System.out.println(count);
  }
}
