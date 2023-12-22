import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextInt();
        double X = scanner.nextInt();
        int T = scanner.nextInt();

        System.out.println((int) Math.ceil(N/X) * T);
    }
}
