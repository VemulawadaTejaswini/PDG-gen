
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int X = scanner.nextInt();

        int min = Math.max(-1000000, X - K + 1);
        int max = Math.min(1000000, X + K - 1);

        for (int i = min ; i <= max ; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
