import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {

      int a = scanner.nextInt();
      String op = scanner.next();
      int b = scanner.nextInt();
      int res = 0;

      if (op.equals("?")) {
        break;
      } else if (op.equals("+")) {
        res = a + b;
      } else if (op.equals("-")) {
        res = a - b;
      } else if (op.equals("*")) {
        res = a * b;
      } else if (op.equals("/")) {
        res = a / b;
      }

      System.out.println(res);
    }

    scanner.close();
  }
}