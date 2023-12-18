import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s, s_c;
    int m, h;
    while (1 > 0) {
      s = sc.next();
      if (s.equals("-")) break;
      m = sc.nextInt();
      for (int i = 0; i < m; i++) {
        h = sc.nextInt();
        s_c = s.substring(0, h);
        s = s.substring(h, s.length());
        s += s_c;
      }
      System.out.printf("%s\n", s);
    }

    sc.close();
  }
}

