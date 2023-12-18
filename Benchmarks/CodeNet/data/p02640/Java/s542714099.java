import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();

    if (y > x * 4 || y < x * 2) {
      System.out.println("No");
      return;
    }

    if (y % 2 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
