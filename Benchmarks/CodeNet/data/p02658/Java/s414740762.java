import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int kazu = Integer.parseInt(sc.next());
      long totalnum = 1;
      Long[] b = new Long[kazu];
      for (int i = 0; i < kazu; i++) {
        b[i] = Long.parseLong(sc.next());
      }
      Arrays.sort(b);
      for (long z : b) {
        totalnum *= z;
        if (1000000000000000000L < totalnum) {
          System.out.println(-1);
          System.exit(0);
        }
      }
      System.out.println(totalnum);
    }
  }
}