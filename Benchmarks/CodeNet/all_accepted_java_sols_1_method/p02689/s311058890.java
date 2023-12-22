import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int A = 0;
    int B = 0;
    int ans = 0;
    int[] dis = new int[N];
    int[] cnt = new int[N];
    for (int i = 0; i < N; i++) {
      dis[i] = sc.nextInt();
    }
    for (int j = 0; j < M; j++) {
      A = sc.nextInt();
      B = sc.nextInt();
      if (dis[A-1] < dis[B-1]) {
        cnt[A-1]++;
      } else if (dis[A-1] > dis[B-1]) {
        cnt[B-1]++;
      } else {
        cnt[A-1]++;
        cnt[B-1]++;
      }
    }
    for (int x = 0; x < N; x++) {
      if (cnt[x] == 0) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}