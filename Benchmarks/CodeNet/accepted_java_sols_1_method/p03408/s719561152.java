import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    int n = sc.nextInt();
    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
      lhs.add(s[i]);
    }

    int m = sc.nextInt();
    String[] t = new String[m];
    for (int i = 0; i < m; i++) {
      t[i] = sc.next();
      lhs.add(t[i]);
    }

    int max = 0;
    for (String str : lhs) {
      int tmp = 0;

      for (int i = 0; i < n; i++) {
        if (s[i].equals(str)) {
          tmp++;
        }
      }

      for (int i = 0; i < m; i++) {
        if (t[i].equals(str)) {
          tmp--;
        }
      }

      max = Math.max(max, tmp);
    }

    System.out.println(max);

  }
}