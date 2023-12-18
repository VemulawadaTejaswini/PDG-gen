import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "AC";
    int c_count = 0;
    if (s.charAt(0) != 'A') {
      ans = "WA";
    }
    for (int i = 1; i < s.length(); i++) {
      if (Character.isUpperCase(s.charAt(i))) {
        if (i == 1 || i == s.length() - 1) {
          ans = "WA";
        } else if (i > 1 && i < s.length() - 1) {
          if (s.charAt(i) == 'C') {
            c_count++;
          } else {
            ans = "WA";
          }
        }
      }
    }
    if (c_count != 1) {
      ans = "WA";
    }
    System.out.println(ans);
  }
}