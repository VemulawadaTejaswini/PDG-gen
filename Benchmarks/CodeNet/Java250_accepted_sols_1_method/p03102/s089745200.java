import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int[] B = new int[m];
        int[][] X = new int[n][m];
        int sum = 0;
        int ans = 0;

        for (int j = 0; j < m; j++) {
            B[j] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                X[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += X[i][j] * B[j];
            }
            if (sum + c > 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}