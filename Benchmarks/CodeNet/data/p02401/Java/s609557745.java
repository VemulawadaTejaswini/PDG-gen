
import java.util.Scanner;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String op = scan.next();
        int b = scan.nextInt();
        int answer = 0;
        while (true) {
            switch (op) {
                case "+":
                    answer = a + b;
                    break;
                case "-":
                    answer = a - b;
                    break;
                case "*":
                    answer = a * b;
                    break;
                case "/":
                    answer = a / b;
                    break;
            }
            if(op == "?") break;
        }
        System.out.println(answer);
    }

}

