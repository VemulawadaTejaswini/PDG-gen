import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] cnt = new int[n];
      for (int i = 0; i < m; i++) {
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        cnt[a]++;
        cnt[b]++;
      }
      for (int i = 0; i < n; i++) System.out.println(cnt[i]);
    } finally {
      sc.close();
    }
  }
}