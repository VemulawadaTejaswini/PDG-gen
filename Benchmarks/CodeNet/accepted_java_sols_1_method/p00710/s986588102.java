import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (1 > 0) {
      // 初期入力
      int n = sc.nextInt();// 枚数
      int r = sc.nextInt();// シャッフル回数
      if (n == 0 && r == 0) break;

      // カードの初期化
      int card[] = new int[n];
      for (int i = 0; i < n; i++) {
        card[i] = n - i;
      }

      // シャッフル
      for (int i = 0; i < r; i++) {
        int p = sc.nextInt();// 上からp枚目から
        int c = sc.nextInt();// c枚を一番上に
        // down初期化
        int down[] = new int[p - 1];
        for (int k = 0; k < p - 1; k++) {
          down[k] = card[k];
        }
        // up初期化
        int up[] = new int[c];
        for (int k = 0; k < c; k++) {
          up[k] = card[k + p - 1];
        }
        // シャッフル
        for (int k = 0; k < c; k++) {
          card[k] = up[k];
        }
        for (int k = 0; k < p - 1; k++) {
          card[k + c] = down[k];
        }
      }
      System.out.printf("%d\n", card[0]);
    }
  }
}

