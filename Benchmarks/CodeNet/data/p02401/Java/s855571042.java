import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    String op = null;
    int b = 0;
    while (true) {
      a = sc.nextInt();
      op = sc.next();
      b = sc.nextInt();
      if (op == "?") break;
      switch (op) {
        case "+" :
          System.out.println(a + b); break;
        case "-" :
          System.out.println(a - b); break;
        case "*" :
          System.out.println(a * b); break;
        case "/" :
          System.out.println(a / b); break;
      }
    }
  }
}
