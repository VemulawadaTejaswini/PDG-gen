import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    long X = in.nextLong();
    boolean shouldContinue = true;

    for (long a = -300L; a <= 300L && shouldContinue; a++) {
      for (long b = -300L; b <= 300L && shouldContinue; b++) {
        if (Math.pow(a, 5) - Math.pow(b, 5) == X) {
          System.out.printf("%d %d\n", a, b);
          shouldContinue = false;
        }
      }
    }
  }
}
