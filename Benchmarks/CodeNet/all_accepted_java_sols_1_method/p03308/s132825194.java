import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ans = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int candidate = Math.abs(a[i] - a[j]);
                    if (candidate > ans) {
                        ans = candidate;
                    }
                }
            }

            System.out.println(ans);

        }
    }

}
