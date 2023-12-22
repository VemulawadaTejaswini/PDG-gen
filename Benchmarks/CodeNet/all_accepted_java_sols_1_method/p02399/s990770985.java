import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        
        long d = a / b;
        long r = a % b;
        double f = a * 1.0 / b;
        
        System.out.printf("%d %d %.5f\n", d, r, f);
    }
}
