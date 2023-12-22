import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    int max = 0;
    int ans = 0;
    if (N == 1) {
      System.out.println(1);
      return;
    }
    for (int i = 1; i <= N; i++) {
      cnt = 0;
      int A = i;
      while (A % 2 == 0) {
        A /= 2;
        cnt++;
      }
      if (cnt > max) {
        ans = i;
        max = cnt;
      }
    }
    System.out.println(ans);
  }
}
