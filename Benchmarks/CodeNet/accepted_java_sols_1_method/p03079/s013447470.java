import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] a = new int[3];
    a[0] = scanner.nextInt();
    a[1] = scanner.nextInt();
    a[2] = scanner.nextInt();
    if (a[0] == a[1] && a[1] == a[2]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
