import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int[] A = new int[N];
    Map<Integer, Integer> cnt = new HashMap<>();
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
      cnt.put(A[i], cnt.getOrDefault(A[i], 0) + 1);
      if (cnt.getOrDefault(A[i], 0) > 3) {
        System.out.println(0);
        return;
      }
    }
    Map<Integer, Integer> freq = new HashMap<>();
    long res = 1;
    for (int i = 0; i < N; i++) {
      if (A[i] != 0) {
        int p = freq.getOrDefault(A[i] - 1, 0);
        if (p <= 0) {
          System.out.println(0);
          return;
        }
        res *= p;
        res %= M;
        freq.put(A[i] - 1, p - 1);
      }
      int c = freq.getOrDefault(A[i], 0);
      c++;
      freq.put(A[i], c);
    }
    if (cnt.get(0) > 1) {
      System.out.println(res * 6 % M);
    } else {
      System.out.println(res * 3 % M);
    }
  }
}
