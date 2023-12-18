import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a,b;
        char op;
        Scanner sc = new Scanner(System.in);
        while(true) {
            a = sc.nextInt();
            op = sc.next().charAt(0);
            b = sc.nextInt();
            switch (op) {
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
                case '?':
                    break;
            }
        }
    }
}