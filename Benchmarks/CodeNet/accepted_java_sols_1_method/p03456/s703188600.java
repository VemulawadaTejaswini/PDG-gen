import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    final Scanner scanner = new Scanner(System.in);

    final int a = scanner.nextInt();
    final int b = scanner.nextInt();
    final int value = Integer.parseInt(Integer.toString(a) + Integer.toString(b));

    final int lowerSqrt = (int) Math.sqrt(value);
    if (value % lowerSqrt == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
