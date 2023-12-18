import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        scanner.close();

        int ac = Math.abs(a - c);
        if (ac <= d) {
            System.out.println("Yes");
            return;
        }
        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        if (ab <= d && bc <= d) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");

        // System.out.println(System.currentTimeMillis() - startTime);
    }
}