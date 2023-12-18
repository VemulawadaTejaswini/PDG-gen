import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squares = Math.pow(scanner.nextDouble(), 2);
        int white = scanner.nextInt();

        System.out.println((int) squares - white);
    }
}
