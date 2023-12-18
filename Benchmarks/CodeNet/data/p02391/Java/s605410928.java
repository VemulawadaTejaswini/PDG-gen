import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    printResult(a, b);
  }

  private static void printResult(int a, int b) {
    if (a == b) {
      System.out.println(String.format("%d == %d", a, b));
    } else if (a > b) {
      System.out.println(String.format("%d > %d", a, b));
    } else {
      System.out.println(String.format("%d < %d", a, b));
    }
  }
}