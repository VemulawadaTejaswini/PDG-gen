import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] a = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] / (double) sum >= 1 / (4.0 * M)) {
                count++;
            }
        }
        

        System.out.print(count >= M ? "Yes" : "No");

        scanner.close();
    }
}