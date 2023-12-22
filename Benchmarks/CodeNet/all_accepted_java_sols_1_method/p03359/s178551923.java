import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a <= b) {
            System.out.println(a);
        } else {
            System.out.println(a - 1);
        }

        // System.out.println(System.currentTimeMillis() - startTime);
    }
}