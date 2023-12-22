import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if (Math.min(p[i-1], p[i+1]) < p[i] && p[i] < Math.max(p[i-1], p[i+1])) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
