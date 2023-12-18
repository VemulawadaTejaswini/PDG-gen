import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }
    int M = N * (N + 1) / 2;
    long[] s = new long[M];
    int k = 0;
    for (int i = 0; i < N; i++) {
      long sum = 0;
      for (int j = i; j < N; j++) {
        sum += a[j];
        s[k++] = sum;
      }
    }
    long res = 0;
    for (int i = 40; i >= 0; i--) {
      long n = res | (1L << i);
      int count = 0;
      for (int j = 0; j < M; j++) if ((s[j] & n) == n) count++;
      if (count >= K) res = n;
    }
    System.out.println(res);
  }
}
