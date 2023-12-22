import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    // Your code here!
    Scanner scan = new Scanner(is);
    int X = scan.nextInt();
    int N = scan.nextInt();
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0 ; i < N; i++) {
      set.add(scan.nextInt());
    }

    if(!set.contains(X)) {
      os.println(X);
      return;
    }

    int diff = 1;
    while(true) {
      if(!set.contains(X-diff)) {
        os.println(X-diff);
        return;
      }
      if(!set.contains(X+diff)) {
        os.println(X+diff);
        return;
      }
      diff++;
    }
  }
}
