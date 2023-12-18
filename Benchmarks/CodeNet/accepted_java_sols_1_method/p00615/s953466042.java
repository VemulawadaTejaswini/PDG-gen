import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if ((n | m) == 0)
                break;
            int[] w = new int[n + m];
            for (int i = 0; i < n + m; i++)
                w[i] = sc.nextInt();
            Arrays.sort(w);
            int ans = w[0];
            for (int i = 0; i < n + m - 1; i++)
                ans = Math.max(ans, w[i + 1] - w[i]);
            System.out.println(ans);

        }

    }
}