import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count_ans = 0;
    for (int i = 1; i <= n; i += 2) {
      int count_tmp = 0;
      for (int j = 1; j <= i; j += 2) {
        if (i % j == 0) {
          count_tmp++;
        }
      }
      if (count_tmp == 8) {
        count_ans++;
      }
    }
    System.out.println(count_ans);
  }
}