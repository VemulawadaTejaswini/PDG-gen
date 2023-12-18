import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int cnt = 0;
    int max = 0;
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) == 'I') {
        cnt++;
        max = Math.max(cnt, max);
      } else {
        cnt--;
      }
    }
    System.out.println(max);
  }
}
