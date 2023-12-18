import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {

  static int n, ans;
  static Integer[] a;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    a = new Integer[n];
    in = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(in[i]);
    }

    br.close();

    Arrays.sort(a, Collections.reverseOrder());

    for (int i = 1; i < n; i++) {
      ans += a[i / 2];
    }

    out.println(ans);

    out.flush();

  }
}