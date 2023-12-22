import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < N; i++) sum += A[i];

    if (sum >= H) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
