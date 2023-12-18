import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        long ans = Long.MAX_VALUE;
        for (int p = 1; p <= 100; p++) {
            long strength = 0;
            for (int i = 0; i < n; i++) {
                strength += ((x[i] - p) * (x[i] - p));
            }
            if (strength < ans) {
                ans = strength;
            }
        }

        System.out.println(ans);

    }

}