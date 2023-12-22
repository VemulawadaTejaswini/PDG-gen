


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] matrix = new int[h + 2][w + 2];
        for (int i = 1; i < h + 1; i++) {
            char[] arr = sc.next().toCharArray();
            for (int j = 1; j < w + 1; j++) {
                int val;
                if (arr[j - 1] == '.') {
                    val = 0;
                } else {
                    val = -1;
                }
                matrix[i][j] = val;
            }
        }
        for (int i = h + 1; i > 0; i--) {
            for (int j = w + 1; j > 0; j--) {
                if (matrix[i][j] == -1) {
                    if (matrix[i][j - 1] >= 0) {
                        matrix[i][j - 1]++;
                    }
                    if (matrix[i][j + 1] >= 0) {
                        matrix[i][j + 1]++;
                    }
                    if (matrix[i - 1][j - 1] >= 0) {
                        matrix[i - 1][j - 1]++;
                    }
                    if (matrix[i - 1][j] >= 0) {
                        matrix[i - 1][j]++;
                    }
                    if (matrix[i - 1][j + 1] >= 0) {
                        matrix[i - 1][j + 1]++;
                    }
                    if (matrix[i + 1][j - 1] >= 0) {
                        matrix[i + 1][j - 1]++;
                    }
                    if (matrix[i + 1][j] >= 0) {
                        matrix[i + 1][j]++;
                    }
                    if (matrix[i + 1][j + 1] >= 0) {
                        matrix[i + 1][j + 1]++;
                    }
                }
            }
        }
        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (matrix[i][j] == -1) {
                    System.out.print('#');
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
