import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int ans = 0;
    for (int i = 0; i < n - 1; i++) {
      // 位置iを含む左半分を切断。出現文字の個数をカウント。
      int[] seen = new int[26];
      for (int j = 0; j <=i; j++) {
        int k = s.charAt(j) - 'a';
        seen[k]++;
      }

      // 右半分に対して、左半分で出現した文字をカウント。
      // 同じ文字を重複して数えないようにする。
      int cnt = 0;
      for (int j = i + 1; j < n; j++) {
        int k = s.charAt(j) - 'a';
        if (seen[k] != 0) {
          cnt++;
          seen[k] = 0;
        }
      }
      if (ans < cnt) ans = cnt; // 最大値更新
    }

    System.out.print(ans);
  } 
}
