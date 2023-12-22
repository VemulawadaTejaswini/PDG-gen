import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    boolean result = false;
    for (int i = 1; i <= 9; i++) {
      if (a % i == 0) {
        int b = a / i;
        if (b >= 1 && b <= 9) {
          result = true;
          break;
        }
      }
    }
    System.out.println(result ? "Yes" : "No");
  }
}