import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(in.readLine());
    int[] A = new int[N];
    StringTokenizer st = new StringTokenizer(in.readLine());
    for (int i = 0; i < N; ++i) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    System.out.println(solve(N, A));

    in.close();
  }

  private static String solve(int N, int[] A) {
    boolean pc = true;
    Set<Integer> primes = factorize(A[0]);

    for (int i = 1; i < N; ++i) {
      if (pc) {
        Set<Integer> factors = factorize(A[i]);
        for (int factor : factors) {
          if (primes.contains(factor)) {
            pc = false;
            break;
          }
        }
        primes.addAll(factors);
      }
    }

    if (pc) {
      return "pairwise coprime";
    }

    long lastGcd = A[0];
    for (int i = 1; i < N; ++i) {
      lastGcd = gcd(lastGcd, A[i]); 
    }
    
    if (lastGcd == 1) {
      return "setwise coprime";
    }

    return "not coprime";
  }

  private static Set<Integer> factorize(int x) {
    Set<Integer> factors = new HashSet<>();
    for (int i = 2; i <= (int) Math.floor(Math.sqrt(x)); ++i) {
      while (x % i == 0) {
        x /= i;
        factors.add(i);
      }
    }
    return factors;
  }

  private static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }

    return gcd(b, a % b);
  }
}