import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, s, s_max, s_min, s_sum;

    while ((n = sc.nextInt()) != 0) {
      s_max = 0;
      s_min = 1000;
      s_sum = 0;
      // 初期入力
      for (int i = 0; i < n; i++) {
        s = sc.nextInt();// 得点のデータセット
        if (s_max < s) s_max = s;
        if (s_min > s) s_min = s;
        s_sum += s;
      }
      s_sum = s_sum - s_max - s_min;

      System.out.printf("%d\n", s_sum/(n-2));
    }
  }
}

