import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            String op = scanner.next();
            int b = scanner.nextInt();
            int res = 0;

            switch (op) {
            	case "?":
            		return;

            	case "+":
            		res = a + b;
            		break;

            	case "-":
            		res = a - b;
            		break;

            	case "*":
            		res = a * b;
            		break;

            	case "/":
            		res = a / b;
            		break;
            }
            String s = String.format("%d", res);
            System.out.println(s);
        }

    }
}
