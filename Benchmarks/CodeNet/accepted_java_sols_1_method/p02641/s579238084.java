import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int x = sc.nextInt();
        final int n = sc.nextInt();

        final int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int diff = Integer.MAX_VALUE;
        int ans = 0;
        LOOP: for (int i = -1; i <= 101; i++) {
            for (int j = 0; j < n; j++) {
                if (p[j] == i) {
                    continue LOOP;
                }
            }
            if (Math.abs(x-i) < diff) {
                diff = Math.abs(x-i);
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
