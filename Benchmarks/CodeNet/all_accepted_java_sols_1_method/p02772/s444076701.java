import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        final int[] evens = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter(i -> i % 2 == 0)
                .toArray();

        boolean approved = true;
        for (int i: evens) {
            if (i % 3 != 0 && i % 5 != 0) {
                approved = false;
                break;
            }
        }

        System.out.println(approved ? "APPROVED" : "DENIED");
    }
}