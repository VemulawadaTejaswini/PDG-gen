import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int n = scanner.nextInt();

        scanner.close();

        long base = (long) Math.pow(100, d);

        int count = 0;

        int t = 0;

        while (count < n) {
            t++;
            if (t % 100 != 0) {
                count++;
            }
        }

        System.out.println(t * base);

        // System.out.println(System.currentTimeMillis() - startTime);
    }
}