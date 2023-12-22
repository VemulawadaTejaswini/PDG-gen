import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int a = input.nextInt();
            String op = input.next();
            char c = op.charAt(0);
            int b = input.nextInt();
            if (c == '?') break;
            int ret = 0;
            if (c == '+') ret = a + b;
            else if (c == '-') ret = a - b;
            else if (c == '*') ret = a * b;
            else if (c == '/') ret = a / b;
            System.out.println(ret);
        }
    }
}