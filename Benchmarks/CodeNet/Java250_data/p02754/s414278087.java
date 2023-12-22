import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long result1 = n / (a + b) * a;
        long result2 = Math.min(n % (a + b), a);
        System.out.println(result1 + result2);
    }
}