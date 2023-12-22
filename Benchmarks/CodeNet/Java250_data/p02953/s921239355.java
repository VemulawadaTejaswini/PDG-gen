import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] h = new int[N];
    for (int i = 0; i < N; i++) h[i] = scanner.nextInt();

    for (int i = N - 1; i >= 1; i--) {
      if (h[i] < h[i - 1]) h[i - 1]--;
      if (h[i] < h[i - 1]) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
