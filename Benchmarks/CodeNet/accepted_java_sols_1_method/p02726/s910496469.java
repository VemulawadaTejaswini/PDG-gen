import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = i; j < N; j++) {
                matrix[i][j] = j - i;
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = i; j < N; j++) {
                int val = Math.abs(X - (i + 1)) + Math.abs(Y - (j + 1)) + 1;
                if (matrix[i][j] > val){
                    matrix[i][j] = val;
                }
            }
        }
        int[] numVals = new int[N];
        for (int i = 0; i < N; i++){
            for (int j = i; j < N; j++) {
                numVals[matrix[i][j]]++;
            }
        }
        for (int n = 1; n < N; n++){
            System.out.println(numVals[n]);
        }
    }
}
