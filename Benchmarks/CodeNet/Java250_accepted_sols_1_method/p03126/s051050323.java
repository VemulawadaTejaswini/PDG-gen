import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] cnt = new int[M];
    int ans = 0;
    for (int i = 0; i < N; i++) {
      int roop = sc.nextInt();
      for (int j = 0; j < roop; j++) {
        cnt[sc.nextInt() - 1]++;
      }
    }
    for (int i = 0; i < M; i++) {
      if (cnt[i] == N) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}
