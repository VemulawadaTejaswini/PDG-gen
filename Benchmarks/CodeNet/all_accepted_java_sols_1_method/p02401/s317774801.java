import java.util.Scanner;

public class Main {

  private static int a, b;
  private static String op;

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    while (true) {
      a = stdIn.nextInt();
      op = stdIn.next();
      b = stdIn.nextInt();

      if (op.equals("?")) {
        break;
      }

      switch (op) {
        case "+":
          System.out.println(a+b);
          break;
        case "-":
          System.out.println(a-b);
          break;
        case "*":
          System.out.println(a*b);
          break;
        case "/":
          System.out.println(a/b);
          break;
      }
    }
  }
}