
import java.util.Scanner;

public class Main {

    private static int n;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        System.out.println(fibonacchi(n));
    }

    private static int fibonacchi(int n) {
        if (n <= 1)
            return 1;

        return fibonacchi(n-1) + fibonacchi(n-2);
    }
}