import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] H = new long[N];
    for (int i = 0; i < N; i++) {
      H[i] = sc.nextLong();
    }
    sc.close();

    int ans = 0;
    int right = 0;

    for (int left = 0; left < N; left++) {
      // 右隣がいまのマスより小さければright++
      while (right < N - 1 && H[right] >= H[right + 1]) {
        right++;
      }

      // 更新
      ans = Math.max(ans, right - left);
      if (left == right) {
        right++;
      }
    }

    System.out.println(ans);
  }
}
