import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char before = S.charAt(0);
    int ans = 0;
    for (int i = 1; i < S.length(); i++) {
      if (before != S.charAt(i)) {
        ans++;
        before = S.charAt(i);
      }
    }
    System.out.println(ans);
  }
}