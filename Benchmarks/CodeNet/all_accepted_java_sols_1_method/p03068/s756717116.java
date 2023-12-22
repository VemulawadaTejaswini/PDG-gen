import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      String s = scanner.next();
      int k = scanner.nextInt();
      char a = s.charAt(k-1);

      String ans = "";
      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == a) {
          ans += s.charAt(i);
        } else {
          ans += "*";
        }
      }
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}
