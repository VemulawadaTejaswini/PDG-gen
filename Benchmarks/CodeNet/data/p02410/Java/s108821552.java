import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] b1 = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                b1[i][j] = sc.nextInt();
            }
        }
        int[] b2 = new int[m];
        for(int i=0; i<m; i++) {
            b2[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<n; i++) {
            int ans = 0;
            for(int j=0; j<m; j++) {
                ans += b1[i][j] * b2[j];
            }
            System.out.println(ans);
        }
    }
}

