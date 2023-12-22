
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 1 ; i <= N ; i++) {
            int P = scanner.nextInt();

            if (P <= min) {
                count++;
                min = P;
            }
        }

        System.out.println(count);

    }
}
