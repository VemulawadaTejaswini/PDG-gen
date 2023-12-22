import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int cnt = 0;
    int cnt1 = 0;
    for (int i = 0; i < S.length(); i++) {
      if (i % 2 == 0 && S.charAt(i) == '0') {
        cnt++;
      } else if (!(i % 2 == 0) && S.charAt(i) == '1') {
        cnt++;
      }
    }
    for (int i = 0; i < S.length(); i++) {
      if (i % 2 == 0 && S.charAt(i) == '1') {
        cnt1++;
      } else if (!(i % 2 == 0) && S.charAt(i) == '0') {
        cnt1++;
      }
    }
    System.out.println(Math.min(cnt, cnt1));
  }
}
