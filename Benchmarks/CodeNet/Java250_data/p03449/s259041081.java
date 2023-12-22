import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (j <= i)
                    sum += a[0][j];
                if (j >= i)
                    sum += a[1][j];
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
