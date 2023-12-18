import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;

public class Main {

  static int n, ans;
  static char[] colors;
  static Set<Long> usd;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    colors = br.readLine().toCharArray();

    br.close();

    ans = 0;
    int l = 0, r = n - 1;

    while (l < r) {
      while (l < n && colors[l] == 'R') {
        l++;
      }
      while (r >= 0 && colors[r] == 'W') {
        r--;
      }
      if (l >= r) break;
      colors[l] = 'R';
      colors[r] = 'W';
      ans++;
    }

    out.println(ans);

    out.flush();
  }
}
