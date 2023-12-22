
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] counts = new int[100 + 1];

        for (int i = 0; i < N; i++) {
            counts[scanner.nextInt()]++;
        }

        int numUniqueNumbers = 0;
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                numUniqueNumbers++;
            }
        }

        System.out.println(numUniqueNumbers);
    }
}
