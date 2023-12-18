
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.printf("%d %d %f\n", (a / b), (a % b), ((double) a / (double) b));
    }
}

