import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// Solution
public class Main {
  private static Scanner in;
  private static PrintWriter out;
  private static final String INPUT = ""; // input file name

  /**
   * Interactive get next command
   */
  static int get(int pos) {
    out.println(pos + 1);
    out.flush();
    return ni();
  }

  static void solve() {
    int n = ni(), m = ni();
    long k = nl();

    long[] a = new long[n];
    long[] b = new long[m];

    long sum = 0;
    int aIndex = 0;

    for (int i = 0; i < n; i++) {
      a[i] = ni();
    }

    while (aIndex < n && sum + a[aIndex] <= k) {
      sum += a[aIndex];
      aIndex++;
    }

    for (int i = 0; i < m; i++) {
      b[i] = ni();
    }

    int bIndex = 0;

    while (bIndex < m && sum + b[bIndex] <= k) {
      sum += b[bIndex];
      bIndex++;
    }

    int ans = (aIndex) + (bIndex);

    for (int i = bIndex; i < m; i++) {
      sum += b[i];

      if (aIndex > 0) {
        if (sum <= k) {
          ans = Math.max(ans, aIndex + i);
        }

        sum -= a[aIndex];
        aIndex--;
      } else if (sum <= k) {
        ans = Math.max(ans, i);
      } else {
        break;
      }
//
//      if (sum <= k) {
//        ans = Math.max(ans, (aIndex + 1) + (i + 1));
//      }
    }


    out.println(ans);
  }

  static String convert(int x) {
    char[] z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    StringBuilder sb = new StringBuilder();

    while (x > 0) {
      if (x % 26 == 0) {
        x = x / 26 - 1;
        sb.append('Z');
      } else {
        sb.append(z[x % 26 - 1]);
        x = x / 26;
      }
    }

    return sb.reverse().toString();
  }

  static int sconvert(String s) {
    int ans = 0;

    for (char c: s.toCharArray()) {
      int t = c - 'A' + 1;
      ans = ans * 26 + t;
    }

    return ans;
  }

  public static void main(String[] args) throws Exception {
    long S = System.currentTimeMillis();
    in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
    out = new PrintWriter(System.out);

    solve();
    out.flush();
    long G = System.currentTimeMillis();
    tr(G - S + "ms");
  }

  private static int gcd(int a, int b) {
    while (b != 0) {
      int t = b;
      b = a % b;
      a = t;
    }

    return a;
  }

  private static int ni() {
    return in.nextInt();
  }

  private static String nt() {
    return in.next();
  }

  private static String ns() {
    return in.nextLine();
  }

  private static long nl() {
    return in.nextLong();
  }

  // Math Utils
  private static int pi(int num, int pow) {
    int result = 1;

    while (pow > 0) {
      if (pow % 2 == 1) {
        result *= num;
      }

      num *= num;
      pow /= 2;
    }

    return result;
  }

  private static int pim(int num, int pow, int mod) {
    int result = 1;

    while (pow > 0) {
      if (pow % 2 == 1) {
        // keep collecting `odd` num in result
        result = (result * num) % mod;
      }

      num = (num * num) % mod;
      pow /= 2;
    }

    return result;
  }

  private static long pl(long num, long pow) {
    long result = 1;

    while (pow > 0) {
      if (pow % 2 == 1) {
        result *= num;
      }

      num *= num;
      pow /= 2;
    }

    return result;
  }

  private static long plm(long num, long pow, long mod) {
    long result = 1;

    while (pow > 0) {
      if (pow % 2 == 1) {
        // keep collecting `odd` num in result
        result = (result * num) % mod;
      }

      num = (num * num) % mod;
      pow /= 2;
    }

    return result;
  }

  static void tr(Object... o) {
    if (!INPUT.isEmpty())
      out.println(Arrays.deepToString(o));
  }

  private static void fo(int begin, int end, Callback call) {
    for (int i = begin; i < end; i++) {
      call.call(i);
    }
  }

  @FunctionalInterface
  private interface Callback {
    void call(int index);
  }
}
