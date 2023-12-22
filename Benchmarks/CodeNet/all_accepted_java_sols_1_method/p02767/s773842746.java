import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(sc.next());
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 100; i++) {
            double total = 0;
            for (int j = 0; j < N; j++) {
                total += Math.pow(X[j] - (i+1), 2);
            }
            ans = Math.min(ans, (int)total);
        }

        System.out.println(ans);
    }
}
