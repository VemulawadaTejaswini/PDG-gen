import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        int b[] = new int[m];
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.valueOf(sc.next());
            }
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i] += a[i][j] * b[j];
            }
            System.out.println(ans[i]);
        }
        
    }
}