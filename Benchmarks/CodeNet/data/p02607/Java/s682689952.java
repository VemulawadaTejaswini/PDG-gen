import java.util.*;

public class Main {

  public static void main(String[] args) {
    int N = scanner.nextInt();
    int res = 0;
    for (int i = 0; i < N; i++) {
      int num = scanner.nextInt();
      if (i % 2 != 0 && num % 2 != 0) {
        res++;
      }
    }
    System.out.println(res);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
