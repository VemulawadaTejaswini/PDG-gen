import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int[] count = new int[S.length()];
    if (S.charAt(S.length() - 1) == 'W') {
      count[S.length() - 1] = 1;
    }
    for (int i = S.length() - 2; i >= 0; i--) {
      count[i] = count[i + 1];
      if (S.charAt(i) == 'W') {
        count[i]++;
      }
    }
    long ans = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'B') {
        ans += count[i];
      }
    }
    System.out.println(ans);
  }
}