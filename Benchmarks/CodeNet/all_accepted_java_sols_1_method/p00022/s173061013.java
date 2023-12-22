
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (0 != n) {

            int a[] = new int[n];
            int an = 0;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int best = -99999999;
            for (int l = 0; l < n; l++) {
                int sum = 0;
                for (int r = l; r < n; r++) {
                    sum = sum + a[r];
                    if (best < sum) {
                        best = sum;
                    }
                }
            }
            System.out.println(best);
            n = scanner.nextInt();
        }

    }
}

