import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextInt(), D = scanner.nextInt();

        int counter = 0;
        for (int i = 1; i <= N; i++) {
            double x = scanner.nextInt(), y = scanner.nextInt();
            double dist = Math.sqrt(x * x + y * y);
            if (dist <= D) {
                counter++;

            }

        }
        System.out.println(counter);
    }
}
