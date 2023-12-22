import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] h = new int[N];
    for (int i = 0; i < N; i++) h[i] = scanner.nextInt();
    int max = 0;
    int count = 0;
    for (int i = 0; i < N - 1; i++) {
      if (h[i] >= h[i + 1]) count++;
      else {
        max = Math.max(max, count);
        count = 0;
      }
    }
    max = Math.max(max, count);
    System.out.println(max);
  }
}
