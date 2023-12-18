import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();
        final int q = scanner.nextInt();
        scanner.nextLine();

        final int[] a = new int[q];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scanner.nextLine());
        }

        final int[] okCounts = new int[n];
        for (int i = 0; i < a.length; i++) {
            okCounts[a[i] - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (okCounts[i] - q + k > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}