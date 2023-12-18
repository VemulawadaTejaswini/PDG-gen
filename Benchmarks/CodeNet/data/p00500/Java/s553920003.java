import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][3];
        int[][] used = new int[3][101];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
                used[j][matrix[i][j]]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int point = 0;
            for (int j = 0; j < 3; j++) {
                if (used[j][matrix[i][j]] == 1) {
                    point += matrix[i][j];
                }
            }
            sb.append(point).append("\n");
        }
        System.out.print(sb);
    }
}

