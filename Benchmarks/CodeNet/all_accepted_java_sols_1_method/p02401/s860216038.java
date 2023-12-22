import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        while(true) {
            int a = num.nextInt();
            char s = num.next().charAt(0);
            int b = num.nextInt();
            int result = 0;

            if(s == '+') {
                result = a + b;
            } else if(s == '-') {
                result = a - b;
            } else if(s == '*') {
                result = a * b;
            } else if(s == '/') {
                result = a / b;
            } else {
                break;
            }
            System.out.println(result);
        }
    }
}
