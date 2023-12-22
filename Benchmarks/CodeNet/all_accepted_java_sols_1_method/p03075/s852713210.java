import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();
        final int d = scanner.nextInt();
        final int e = scanner.nextInt();
        final int k = scanner.nextInt();

        final int min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        final int max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);

        System.out.println(max - min <= k ? "Yay!" : ":(");
    }
}
