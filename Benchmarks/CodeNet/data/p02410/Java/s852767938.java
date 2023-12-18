import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = in.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int[][] A = new int[n][m];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                String[] aij = in.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    A[i][j] = Integer.parseInt(aij[j]);
                }
            }

            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(in.readLine());
            }

            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                int[] a = A[i];
                int sum = 0;
                for (int j = 0; j < m; j++) {
                    sum = sum + a[j] * b[j];
                }
                c[i] = sum;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(c[i]);
                sb.append("\n");
            }
            System.out.print(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
