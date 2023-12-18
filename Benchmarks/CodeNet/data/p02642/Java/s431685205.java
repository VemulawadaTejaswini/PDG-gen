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
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    int max = a[a.length - 1];
    boolean dp[] = new boolean[max + 1];
    for (int i = 0; i < n; i++) {
      dp[a[i]] = true;
    }
    for (int i = 0; i < n; i++) {
      int ai = a[i];
      if (i > 0 && a[i - 1] == a[i]) {
        dp[a[i]] = false;
      }
      for (int c = ai * 2; c <= max; c += ai) {
        dp[c] = false;
      }
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (dp[a[i]]) {
        ans++;
      }
    }
    pw.println(
      ans
    );
  }
}
