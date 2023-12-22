import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 0;
    int cnt = 0;

    for (int i = 1; i <= N; i++) {
      int tmp = i;
      int tmpCnt = 0;
      while (true) {
        if (tmp % 2 == 0) {
          tmp = tmp / 2;
          tmpCnt++;
        } else {
          break;
        }
      }

      if (Math.max(cnt, tmpCnt) == tmpCnt) {
        ans = i;
        cnt = tmpCnt;
      }
    }

    System.out.println(ans);
  }
}