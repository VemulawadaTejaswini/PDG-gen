import java.util.Scanner;

/**
 * Created by khrom on 2017/06/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.printf("%d %d %.5f", (int) Math.floor(a / b), (int) (a % b), a / b);
    }
}