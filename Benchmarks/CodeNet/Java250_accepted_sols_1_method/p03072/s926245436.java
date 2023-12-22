import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    final Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int count = 1;
    int maxH = scanner.nextInt();
    int H = 0;

    for (int i = 0; i < N-1; i++) {
      H = scanner.nextInt();
      if (H >= maxH) {
        count++;
        maxH = H;
      }
    }
    System.out.println(count);
  }
}