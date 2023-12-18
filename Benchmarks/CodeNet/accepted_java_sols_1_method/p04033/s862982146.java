
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        if (from == 0 || to == 0 || from < 0 && to > 0) {
            System.out.println("Zero");
            return;
        }

        if (from > 0) {
            System.out.println("Positive");
            return;
        }
        int count = to - from;
        if (count % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}