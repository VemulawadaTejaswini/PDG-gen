import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    String op = s.next();
    int b = s.nextInt();
    while (!op.equals("?")) {
      switch(op) {
        case "+":
          System.out.println(a + b);
          break;
        case "-":
          System.out.println(a - b);
          break;
        case "*":
          System.out.println(a * b);
          break;
        case "/":
          System.out.println(a / b);
          break;
        default:
          break;
      }
      a = s.nextInt();
      op = s.next();
      b = s.nextInt();
    }
    s.close();
  }
}

