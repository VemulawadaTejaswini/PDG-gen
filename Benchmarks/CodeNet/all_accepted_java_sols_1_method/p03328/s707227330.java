import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        int l = b - a;
        int x = l * (1 + l) / 2;
        int result = x - b;

        System.out.println(result);

        // System.out.println(System.currentTimeMillis() - startTime);
    }
}