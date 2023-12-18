import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int a = scan.nextInt();
            String operator = scan.next();
            int b = scan.nextInt();
            int ans = 0;
            if (operator.equals("?")) {
                break;
            }

            switch (operator) {
                case "+":
                    ans = a + b;
                    break;
                case "-":
                    ans = a - b;
                    break;
                case "*":
                    ans = a * b;
                    break;
                case "/":
                    ans = a / b;
                    break;
            }
            System.out.println(ans);
        }
    }
}