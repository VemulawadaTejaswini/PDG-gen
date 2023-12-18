import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] adjMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int u = in.nextInt();
            int k = in.nextInt();
            for (int j = 0; j < k; j++) {
                int neighbor = in.nextInt();
                adjMatrix[u-1][neighbor-1] = 1;
            }
        }
        System.out.print(printMatrix(adjMatrix));
    }

    private static String printMatrix(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int[] i : matrix) {
            StringBuilder line = new StringBuilder();
            for (int j : i) {
                line.append(j).append(" ");
            }
            line.deleteCharAt(line.length()-1);
            line.append("\n");
            sb.append(line);
        }
        return sb.toString();
    }
}

