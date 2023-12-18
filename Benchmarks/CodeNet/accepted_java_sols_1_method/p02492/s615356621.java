import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 
        int a = sc.nextInt();
        char op = sc.next().toCharArray()[0];
        int b = sc.nextInt();
        for (; op != '?';) {
            int result;
            switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                result = -1;
            }
            System.out.println(result);
            a = sc.nextInt();
            op = sc.next().toCharArray()[0];
            b = sc.nextInt();
        }
    }
}