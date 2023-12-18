import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int S_length = S.length();
    while (true) {
      if (S.length() % 2 == 1) {
        S = S.substring(0, S.length() - 1);
      } else {
        String sub1 = S.substring(0, S.length() / 2);
        String sub2 = S.substring(S.length() / 2, S.length());
        if (S.length() < S_length && sub1.equals(sub2)) {
          System.out.println(sub1.length() * 2);
          return;
        } else {
          S = S.substring(0, S.length() - 1);
        }
      }
    }
  }
}