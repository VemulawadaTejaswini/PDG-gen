import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 2019;
    char[] S = scanner.next().toCharArray();
    int N = S.length;
    long res = 0;
    Map<Integer, Integer> freq = new HashMap<>();
    freq.put(0, 1);
    int r = 0;
    long e = 1;
    for (int i = N - 1; i >= 0; i--) {
      r += (S[i] - '0') * e % M;
      r %= M;
      res += freq.getOrDefault(r, 0);
      freq.put(r, freq.getOrDefault(r, 0) + 1);
      e *= 10;
      e %= M;
    }
    System.out.println(res);
  }
}
