import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        try(final Scanner scanner = new Scanner(System.in);) {
            final int first = scanner.nextInt();
            final int second = scanner.nextInt();
            if (first % 2 == 0 || second % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}