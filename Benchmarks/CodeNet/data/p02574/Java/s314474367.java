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
    boolean pc = true, sc = false;
    long multiply = A[0], lastGcd = A[0];

    for (int i = 1; i < N; ++i) {
      pc = pc && gcd(A[i], multiply) == 1;
      long newGcd = gcd(lastGcd, A[i]); 
      sc = !pc && newGcd == 1;
      multiply *= A[i];
      lastGcd = newGcd;
    }

    if (pc) {
      return "pairwise coprime";
    } else if (sc) {
      return "setwise coprime";
    } else {
      return "not coprime";
    }
  }

  private static long gcd(long a, long b) {
    if (a < b) {
      return gcd(b, a);
    }

    if (b == 0) {
      return a;
    }

    return gcd(b, a % b);
  }
}