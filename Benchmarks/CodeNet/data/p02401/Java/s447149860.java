import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        String op = null;
        while(true) {
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            switch (op) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
            }
            if(op.equals("?")) break;
        }
    }
}

