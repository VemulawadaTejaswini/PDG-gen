import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];

        for (int i = 0; i < n; i++ ) {
            for(int j = 0;j < d; j++ ) {
                x[i][j] = sc.nextInt();
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++ ) {
            for (int j = i; j < n; j++ ) {
                double temp = 0;
                for (int k = 0; k < d; k++ ) {
                    temp += Math.pow(x[i][k] - x[j][k], 2);
                }
                if (Math.sqrt(temp) == (int)Math.sqrt(temp) && temp != 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }
}