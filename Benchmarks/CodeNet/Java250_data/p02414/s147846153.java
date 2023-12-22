import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int l = Integer.parseInt(input[2]);
        int[][] A = new int[n][m];
        int[][] B = new int[m][l];

        int i, j;
        for (i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            for (j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(input[j]);
            }
        }
        for (i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            for (j = 0; j < l; j++) {
                B[i][j] = Integer.parseInt(input[j]);
            }
        }

        int k;
        long sum;
        for (i = 0; i < n; i++) {
            for (j = 0; j < l; j++) {
                sum = 0;
                for (k = 0; k < m; k++) {
                    sum += A[i][k] * B[k][j];
                }
                System.out.print(sum + ((j == l - 1) ? "" : " "));
            }
            System.out.println();
        }
    }
}