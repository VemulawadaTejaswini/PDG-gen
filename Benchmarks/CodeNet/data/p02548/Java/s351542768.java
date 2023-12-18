
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
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
      for(int j = 1; j <= Math.sqrt((double)tgt); j++) {
        if(tgt % j == 0) {
          if(tgt/j == j)
            ans++;
          else
            ans += 2;
        }
      }
    }
    os.println(ans);
  }
}
