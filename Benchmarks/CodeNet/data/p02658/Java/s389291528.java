import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  static int n;
  static List<Long> a;
  static long ans;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    in = br.readLine().split(" ");
    a = Arrays.stream(in).map(Long::parseLong).collect(Collectors.toList());

    br.close();

    ans = 1;

    for (long m : a) {
      if(m == 0) ans = 0;
    }

    for (long m : a) {
      if(ans == 0 || m == 0) {
        ans = 0;
        break;
      }

      if(keta(ans) + keta(m) > 20){
        ans = -1;
        break;
      }

      if(keta(ans) + keta(m) == 20){
        if(tc(ans) * tc(m) != 1){
          ans = -1;
          break;
        }
      }

      ans *= m;

      if(ans > 1_000_000_000_000_000_000L) break;

    }

    out.println(ans > 1_000_000_000_000_000_000L ? -1 : ans);

    out.flush();
  }

  static long keta(long x){
    long ret = 0;
    long tmp = x;
    while(tmp > 0){
      tmp /= 10;
      ret++;
    }
    return ret;
  }

  static long tc(long x){
    long tmp = x;
    while(tmp >= 10){
      tmp /= 10;
    }
    return tmp;
  }
}
