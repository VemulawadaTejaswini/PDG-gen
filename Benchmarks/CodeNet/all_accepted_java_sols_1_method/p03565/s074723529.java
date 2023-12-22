import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();

    for (int i = s.length - t.length; i >= 0; i--) {
      boolean found = true;
      for (int j = 0; j < t.length; j++) {
        if (s[i + j] != '?' && s[i + j] != t[j]) {
          found = false;
          break;
        }
      }
      if (found) {
        System.arraycopy(t, 0, s, i, t.length);
        for (int j = 0; j < s.length; j++) {
          if (s[j] == '?') s[j] = 'a';
        }
        System.out.println(new String(s));
        return;
      }
    }
    System.out.println("UNRESTORABLE");
  }
}
