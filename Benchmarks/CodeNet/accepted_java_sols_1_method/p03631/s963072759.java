import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        StringBuilder reverse = new StringBuilder(input).reverse();

        System.out.println(input.equals(reverse.toString()) ? "Yes" : "No");
    }
}
