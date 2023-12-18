import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int cnt = 0;
    for (int i = 0; i < S.length(); i++) {
      for (int j = 0; j < S.length(); j++) {
        if (S.charAt(i) == S.charAt(j)) {
          cnt++;
        }
      }
    }
    if (cnt == 8) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
