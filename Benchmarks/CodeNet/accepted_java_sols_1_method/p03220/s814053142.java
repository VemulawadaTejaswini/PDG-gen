import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    int[] H = new int[N];
    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }
    int ans_index = 0;
    int df = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int temp = T * 1000 - (H[i] * 6);
      int df_tmp = Math.abs(temp - 1000 * A);
      if (df > df_tmp) {
        df = df_tmp;
        ans_index = i + 1;
      }
    }
    System.out.println(ans_index);
  }
}