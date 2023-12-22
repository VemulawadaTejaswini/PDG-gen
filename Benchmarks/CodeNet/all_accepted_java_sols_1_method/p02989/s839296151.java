import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

        final String[] sp = scanner.nextLine().split(" ");
        final int[] scores = Arrays.stream(sp).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(scores);

        final int min = scores[scores.length / 2 - 1];
        final int max = scores[scores.length / 2];

        System.out.println(max - min);
    }
}