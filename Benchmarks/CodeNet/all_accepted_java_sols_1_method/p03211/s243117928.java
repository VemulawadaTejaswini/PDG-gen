import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      String s = scanner.next();
      int n = s.length();
      int ans = 999;
      for (int i = 0; i < n - 2; i++) {
        String t = s.substring(i, i+3);
        // System.out.println(t);
        int a = Integer.parseInt(t);
        int diff = Math.abs(a - 753);
        if (diff < ans) ans = diff;
      }
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}


