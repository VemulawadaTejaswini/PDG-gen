import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner input=new Scanner(System.in);
        int a,b;
        a=input.nextInt();
        String op=input.next();
        b=input.nextInt();
    flag:while (true) {
            switch (op) {
            case "?":
                    break flag;
            case "+":
                    a+=b;
                    break;
            case "-":
                    a-=b;
                    break;
            case "*":
                    a*=b;
                    break;
            case "/":
                    a/=b;
                    break;
            default:
                    break;
            }
            System.out.println(a);
            
            input=new Scanner(System.in);
            a=input.nextInt();
            op=input.next();
            b=input.nextInt();
        }
    }
}