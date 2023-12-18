import java.util.Scanner;

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

    int max = 0;
    for (int i = 0; i < n; i++) {
      int countS = 0;
      int countT = 0;
      for (int j = i; j < n; j++) {
        if (s[i].equals(s[j])) {
          countS++;
        }
      }
      for (int j = 0; j < m; j++) {
        if (s[i].equals(t[j])) {
          countT++;
        }
      }
      if (countS - countT > max) {
        max = countS - countT;
      }
    }
    System.out.println(max);
  }

}
