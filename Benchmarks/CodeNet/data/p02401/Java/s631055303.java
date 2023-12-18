import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            int a = Integer.parseInt(s.next());
            char op = (s.next()).charAt(0);
            int b = Integer.parseInt(s.next());
            switch (op) {
                case '?':
                    return;
                case '+':
                    a += b;
                    break;
                case '-':
                    a -= b;
                    break;
                case '*':
                    a *= b;
                    break;
                case '/':
                    a /= b;
                    break;
            }
            System.out.println(a);
        }
    }
}