import java.lang.Math;
import java.util.Scanner;


public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        long a = 0;
        long b = 0;
        char[] op = {0};

        while (true) {
            a = sc.nextInt();
            String str = sc.next();
            op = str.toCharArray();
            b = sc.nextInt();

            if (op[0] == '?') break;

            switch (op[0]) {
            case '+':
                System.out.println(a+b); break;

            case '-':
                System.out.println(a-b); break;

            case '*':
                System.out.println(a*b); break;

            case '/':
                System.out.println(a/b); break;
            }
        }
    }
}
