import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
       
        int finAns=0;
 
        end: {
            while(true) {
                int a = stdin.nextInt();
                String op = stdin.next();
                int b = stdin.nextInt();
 
                switch (op) {
                    case "+": 
                    finAns = a + b;
                    break;
                   
                    case "-": 
                    finAns = a - b; 
                    break;
                   
                    case "*": finAns = a * b; 
                    break;
                   
                    case "/": finAns = a / b; 
                    break;
                   
                    case "?": 
                    break end;
                }
 
                System.out.println(finAns);
            }
        }
    }
}