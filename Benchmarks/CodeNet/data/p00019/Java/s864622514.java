import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } 
        return n;
    }
}