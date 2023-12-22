import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();
    if (solve(s, t)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean solve(char[] s, char[] t) {
    for (int i = 0; i < s.length; i++) {
      boolean ans = true;
      for (int j = 0; j < s.length; j++) {
        if (s[j] != t[(j + i) % t.length]) {
          ans = false;
          break;
        }
      }
      if (ans) return true;
    }
    return false;
  }
}
