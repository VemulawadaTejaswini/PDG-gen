import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long A = scanner.nextLong() - 1;
    long B = scanner.nextLong();
    long C = scanner.nextInt();
    long D = scanner.nextInt();

    long lcm = lcm(C, D);
    System.out.println(B - (B / C) - (B / D) + (B / lcm) - A + (A / C) + (A / D) - (A / lcm));
  }

  private static long lcm(long i, long j) {
    return i / gcd(i, j) * j;
  }

  private static long gcd(long i, long j) {
    if (i > j) return gcd(j, i);
    while (i > 0) {
      long r = j % i;
      j = i;
      i = r;
    }
    return j;
  }
}
