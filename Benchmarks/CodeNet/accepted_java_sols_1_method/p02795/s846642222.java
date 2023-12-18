import java.util.*;

public class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int N = sc.nextInt();

    if (W >= H) {
      for (int i = 1; i <= H; ++i) {
        if (N - W * i <= 0) {
          System.out.println(i);
          System.exit(0);
        }
      }
    } else {
      for (int i = 1; i <= W; ++i) {
        if (N - H * i <= 0) {
          System.out.println(i);
          System.exit(0);
        }
      }
    }
  }
}
