import java.io.*;
import java.util.*;

public class Main {
  static class Pair {
    int num;
    int cut;

    Pair(int num, int cut) {
      this.num = num;
      this.cut = cut;
    }
  }

  static long gcd(long a, long b) {
    if (b == 0) return a;
    String key = a + "?" + b;
    if (memo.containsKey(key)) {
      return memo.get(key);
    }
    int acc = 1;
    while (((a & 1) == 0) && ((b & 1) == 0)) {
      acc <<= 1;
      a >>= 1;
      b >>= 1;
    }
    long val = (a > b) ? acc * gcd(b, a - b) : acc * gcd(a, b - a);
    memo.put(key, val);
    return val;
  }

  static Map<String, Long> memo = new HashMap<>();

  public static void main(String[] args) throws IOException {
    sc = new MScanner(System.in);
    pw = new PrintWriter(System.out);
    int N = sc.nextInt();
    long[] nums = sc.longArr(N);
    long MOD = 1000000009;
    long cur = nums[0];
    boolean notPairP = false;
    // for (int i = 0; i < N; i++) {
    //  for (int j = i + 1; j < N; j++) {
    //    if (gcd(nums[i], nums[j]) != 1) {
    //      notPairP = true;
    //    }
    //    ;
    //    if (notPairP) break;
    //  }
    //  if (notPairP) break;
    // }
    for (int i = 1; i < N; i++) {
        if(gcd(cur, nums[1]) != 1) {
          notPairP  = true;
          break;
        }
        cur *= nums[i];
        cur %= MOD;
    }
    if (!notPairP) {
      pw.println("pairwise coprime");
      pw.flush();
      return;
    }
    boolean setPrime = false;
    cur = nums[0];
    for (int i = 0; i < N; i++) {
      cur = gcd(cur, nums[i]);
      if (cur == 1) {
        setPrime = true;
        break;
      }
    }

    if (setPrime) {
      pw.println("setwise coprime");
    } else {
      pw.println("not coprime");
    }

    // pw.println(groupsSizeCount.entrySet());
    // pw.println(m);
    // pw.println();

    pw.flush();
    // System.out.println(cnt);
  }

  /**
   * https://www.slideshare.net/hcpc_hokudai/binary-indexed-tree A space efficient version segment
   * tree. Usually for range sum. Or the required metric can be calulated in that:
   *
   * <p>right_metric = parant_metric - left_metric Only then, we can stop memoizing right_metric
   *
   * <p>The internal structure is a 1-base array, to simplify calculation of parent node's idx. lsb
   * = 3 & -3 = 2 (0x0011 & 0x1101 = 0x0001) lastParentOf3 = 3 - lsb = 2 curParentOf3 = 3 + lsb = 4
   */
  static class FenwickTree {
    private final long[] state;
    private final int size;

    FenwickTree(int size) {
      this.size = size;
      state = new long[size + 1];
    }

    @Override
    public String toString() {
      return Arrays.toString(state);
    }

    long queryRangeSumFromZeroTo(int idx) {
      long sum = 0;
      while (idx != 0) {
        sum += state[idx];
        idx -= (idx & -idx);
      }
      return sum;
    }

    /** @param val can be negative */
    void updateElement(int idx, long val) {
      while (idx <= size) {
        state[idx] += val;
        idx += (idx & -idx);
      }
    }
  }

  // sc.close();
  // pw.println(cnt);
  // pw.flush();

  static PrintWriter pw;
  static MScanner sc;

  static class MScanner {
    StringTokenizer st;
    BufferedReader br;

    public MScanner(InputStream system) {
      br = new BufferedReader(new InputStreamReader(system));
    }

    public MScanner(String file) throws Exception {
      br = new BufferedReader(new FileReader(file));
    }

    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
      return st.nextToken();
    }

    public int[] intArr(int n) throws IOException {
      int[] in = new int[n];
      for (int i = 0; i < n; i++) in[i] = nextInt();
      return in;
    }

    public long[] longArr(int n) throws IOException {
      long[] in = new long[n];
      for (int i = 0; i < n; i++) in[i] = nextLong();
      return in;
    }

    public int[] intSortedArr(int n) throws IOException {
      int[] in = new int[n];
      for (int i = 0; i < n; i++) in[i] = nextInt();
      shuffle(in);
      Arrays.sort(in);
      return in;
    }

    public long[] longSortedArr(int n) throws IOException {
      long[] in = new long[n];
      for (int i = 0; i < n; i++) in[i] = nextLong();
      shuffle(in);
      Arrays.sort(in);
      return in;
    }

    public Integer[] IntegerArr(int n) throws IOException {
      Integer[] in = new Integer[n];
      for (int i = 0; i < n; i++) in[i] = nextInt();
      return in;
    }

    public Long[] LongArr(int n) throws IOException {
      Long[] in = new Long[n];
      for (int i = 0; i < n; i++) in[i] = nextLong();
      return in;
    }

    public String nextLine() throws IOException {
      return br.readLine();
    }

    public int nextInt() throws IOException {
      return Integer.parseInt(next());
    }

    public double nextDouble() throws IOException {
      return Double.parseDouble(next());
    }

    public char nextChar() throws IOException {
      return next().charAt(0);
    }

    public long nextLong() throws IOException {
      return Long.parseLong(next());
    }

    public boolean ready() throws IOException {
      return br.ready();
    }

    public void waitForInput() throws InterruptedException {
      Thread.sleep(3000);
    }
  }

  static void shuffle(int[] in) {
    for (int i = 0; i < in.length; i++) {
      int idx = (int) (Math.random() * in.length);
      int tmp = in[i];
      in[i] = in[idx];
      in[idx] = tmp;
    }
  }

  static void shuffle(long[] in) {
    for (int i = 0; i < in.length; i++) {
      int idx = (int) (Math.random() * in.length);
      long tmp = in[i];
      in[i] = in[idx];
      in[idx] = tmp;
    }
  }
}
