import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {

  static int n;
  static long k, ans;
  static int[] p;
  static long[] c, ts;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    k = Long.parseLong(in[1]);

    in = br.readLine().split(" ");
    p = Stream.of(in).mapToInt(Integer::parseInt).toArray();
    for (int i = 0; i < n; i++) {
      p[i]--;
    }
    in = br.readLine().split(" ");
    c = Stream.of(in).mapToLong(Long::parseLong).toArray();

    br.close();

    ans = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      long tans = 0;
      ts = new long[n];
      int prd = cntLoop(i);
      long ln = k / prd;
      long rem = Math.min(k, prd);

      if(ts[i] > 0){
        tans += ln * ts[i];
        rem = k % prd;
      }


      int nc = p[i];
      long tm = ts[nc];

      for (int j = 0; j < rem; j++) {
        tm = Math.max(tm, ts[nc]);
        nc = p[nc];
      }
      if(rem != 0) tans += tm;

      tans = Math.max(tans, c[p[i]]);
      ans = Math.max(ans, tans);
    }

    out.println(ans);

    out.flush();
  }

  static int cntLoop(int bgn) {
    int ret = 1;
    int now = p[bgn];
    long scr = c[now];
    ts[now] = scr;
    while (now != bgn) {
      ret++;
      now = p[now];
      scr += c[now];
      ts[now] = scr;
    }
    return ret;
  }
}
