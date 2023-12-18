import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int cnt = 0;
    int prev = 0;
    for (int i = 0; i < N; i++) {
      int h = scanner.nextInt();
      if (h < prev) cnt += prev - h;
      prev = h;
    }
    cnt += prev;
    System.out.println(cnt);
  }
}
