
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        long minResult = 1000005;
        for (int p = 1; p <= 100; ++p) {
            long current = 0;
            for (int i = 0; i < n; ++i) {
                current += (a[i] - p) * (a[i] - p);
            }
            minResult = Math.min(minResult, current);
        }
        System.out.println(minResult);
    }
}
