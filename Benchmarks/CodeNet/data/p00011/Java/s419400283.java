import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();// 縦線の本数
    int n = sc.nextInt();// 横棒の本数
    int a[] = new int[n];
    int b[] = new int[n];

    for (int i = 0; i < n; i++) {// 横棒の入力
      String ab = sc.next();
      String ab_p[] = ab.split(",");
      a[i] = Integer.parseInt(ab_p[0]);
      b[i] = Integer.parseInt(ab_p[1]);
    }

    for (int i = 1; i <= w; i++) {// 左から右
      int k = i;
      for (int j = n - 1; j >= 0; j--) {// 下から上へ辿る
        if (k == a[j]) {
          k = b[j];
        } else if (k == b[j]) {
          k = a[j];
        }
      }
      System.out.printf("%d\n", k);
    }
  }
}

