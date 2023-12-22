import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int ans = 0;
    for (char c : S.toCharArray()) {
      if (c == '+') {
        ans++;
      } else {
        ans--;
      }
    }
    System.out.println(ans);
  }
}