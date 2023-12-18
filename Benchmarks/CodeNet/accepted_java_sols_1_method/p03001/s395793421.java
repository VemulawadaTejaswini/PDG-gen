
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long W = scanner.nextLong();
        long H = scanner.nextLong();
        long x = scanner.nextLong();
        long y = scanner.nextLong();

        double area = W * H / 2.0;
        int flag = (x + x == W && y + y == H) ? 1 : 0;

        System.out.printf("%f %d%n", area, flag);
    }
}
