
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            if (op.equals("?"))
                break;
            if (op.equals("+"))
                System.out.println(a + b);
            else if (op.equals("-"))
                System.out.println(a - b);
            else if (op.equals("*"))
                System.out.println(a * b);
            else if (op.equals("/"))
                System.out.println(a / b);
        }
    }
}

