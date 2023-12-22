import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long C = scanner.nextLong();
    long[] x = new long[N];
    long[] v = new long[N];
    for (int i = 0; i < N; i++) {
      x[i] = scanner.nextLong();
      v[i] = scanner.nextLong();
    }

    long sum = 0;
    long[] lmax = new long[N + 1];
    long[] lsum = new long[N + 1];
    for (int i = 1; i <= N; i++) {
      sum += v[i - 1];
      lmax[i] = Math.max(lmax[i - 1], sum - x[i - 1]);
      lsum[i] = sum - x[i - 1] * 2;
    }

    sum = 0;
    long[] rmax = new long[N + 1];
    long[] rsum = new long[N + 1];
    for (int i = 1; i <= N; i++) {
      sum += v[N - i];
      rmax[i] = Math.max(rmax[i - 1], sum - (C - x[N - i]));
      rsum[i] = sum - (C - x[N - i]) * 2;
    }

    long max = lmax[N];
    max = Math.max(max, rmax[N]);

    for (int i = 1; i < N; i++) max = Math.max(max, rsum[i] + lmax[N - i]);
    for (int i = 1; i < N; i++) max = Math.max(max, lsum[i] + rmax[N - i]);

    System.out.println(max);
  }
}
