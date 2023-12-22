import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] count = new int[m];
        int[][] a = new int[n][m];

        int[] k = new int[n];
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
            for (int j = 0; j < k[i]; j++) {
                a[i][j] = sc.nextInt() - 1;
                count[a[i][j]]++;
            }
        }

        int like = 0;
        for (int i = 0; i < m; i++) {
            if (count[i] == n) {
                like++;
            }
        }
        System.out.println(like);
    }

}