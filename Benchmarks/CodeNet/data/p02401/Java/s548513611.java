import java.math.BigDecimal;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        for (;;) {
            a = sc.nextInt();
            String op = sc.next();
            b = sc.nextInt();
            if (op.equals("+"))
                System.out.println(a + b);
            else if (op.equals("-"))
                System.out.println(a - b);
            else if(op.equals("*"))
                System.out.println(a * b);
            else if (op.equals("/"))
                System.out.println(a / b);
            else
                break;
        }
    }
}

