import java.util.Scanner;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    String S = sc.next();
    boolean flg = false;
    if (S.startsWith("A")) {
      String sub = S.substring(2, S.length() - 1);
      int cnt = 0;
      for (int i = 0; i < sub.length(); i++) {
        char c = sub.charAt(i);
        if (c == 'C') cnt++;
      }

      if (cnt == 1) {
        int ucnt = 0;
        for (int i = 0; i < S.length(); i++) {
          char c = S.charAt(i);
          if (Character.isUpperCase(c)) {
            ucnt++;
          }
        }

        if (ucnt == 2) {
          flg = true;
        }
      }
    }

    if (flg) {
      System.out.println("AC");
    } else {
      System.out.println("WA");
    }
  }
}

