import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        
        while(true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String op = scanner.next();
        if (op.equals("?")) {
            break;
            } else if (op.equals("+")) {
                ans = a + b;
            } else if (op.equals("-")) {
                ans = a - b;
            } else if (op.equals("*")) {
                ans = a * b;
            } else if (op.equals("/")) {
                ans = a / b;
            }
            System.out.println(ans);
        }
    }
}