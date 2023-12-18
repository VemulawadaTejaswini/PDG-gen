import java.util.Scanner;

public class Main{
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            char op = scanner.next().charAt(0);
            int b = scanner.nextInt();
        if(op == '+'){
            System.out.println(a + b);
        }else if(op == '-'){
            System.out.println(a - b);
        }else if(op == '*'){
            System.out.println(a * b);
        }else if(op == '/'){
            System.out.println(a / b);
        }else{
        break;
        }
        }
        scanner.close();
    }
}
