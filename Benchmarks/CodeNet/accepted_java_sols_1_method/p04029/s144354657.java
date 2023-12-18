import java.util.*;

public class Main {
  public static void main(final String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      System.out.println(n * (n + 1) / 2);
    } finally {
      scanner.close();
    }
  }
}
