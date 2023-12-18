import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int[] numOfDivisor = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      for (int k = i; k <= n; k += i) {
        numOfDivisor[k]++;
      }
    }
    long ans = 0;
    for (int i = 1; i <= n; i++) {
      ans += (long) i * numOfDivisor[i];
    }
    pw.println(ans);
  }
}
