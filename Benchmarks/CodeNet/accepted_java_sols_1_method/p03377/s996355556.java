import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();
    final int x = scanner.nextInt();
    System.out.println((x - a) >= 0 && (x - a) <= b ? "YES" : "NO");
  }
}
