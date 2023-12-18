import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[2][N];
        int max = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (j < i) {
                    count += A[0][j];
                } else if (j == i) {
                    count += A[0][j];
                    count += A[1][j];
                } else {
                    count += A[1][j];
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }

}
