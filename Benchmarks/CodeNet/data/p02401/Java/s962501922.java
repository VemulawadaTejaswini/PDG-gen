import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();


            int answer;
            switch (op){
                case "+":
                answer = a + b;
                break;
                case "-":
                answer = a - b;
                break;
                case "*":
                answer = a * b;
                break;
                case "/":
                answer = a / b;
                break;
                default:
                return;

                                                   }
        
           System.out.println(answer);
        
    }
}
