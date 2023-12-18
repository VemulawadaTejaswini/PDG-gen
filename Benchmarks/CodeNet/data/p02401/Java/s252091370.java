import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      while (true) {
        int a, b;
        int ans;
        String op;
        try {
          a = Integer.parseInt(sc.next());
          op = temp;
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