import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String op = scanner.next();
        int b = scanner.nextInt();

        while(!op.equals("?")){
            if(op.equals("+"))
                System.out.println(a + b);
            else if(op.equals("-"))
                System.out.println(a - b);
            else if(op.equals("*"))
                System.out.println(a * b);
            else if(op.equals("/"))
                System.out.println(a / b);

            a = scanner.nextInt();
            op = scanner.next();
            b = scanner.nextInt();
        }
    }
}
