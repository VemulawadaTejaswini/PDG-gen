
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long H = scanner.nextLong();
        int N = scanner.nextInt();

        long total = 0L;

        for (int i = 0 ; i < N ; i++) {
            total += scanner.nextInt();
        }

        if (H <= total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
