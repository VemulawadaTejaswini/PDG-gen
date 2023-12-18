import java.util.Scanner;

public class Main {
    public static int LCS(String s1, String s2) {
        int[][] matrix = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
        }

        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = 0;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] = s1.charAt(i - 1) == s2.charAt(j - 1) ? 1 + matrix[i - 1][j - 1] : Math.max(matrix[i - 1][j], matrix[i][j - 1]);
            }
        }
        return matrix[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int queries = input.nextInt();
        input.nextLine();

        for (int i = 0; i < queries; i++) {
            System.out.println(LCS(input.nextLine(), input.nextLine()));
        }

        input.close();
    }
}
