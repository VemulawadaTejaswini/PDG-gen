import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static long n, ans;
  static long[] a, b, asum, bsum;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Long.parseLong(in[0]);

    br.close();

    ans = 0;
    for (long i = 1; i <= n; i++) {
      for (long j = i; j <= n; j += i) {
        ans += j;
      }
    }

    out.println(ans);

    out.flush();

  }
}