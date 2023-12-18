import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        String op = new String();
        int a, b;
        while (input.hasNextInt()) {
            a = input.nextInt();
            op = input.next();
            b = input.nextInt();
            if (a == 0 && op.equals("?") && b == 0) break;
            if (op.equals("+")) System.out.println(a + b);
            else if (op.equals("-")) System.out.println(a - b);
            else if (op.equals("*")) System.out.println(a * b);
            else if (op.equals("/")) System.out.println(a / b);
        }
    }         
}