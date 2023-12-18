import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

  static long k, ans;
  static Set<Long> usd;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    k = Long.parseLong(in[0]);

    br.close();

    ans = 0;
    usd = new HashSet<Long>();
    long t = 0;

    while (true) {
      ans++;
      t = 10 * t + 7;
      if (t % k == 0) {
        break;
      }

      t %= k;
      if (usd.contains(t)) {
        ans = -1;
        break;
      }

      usd.add(t);
    }

    out.println(ans);

    out.flush();
  }
}
