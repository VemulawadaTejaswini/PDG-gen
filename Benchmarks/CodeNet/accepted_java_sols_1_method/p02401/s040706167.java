import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            int a = scan.nextInt();
            String op = scan.next();
            int b = scan.nextInt();
            
            int ans = 0;
            if(op.equals("?")) break;

            switch(op) {
                case "+":
                    ans = a + b;
                    break;
                case "-":
                    ans = a - b;
                    break;
                case "*":
                    ans = a * b;
                    break;
                case "/":
                    ans = a / b;
                    break;
            }
            System.out.println(ans);

        }
    }
}