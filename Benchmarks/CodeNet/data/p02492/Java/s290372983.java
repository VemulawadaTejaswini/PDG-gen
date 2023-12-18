import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      while (true) {
        int a = 0, b = 0;
        int ans = 0;
        String op;
        try {
          a = Integer.parseInt(sc.next());
          op = sc.next();
          b = Integer.parseInt(sc.next());
          if( op.equals("+") ){
            ans = a + b;
          } else if ( op.equals("-") ){
            ans = a - b;
          } else if ( op.equals("*") ){
            ans = a * b;
          } else if ( op.equals("/") ){
            ans = a / b;
          } else if ( op.equals("?") ){
            break;
          } else {
            continue;
          }
          System.out.println(ans);
        } catch ( IllegalStateException e ){
          System.out.println(e);
        }
      }
  return;
  }
}