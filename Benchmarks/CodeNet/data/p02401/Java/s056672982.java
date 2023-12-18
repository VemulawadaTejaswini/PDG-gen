import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true) {
            int a = scn.nextInt();
            String op = scn.next();
            int b = scn.nextInt();
            if(op.equals("+")) {
                System.out.println(a + b);
            } else if(op.equals("-")) {
                System.out.println(a - b);
            } else if(op.equals("*")) {
                System.out.println(a * b);
            } else if(op.equals("/")) {
                System.out.println(a / b);
            } else {
                break;
            }
        }
    }
}