import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = Integer.parseInt(sc.next());
            String op = sc.next();
            int b = Integer.parseInt(sc.next());
            if (op.equals("?"))
                break;
            else if (op.equals("+"))
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
