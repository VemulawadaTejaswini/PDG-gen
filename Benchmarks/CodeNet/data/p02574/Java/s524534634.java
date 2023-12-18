import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

  public static int gcd(int a, int b) {
    if (b > a) return gcd(b, a);
    if (b == 0) return a;

    return gcd(b, a % b);
  }

  public static long gcd(long a, long b) {
    if (b > a) return gcd(b, a);
    if (b == 0L) return a;

    return gcd(b, a % b);
  }

  static int n;
  static int[] a, minp;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    in = br.readLine().split(" ");
    a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    int m = 1_000_000;
    minp = new int[m + 1];

    for (int i = 2; i <= m; i++) {
      if(minp[i] != 0) continue;
      for (int j = i; j <= m; j+=i) {
        minp[j] = i;
      }
    }

    Set<Integer> facs = new HashSet<>();

    boolean ng = false;

    for (int i = 0; i < n; i++) {

      int tmp = a[i];

      while (tmp > 1){
        int p = minp[tmp];
        if(facs.contains(p)) {
          ng = true;
          break;
        }
        tmp /= p;
      }

      if(ng) break;

      tmp = a[i];

      while (tmp > 1){
        int p = minp[tmp];
        facs.add(p);
        tmp /= p;
      }
    }

    if(!ng){
      System.out.println("pairwise coprime");
      return;
    }

    int allGcd = a[0];

    for (int i = 1; i < n; i++) {
      allGcd = gcd(allGcd, a[i]);
      if (allGcd == 1) {
        System.out.println("setwise coprime");
        return;
      }
    }

    out.println("not coprime");
    out.flush();
  }
}
