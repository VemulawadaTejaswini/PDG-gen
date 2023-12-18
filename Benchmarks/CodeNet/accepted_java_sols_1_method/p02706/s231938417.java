
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int A = 0;
        for (int i = 0 ; i < M ; i++) {
            A += scanner.nextInt();
        }

        System.out.println(Math.max(N - A, -1));
    }
}
