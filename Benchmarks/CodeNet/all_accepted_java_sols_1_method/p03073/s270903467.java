import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if (!S.contains("1") || !S.contains("0")) {
      System.out.println(S.length() / 2);
      return;
    } else {
      // int one = 0;
      // int zero = 0;
      // for (int i = 0; i < S.length(); i++) {
      // if (S.charAt(i) == '0')
      // zero++;
      // else
      // one++;
      // }
      // int min = Math.min(zero, one);
      // System.out.println(Math.abs(min - S.length() / 2));
      char first = S.charAt(0);
      int count = 0;
      if (first == '1') {
        for (int i = 1; i < S.length(); i += 2) {
          if (S.charAt(i) != '0')
            count++;
        }

        for (int i = 0; i < S.length(); i += 2) {
          if (S.charAt(i) != '1')
            count++;
        }
      } else {
        for (int i = 1; i < S.length(); i += 2) {
          if (S.charAt(i) != '1')
            count++;
        }

        for (int i = 0; i < S.length(); i += 2) {
          if (S.charAt(i) != '0')
            count++;
        }
      }

      System.out.println(count);

    }
  }
}