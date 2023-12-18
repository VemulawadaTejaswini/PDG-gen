import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        String op = "";
        int b = 0;
        while(true) {
            a = scanner.nextInt();
            op = scanner.next();
            b = scanner.nextInt();
            if (op.equals("?")) {
                break;
            } else if (op.equals("+")) {
                System.out.println(a+b);
            } else if (op.equals("-")) {
                System.out.println(a-b);
            } else if (op.equals("*")) {
                System.out.println(a*b);
            } else if (op.equals("/")) {
                System.out.println(a/b);
            } 
        }
        }
}

