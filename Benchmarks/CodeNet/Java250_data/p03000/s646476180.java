
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] L = new int[N + 1];

        for (int i = 1 ; i <= N ; i++) {
            L[i] = scanner.nextInt();
        }

        int count = 1;
        int d = 0;

        for (int i = 1 ; i <= N ; i++) {
            d += L[i];
            if (d > X) {
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}
