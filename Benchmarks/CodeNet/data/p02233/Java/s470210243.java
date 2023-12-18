import java.util.Scanner;

public class FibonacciNumber {
    
    public static int Fibonacci(int n) {
        int result;
        if(n < 2) {
            result = 1;
        } else {
            result = Fibonacci(n-1) + Fibonacci(n-2); 
        }
        return result;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = Fibonacci(n);
        
        System.out.println(result);
    }
    
}