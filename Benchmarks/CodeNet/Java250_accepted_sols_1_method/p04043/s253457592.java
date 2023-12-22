import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int i0 = scanner.nextInt();
    final int i1 = scanner.nextInt();
    final int i2 = scanner.nextInt();

    if (Math.min(i0, Math.min(i1, i2)) == 5 &&
        Math.max(i0, Math.max(i1, i2)) == 7 &&
        i0 + i1 + i2 == 17) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}