import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();

    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        if (i * j == N) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}