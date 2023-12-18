import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String op;
        Boolean bl = true;
        while(bl){
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            switch (op) {
                case "?":
                bl = false;
                break;
                case "+":
                System.out.printf("%d%n",a+b);
                break;
                case "-":
                System.out.printf("%d%n",a-b);
                break;
                case "*":
                System.out.printf("%d%n",a*b);
                break;
                case "/":
                System.out.printf("%d%n",a/b);
                break;
                default:
                break;
            }
        }
        sc.close();
        
    }
}
