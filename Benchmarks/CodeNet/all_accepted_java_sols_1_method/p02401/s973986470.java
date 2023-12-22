import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int a = sin.nextInt();
    String op = sin.next();
    int b = sin.nextInt();

    while( !op.equals("?") ) {
      switch(op) {
       case "+" : System.out.println(a + b); break;
       case "-" : System.out.println(a - b); break;
       case "*" : System.out.println(a * b); break;
       case "/" : System.out.println(a / b); break;
       default  : break;
      }

      a  = sin.nextInt();
      op = sin.next();
      b  = sin.nextInt();
    }

    sin.close();
  }
}
