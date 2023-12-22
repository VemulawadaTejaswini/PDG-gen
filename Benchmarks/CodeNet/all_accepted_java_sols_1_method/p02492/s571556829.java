import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    String op; 

    LOOP:while(true) {
      a = sc.nextInt();
      op = sc.next();
      b = sc.nextInt();

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
        case "?":
          break LOOP;
      }
    }
  }
}