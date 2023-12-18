import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] B = new int[n][m];
        int[] C = new int[m];
        int[] D = new int[n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<m; i++) {
            C[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                D[i] += B[i][j] * C[j];
            }
        }
        for (int i=0; i<n; i++) {
            System.out.println(D[i]);
        }


    }
}
