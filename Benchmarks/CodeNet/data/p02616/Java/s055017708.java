import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] a = sc.nextLongArray(n);
    long mod = 1_000_000_007L;
    List<Long> positives = new ArrayList<>();
    List<Long> negatives = new ArrayList<>();
    for (long ai: a) {
      if (ai >= 0L) positives.add(ai);
      else negatives.add(ai);
    }
    Collections.sort(positives, Collections.reverseOrder());
    Collections.sort(negatives);
    List<BigInteger> cumMultiPositiveLeft = new ArrayList<>();
    List<BigInteger> cumMultiNegativeLeft = new ArrayList<>();
    List<BigInteger> cumMultiPositiveRight = new ArrayList<>();
    List<BigInteger> cumMultiNegativeRight = new ArrayList<>();
    cumMultiPositiveLeft.add(BigInteger.valueOf(1L));
    cumMultiNegativeLeft.add(BigInteger.valueOf(1L));
    cumMultiPositiveRight.add(BigInteger.valueOf(1L));
    cumMultiNegativeRight.add(BigInteger.valueOf(1L));
    BigInteger multi = BigInteger.valueOf(1L);
    for (long positive: positives) {
      multi = multi.multiply(BigInteger.valueOf(positive));
      cumMultiPositiveRight.add(multi);
    }
    multi = BigInteger.valueOf(1L);
    for (long negative: negatives) {
      multi = multi.multiply(BigInteger.valueOf(negative));
      cumMultiNegativeRight.add(multi);
    }
    Collections.sort(positives);
    Collections.sort(negatives, Collections.reverseOrder());
    multi = BigInteger.valueOf(1L);
    for (long positive: positives) {
      multi = multi.multiply(BigInteger.valueOf(positive));
      cumMultiPositiveLeft.add(multi);
    }
    multi = BigInteger.valueOf(1L);
    for (long negative: negatives) {
      multi = multi.multiply(BigInteger.valueOf(negative));
      cumMultiNegativeLeft.add(multi);
    }
    BigInteger max = null;
    for (int numPositive = 0; numPositive <= positives.size(); numPositive++) {
      int numNegative = k - numPositive;
      if (numNegative > negatives.size()) continue;
      if (numNegative % 2 == 0) {
        BigInteger val = cumMultiPositiveRight.get(numPositive).multiply(cumMultiNegativeRight.get(numNegative));
        if (max == null) max = val;
        if (max.compareTo(val) < 0) max = val;
      } else {
        BigInteger val = cumMultiPositiveLeft.get(numPositive).multiply(cumMultiNegativeLeft.get(numNegative));
        if (max == null) max = val;
        if (max.compareTo(val) < 0) max = val;
      }
    }
    max = max.mod(BigInteger.valueOf(mod));
    if (max.compareTo(BigInteger.valueOf(0L)) < 0) max = max.add(BigInteger.valueOf(mod));
    System.out.println(max.toString());
  }
}