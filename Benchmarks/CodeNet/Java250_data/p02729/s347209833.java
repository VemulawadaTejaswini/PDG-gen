import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int numberOfCombinationsForN = 0;
        for (int i = N - 1; i > 0; i--) {
            numberOfCombinationsForN += i;
        }

        int numberOfCombinationsForM = 0;
        for (int i = M - 1; i > 0; i--) {
            numberOfCombinationsForN += i;
        }
        System.out.println(numberOfCombinationsForN + numberOfCombinationsForM);
    }
}