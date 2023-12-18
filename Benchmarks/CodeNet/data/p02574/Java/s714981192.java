import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

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

  private static long gcd(long a, long b) {
    if (b == 0L) return a;
    return gcd(b, a % b);
  }

  private static List<Long> getPrimes(long max) {
    Deque<Long> seed = new ArrayDeque<>();
    seed.add(2L);
    for (int i = 3; i <= (int) max; i += 2) {
      seed.add((long) i);
    }
    List<Long> primes = new ArrayList<>();
    Deque<Long> newSeed = new ArrayDeque<>();
    while (true) {
      long p = seed.poll();
      primes.add(p);
      newSeed.clear();
      for (long si: seed) {
        if (si % p != 0) newSeed.add(si);
      }
      seed.clear();
      seed.addAll(newSeed);
      if (p * p > max) {
        primes.addAll(seed);
        break;
      }
    }
    return primes;
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    long[] a = sc.nextLongArray(n);
    long max = 0;
    for (long ai: a) max = Math.max(max, ai);
    List<Long> primes = getPrimes(max);
    boolean ispPirwiseCoprime = true;
    for (long p: primes) {
      int primeCount = 0;
      for (long ai: a) {
        if (p > ai) break;
        if (ai % p == 0) primeCount++;
        if (primeCount > 1) {
          ispPirwiseCoprime = false;
          break;
        }
      }
      if (!ispPirwiseCoprime) break;
    }
    if (ispPirwiseCoprime) {
      System.out.println("pairwise coprime");
      return;
    }
    long result = a[0];
    for (int i = 1; i < n; i++) {
      result = gcd(result, a[i]);
      if (result == 1) break;
    }
    if (result == 1) System.out.println("setwise coprime");
    else System.out.println("not coprime");
  }
}