import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    String sign = null;

    if (a < b) {
      sign = "<";
    } else if (a > b) {
      sign = ">";
    } else {
      sign = "==";
    }

    System.out.println("a " + sign  +  " b");
  }
}