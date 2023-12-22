import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int min = 2_000_000_010;
    for (int i = -1; i < 2; i += 2) {
      for (int j = -1; j < 2; j += 2) {
        int r = i * y - j * x;
        if (r < 0) continue;
        if (i < 0) r++;
        if (j < 0) r++;
        min = Math.min(min, r);
      }
    }
    System.out.println(min);
  }
}
