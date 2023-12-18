import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int[] w = new int[N];
    int[] e = new int[N];
    w[0] = 0;
    e[N - 1] = 0;
    for (int i = 1; i < N; i++) {
      w[i] = w[i - 1];
      if (S.charAt(i - 1) == 'W') {
        w[i]++;
      }
      e[N - 1 - i] = e[N - i];
      if (S.charAt(N - i) == 'E') {
        e[N - 1 - i]++;
      }
    }
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int tmp = w[i] + e[i];
      if (min > tmp) {
        min = tmp;
      }
    }
    System.out.println(min);
  }
}