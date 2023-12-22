import java.util.*;

public class Main {
  public static void main(final String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in);
    try {
      int h1 = scanner.nextInt();
      int m1 = scanner.nextInt();
      int h2 = scanner.nextInt();
      int m2 = scanner.nextInt();
      int k = scanner.nextInt();

      int ans = h2 * 60 + m2 - h1 * 60 - m1 - k;
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}
