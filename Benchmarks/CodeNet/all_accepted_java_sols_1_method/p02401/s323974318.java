import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    while(true){
      int a = scan.nextInt();
      String s = scan.next();
      int b = scan.nextInt(); 


      if (s.equals("?")) break;

      switch (s) {
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
        default:
          break;
      }
    }
    scan.close();
  }
}

