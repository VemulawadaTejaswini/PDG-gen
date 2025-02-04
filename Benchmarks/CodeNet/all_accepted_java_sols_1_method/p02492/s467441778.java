import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Integer a = sc.nextInt();
            String op = sc.next();
            Integer b = sc.nextInt();

            if (Objects.equals(op, "?")) break;

            if (op == null) {
                System.out.printf("");
            } else
                switch (op) {
                    case "+":
                        System.out.printf("%d%n", a + b);
                        break;
                    case "-":
                        System.out.printf("%d%n", a - b);
                        break;
                    case "/":
                        System.out.printf("%d%n", a / b);
                        break;
                    case "*":
                        System.out.printf("%d%n", a * b);
                        break;
                    default:
                        System.out.printf("");
                }
        }
        return;
    }
}