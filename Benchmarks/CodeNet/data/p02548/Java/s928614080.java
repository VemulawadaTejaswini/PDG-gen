
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws Exception {
    solve(System.in, System.out);
  }

  static final int MOD = (int)Math.pow(10,9)+7;

  static void solve(InputStream is, PrintStream os) {
    // Your code here!
    Scanner scan = new Scanner(is);
    int N = scan.nextInt();
    int ans = 0;
    for(int i = 1; i < N; i++) {
      int tgt = N - i;

      int tmp = 1;
      for (int j = 2; j <= Math.sqrt(tgt); j++) {
        int cnt = 0;
        while (tgt % j == 0) {
          cnt++;
          tgt/= j;
        }
        tmp *= (cnt + 1);
        if (tgt == 1)
          break;
      }
      if (tgt != 1)
        tmp *= 2;

      ans += tmp;
    }
    os.println(ans);
  }
}
