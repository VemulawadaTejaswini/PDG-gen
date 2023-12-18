import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, result;
        String op;
        
        while( true ) {
            a = scanner.nextInt();
            op = scanner.next();
            b = scanner.nextInt();
            result = 0;
            
            if( op.equals("?") ) {
                break;
            } else if( op.equals("+") ) {
                result = a + b; 
            } else if( op.equals("-") ) {
                result = a - b;
            } else if( op.equals("*") ) {
                result = a * b;
            } else if( op.equals("/") ) {
                result = a / b;
            } else {
                return;
            }
            System.out.println(result);
        }
    }
}