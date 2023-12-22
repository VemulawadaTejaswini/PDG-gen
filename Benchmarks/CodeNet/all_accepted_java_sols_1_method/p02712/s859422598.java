import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = Integer.parseInt(sc.next());
      long result = 0;
      for (int i = 0; i <= N; i++) {
        if (!(i % 3 == 0 || i % 5 == 0)) {
          result += i;
        }
      }

      System.out.println(result);
    }
  }
}
