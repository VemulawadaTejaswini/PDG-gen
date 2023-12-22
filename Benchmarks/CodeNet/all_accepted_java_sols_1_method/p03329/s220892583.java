import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    int e6 = 6, e9 = 9, flag = 0;
    while (true) {
      if (flag == 6) {
        e6 *= 6;
      } else if (flag == 9) {
        e9 *= 9;
      }
      if (e6 > N && e9 > N) {
        break;
      } else if (e6 < e9) {
        list.add(e6);
        flag = 6;
      } else {
        list.add(e9);
        flag = 9;
      }
    }

    int dp[] = new int[N + 1];
    dp[0] = 0;
    for (int i = 1; i < N + 1; i++) {
      dp[i] = dp[i - 1] + 1;
      for (int j = 0; j < list.size(); j++) {
        int t = list.get(j);
        if (i - t < 0) {
          break;
        } else {
          dp[i] = Math.min(dp[i], dp[i - t] + 1);
        }
      }
    }
    System.out.println(dp[N]);
  }
}