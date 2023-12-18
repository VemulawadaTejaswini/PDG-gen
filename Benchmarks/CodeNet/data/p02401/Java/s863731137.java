import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    while (true) {
      int a = stdin.nextInt();
      String op = stdin.next();
      int b = stdin.nextInt();
      if (op.equals("?")) {
        break;
      } else if (op.equals("+")) {
        System.out.println(a + b);
      } else if (op.equals("-")) {
        System.out.println(a - b);
      } else if (op.equals("*")) {
        System.out.println(a * b);
      } else {
        System.out.println(a / b);
      }
    }
  }

}