import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int min[] = new int[n];
    int max[] = new int[n];
    for (int i = 0; i < n; i++) {
      min[i] = Integer.parseInt(sc.next());
      max[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(min);
    Arrays.sort(max);
    if (n % 2 == 1) {
      pw.println(
        (int) median(max) - (int) median(min) + 1
      );
    } else {
      pw.println((int) ((median(max) - median(min)) * 2) + 1);
    }
  }

  static double median(int sorted[]) {
    if (sorted.length % 2 == 1) {
      return sorted[sorted.length / 2];
    }
    return (sorted[sorted.length / 2 - 1] + sorted[sorted.length / 2]) / 2d;
  }
}
