import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }

    int m = sc.nextInt();
    String[] t = new String[m];
    for (int i = 0; i < m; i++) {
      t[i] = sc.next();
    }

    int x = 0;
    int y = 0;

    for (int i = 0; i < n; i++) {
      x = 1;
      for (int j = i+1; j < n; j++) {
        if (s[i].equals(s[j])) x++;
      }
      for (int j = 0; j < m; j++) {
        if (s[i].equals(t[j])) x--;
      }
      y = Math.max(y, x);
    }

    System.out.println(y);
  }
}
