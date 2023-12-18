import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int a = 0;
    for (int i = 9; i > 0; i--) {
      if (N % i == 0) {
        a = N / i;
        break;
      }
    }
    if (a == 0) {
      System.out.println("No");
      return;
    }
    int b = 0;
    for (int i = 9; i > 0; i--) {
      if (a % i == 0) {
        b = a / i;
        break;
      }
    }
    if (b == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
