import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a   = sc.nextInt();
            char op = sc.next().charAt(0);
            int b   = sc.nextInt();
            
            if(op == '?'){
                break;
            }
            
            switch(op){
            case '+':
                System.out.println(a + b);
                break;
            
            case '-':
                System.out.println(a - b);
                break;
            
            case '*':
                System.out.println(a * b);
                break;
            
            case '/':
                System.out.println(a / b);
                break;
            }
        }
    }
}
