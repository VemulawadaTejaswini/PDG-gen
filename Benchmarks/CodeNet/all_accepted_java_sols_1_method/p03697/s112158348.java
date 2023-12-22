import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ab = scanner.nextInt() + scanner.nextInt();

        System.out.println(ab >= 10 ? "error" : ab);
    }
}