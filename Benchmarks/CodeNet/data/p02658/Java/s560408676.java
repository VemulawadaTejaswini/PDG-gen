import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int kazu = Integer.parseInt(sc.next());
      long totalnum = 1;
      Boolean flg = true;
      for (int i = 0; i < kazu; i++) {
        totalnum *= Long.parseLong(sc.next());
        if (totalnum > new Double(
            10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10).longValue()) {
          System.out.println(-1);
          flg = false;
        }
      }
      if (flg) {
        System.out.println(totalnum);
      }
    }
  }
}