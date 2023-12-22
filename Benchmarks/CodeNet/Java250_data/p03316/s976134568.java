import java.util.Scanner;

public class Main {
    static int N;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        scanner.close();
    }

    public static void main(String[] args) {
        init();
        // logic
        logic();
    }

    static void logic() {
        int splitter = N;
        int total = 0;

        for (; splitter != 0; splitter /= 10) {
            total += splitter % 10;
        }

        System.out.println((N % total == 0) ? "Yes" : "No");
    }
}
