import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] v = new int[N];
    for (int i = 0; i < N; i++) v[i] = scanner.nextInt();

    long max = 0;
    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= N - i; j++) {
        if (i + j > K) continue;
        List<Integer> list = new ArrayList<>();
        for (int k = 0; k < i; k++) list.add(v[k]);
        for (int k = N - 1; k >= N - j; k--) list.add(v[k]);
        Collections.sort(list);
        int k = K - i - j;
        long sum = 0;
        for (int l = 0; l < list.size(); l++) {
          int vv = list.get(l);
          if (vv > 0 || l >= k) sum += vv;
        }
        max = Math.max(max, sum);
      }
    }
    System.out.println(max);
  }
}
