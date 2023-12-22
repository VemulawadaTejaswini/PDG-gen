import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextInt();
    long K = scanner.nextInt();
    long cnt = 0;
    for (long b = K + 1; b <= N; b++) {
      long i = N / b;
      cnt += i * (b - K);
      cnt += Math.max(N - (i * b + K) + 1, 0);
      if (K == 0) cnt--;
    }
    System.out.println(cnt);
  }
}
