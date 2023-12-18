import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int kazu = Integer.parseInt(sc.next());
      long totalnum = 1;
      for (int i = 0; i < kazu; i++) {
        totalnum *= Long.parseLong(sc.next());
      }
      if (new Long(1000000000000000000L) < totalnum) {
        System.out.println(-1);
      } else {
        System.out.println(totalnum);
      }
    }
  }
}