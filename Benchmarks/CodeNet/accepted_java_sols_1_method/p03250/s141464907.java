import java.util.Scanner;

public class Main {
  public static void main(String args[]) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int x = Math.max(a, Math.max(b, c));
    System.out.println(a + b + c + x*9);
  }
}
