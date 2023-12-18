import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    String s = scanner.next();
    int now = 1;
    int cnt = 0;
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      if (s.charAt(i) == (char) ('0' + now)) {
        cnt++;
      } else {
        now = 1 - now;
        list.add(cnt);
        cnt = 1;
      }
    }
    if (cnt != 0) {
      list.add(cnt);
    }
    if (list.size() % 2 == 0) {
      list.add(0);
    }

    int add = 2 * K + 1;

    int[] sum = new int[list.size() + 1];

    for (int i = 0; i < list.size(); i++) {
      sum[i + 1] = sum[i] + list.get(i);
    }

    int ans = 0;
    for (int i = 0; i < list.size(); i += 2) {
      int tmp;
      int left = i;
      int right = Math.min(i + add, list.size());
      tmp = sum[right] - sum[left];
      ans = Math.max(tmp, ans);
    }

    System.out.println(ans);

  }

}
