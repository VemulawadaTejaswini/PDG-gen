import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int K = scanner.nextInt();
    long sum = 0;
    for (int a = 1; a <= K; a++) {
      for (int b = 1; b <= K; b++) {
        long d = gcd(a, b);
        for (int c = 1; c <= K; c++) {
          sum += gcd(d, c);
        }
      }
    }
    System.out.println(sum);
  }

  static long gcd(long i, long j) {
    if (i > j) return gcd(j, i);
    while (i > 0) {
      long r = j % i;
      j = i;
      i = r;
    }
    return j;
  }
}
