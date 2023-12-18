import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int l = 0;
            l += x[i + k - 1] - x[i];
            l += Math.min(Math.abs(x[i + k - 1]), Math.abs(x[i]));

            ans = Math.min(ans, l);
        }

        System.out.println(ans);
    }
}