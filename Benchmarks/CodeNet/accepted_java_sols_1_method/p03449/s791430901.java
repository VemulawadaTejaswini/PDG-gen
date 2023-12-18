import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[2][n];
        int[] sum1 = new int[n];
        int[] sum2 = new int[n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();

                if (i == 0) {
                    sum1[j] = A[i][j];
                    if (j > 0) sum1[j] += sum1[j-1];
                }
                if (i == 1) {
                    sum2[j] = A[i][j];
                    if (j > 0) sum2[j] += sum2[j-1];
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sum1[i] + sum2[n-1];
            if (i > 0) tmp -= sum2[i-1];
            max = Math.max(max , tmp);
        }

        System.out.println(max);
    }
}
