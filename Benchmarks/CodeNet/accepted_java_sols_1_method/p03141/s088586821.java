import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long[] a = new long[n];
    long[] b = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextLong();
      b[i] = scanner.nextLong();
    }
    scanner.close();
    long allB = 0;
    for (long l : b) {
      allB += l;
    }
    long[] ab = new long[n];
    for (int i = 0; i < n; i++) {
      ab[i] = a[i] + b[i];
    }
    Arrays.sort(ab);
    long p = 0;
    for (int i = 0; i < n; i += 2) {
      p += ab[ab.length - i - 1];
    }
    System.out.println(-allB + p);
  }

}
