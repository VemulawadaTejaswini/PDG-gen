import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    int number3 = scanner.nextInt();
    System.out.println((number1 + number2 + number3) < 22 ? "win" : "bust");
  }
}