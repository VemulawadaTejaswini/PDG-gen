import java.util.Scanner;

class Main {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
        int n = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int j = scanner.nextInt();

        if ( op == '?'){
            break;
        }

        switch (op){
            case '+': System.out.println(n+j); break;
            case '-': System.out.println(n-j); break;
            case '*': System.out.println(n*j); break;
            case '/': System.out.println(n/j); break;
            }
        }
    }
}
