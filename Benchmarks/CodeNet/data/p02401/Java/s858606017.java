import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        String operator;
        int b;
        int answer = 0;
        while (true) {
             a = sc.nextInt();
             operator = sc.next();
             b = sc.nextInt();

            switch (operator) {
                case "+": 
                    answer = a + b;
                    break;
                case "-": 
                    answer = a - b;
                    break;
                case "*": 
                    answer = a * b;
                    break;
                case "%": 
                    answer = a / b;
                    break;
                case "?": 
                    return;
            }   
         System.out.println(answer);
        }
    }
}
