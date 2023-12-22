
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] answer = new int[N + 1];

        for (int i = 1 ; i <= N ; i++) {
            int A = scanner.nextInt();
            answer[A] = i;
        }

        for (int i = 1 ; i <= N ; i++) {
            System.out.printf("%d ", answer[i]);
        }
        System.out.println();
    }
}
