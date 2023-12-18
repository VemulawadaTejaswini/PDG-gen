import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    boolean[] dislike = new boolean[10];
    for (int i = 0; i < K; i++) {
      int d = scanner.nextInt();
      dislike[d] = true;
    }

    loop:
    for (int i = N; i < 100000; i++) {
      int n = i;
      while (n > 0) {
        int d = n % 10;
        if (dislike[d]) continue loop;
        n /= 10;
      }
      System.out.println(i);
      return;
    }
  }
}
