import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // n 左の本の数 m; 右の本の数 k; 読書時間
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int[] leftBooks = new int[n];
    int[] rightBooks = new int[m];
    for (int i = 0; i < n; i++) {
      leftBooks[i] = sc.nextInt();
    }
    for (int j = 0; j < m; j++) {
      rightBooks[j] = sc.nextInt();
    }
    // しゃくとり法
    int right = m;
    int maxBooks = 0;
    long readTimeTmp = 0;
    // 右をすべて読む
    for (int i = 0; i < m; i++) {
      readTimeTmp += rightBooks[i];
    }
    for (int left = 0; left < n + 1; left++) {
      while (readTimeTmp > k && right > 0) {
        right--;
        readTimeTmp -= rightBooks[right];
      }
      // 右を減らせない状態でも時間がオーバー
      if (readTimeTmp > k) {
        break;
      }
      maxBooks = Math.max(maxBooks, left + right);
      // 最後はleft == n となってエラーなので回避
      if (left == n) {
        break;
      }
      readTimeTmp += leftBooks[left];
    }
    System.out.println(maxBooks);
  }
}