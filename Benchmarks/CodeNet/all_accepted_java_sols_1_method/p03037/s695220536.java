import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int left = 0, right = N;
    for (int i = 0; i < M; i++) {
      int l = scanner.nextInt();
      int r = scanner.nextInt();
      if (l > right || r < left) {
        System.out.println(0);
        return;
      }
      if (l > left) left = l;
      if (r < right) right = r;
    }
    System.out.println(right - left + 1);
  }
}
