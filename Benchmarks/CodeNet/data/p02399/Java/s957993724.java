import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.printf("%d %d %f\n", a / b, a % b, (double) a / (double) b);
        }
    }
}