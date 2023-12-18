import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    b();
  }

  public static void b() {
    try (Scanner sc = new Scanner(System.in)) {
      int n = Integer.parseInt(sc.next());
      long totalnum = 1;
      Boolean flg = true;
      Long c = 0L;
      for (int i = 0; i < n; i++) {
        c = Long.parseLong(sc.next());
        if (c == 0) {
          System.out.println(0);
          System.exit(0);
        }
        if (flg) {
          totalnum = totalnum * c;
        }
        if (1000000000000000000L < totalnum) {
          flg = false;
        }
      }
      if (flg) {
        System.out.println(totalnum);
      } else {
        System.out.println(-1);
      }
    }
  }
}