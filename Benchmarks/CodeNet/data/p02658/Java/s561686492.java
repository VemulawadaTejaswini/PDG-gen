import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int kazu = Integer.parseInt(sc.next());
      long totalnum = 1;
      for (int i = 0; i < kazu; i++) {
        totalnum *= Long.parseLong(sc.next());
      }
      if (totalnum <= Math.pow(10, 18)) {
        System.out.println(totalnum);
      } else {
        System.out.println(-1);
      }
    }
  }
}