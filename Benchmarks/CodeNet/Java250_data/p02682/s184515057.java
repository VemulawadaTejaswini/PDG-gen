import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static int a, b, c, k, ans;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    a = Integer.parseInt(in[0]);
    b = Integer.parseInt(in[1]);
    c = Integer.parseInt(in[2]);
    k = Integer.parseInt(in[3]);

    /*
    =====templates=====
    ===inputs===
    static int n;
    in = br.readLine().split(" ");
    int[] a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    int n = Integer.parseInt(in[0]);
    long n = Long.parseLong(in[0]);
    int[] a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    ===outputs===
    PrintWriter out = new PrintWriter(System.out);
    out.println(ans);
    out.flush();
    */

    br.close();

    ans = Math.min(a, k);
    k -= a + b;
    if(k > 0) ans -= k;

    out.println(ans);

    out.flush();

  }
}