import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class RollingHash {
  final long base = 10007L;
  final long mod = 999999937L;
  long[] power;
  long[] hash;

  RollingHash(String s) {
    int n = s.length();
    power = new long[n + 1];
    hash = new long[n + 1];
    power[0] = 1L;
    for (int i = 0; i < n; i++) {
      power[i + 1] = power[i] * base % mod;
      hash[i + 1] = (hash[i] * base + s.charAt(i)) % mod;
    }
  }

  long getHash(int l, int r) {
    return ((hash[r] - hash[l] * power[r - l]) % mod + mod) % mod;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String T = sc.next();
    String P = sc.next();

    RollingHash rhT = new RollingHash(T);
    RollingHash rhP = new RollingHash(P);
    
    if (T.length() < P.length()) {
      return;
    }

    PrintWriter out = new PrintWriter(System.out);
    long pHash = rhP.getHash(0, P.length());
    // System.err.println(pHash);
    for (int i = 0; i < T.length() - P.length() + 1; i++) {
      long tHash = rhT.getHash(i, i + P.length());
      // System.err.println(tHash);
      if (pHash == tHash) {
        out.println(i);
      }
    }
    out.close();
  }
}
