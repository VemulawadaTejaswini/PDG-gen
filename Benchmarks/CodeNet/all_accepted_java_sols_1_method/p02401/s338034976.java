import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            String b = sc.next();
            int c = sc.nextInt();
            int d = 0;
            if("?".equals(b)) {
                return;
            }
            switch(b) {
            case "+":
                d = a + c;
                break;
            case "-":
                d = a - c;
                break;
            case "*":
                d = a * c;
                break;
            case "/":
                d = a / c;
                break;
            default:
                break;
            }
            System.out.println(d);
        }
    }
}

