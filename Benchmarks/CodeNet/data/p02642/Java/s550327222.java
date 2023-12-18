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

  private static List<Integer> getPrimes(int max) {
    if (max < 2) return new ArrayList<>();
    Deque<Integer> seed = new ArrayDeque<>();
    Deque<Integer> nextseed = new ArrayDeque<>();
    seed.add(2);
    for (int i = 3; i <= max; i += 2) {
      seed.add(i);
    }
    List<Integer> primes = new ArrayList<>();
    while (!seed.isEmpty()) {
      nextseed.clear();
      int p = seed.poll();
      primes.add(p);
      while (!seed.isEmpty()) {
        int val = seed.poll();
        if (val % p == 0) continue;
        nextseed.add(val);
      }
      if (p * p >= max) {
        primes.addAll(nextseed);
        break;
      }
      seed.clear();
      seed.addAll(nextseed);
    }
    return primes;
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] a = sc.nextIntArray(n);
    Arrays.sort(a);
    int max = a[n - 1];
    int min = a[0];
    if (min == 1 || max == min) {
      System.out.println(0);
      return;
    }
    Deque<Integer> index = new ArrayDeque<>();
    Deque<Integer> index2 = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
      index.add(i);
    }
    int count = 0;
    while (!index.isEmpty()) {
      index2.clear();
      int i = index.poll();
      count++;
      while (!index.isEmpty()) {
        int j = index.poll();
        if (a[j] % a[i] == 0) continue;
        index2.add(j);
      }
      index.addAll(index2);
    }
    System.out.println(count);
  }
}