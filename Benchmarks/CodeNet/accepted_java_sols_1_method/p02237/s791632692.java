import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            int u = sc.nextInt() - 1;
            int k = sc.nextInt();
            for(int j = 0; j < k; j++) {
                matrix[u][sc.nextInt() - 1] = 1;
            }
        }

        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                if(j != 0) sb.append(" ");
                sb.append(matrix[i][j]);
            }
            System.out.println(sb);
        }

        sc.close();
    }
}

