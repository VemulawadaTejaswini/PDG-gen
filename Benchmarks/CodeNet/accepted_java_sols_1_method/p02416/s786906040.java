import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans;
    String x;
    char c;

    for (int i = 0;; i++) {
      x = sc.next();
      if (x.equals("0")) break;
      ans = 0;
      for (int j = 0; j < x.length(); j++) {// ans 算出
        c = x.charAt(j);
        ans += c - '0';
      }
      System.out.printf("%d\n", ans);
    }

    sc.close();
  }
}

