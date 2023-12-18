
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int n = 0;
        int m = 0;
        int l = 0;

        int matrix_A[][] = new int[100][100];
        int matrix_B[][] = new int[100][100];

        int a = 0;
        int b = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            java.util.StringTokenizer st = new StringTokenizer(line, " ");
            while (st.hasMoreTokens()) {
                if (n == 0 && m == 0 && l == 0) {
                    n = Integer.parseInt(st.nextToken());
                    m = Integer.parseInt(st.nextToken());
                    l = Integer.parseInt(st.nextToken());
                } else {
                    if (a != n) {
                        for (int i = 0; i < m; i++) {
                            matrix_A[a][i] = Integer.parseInt(st.nextToken());
                        }
                        a++;
                    } else {
                        for (int i = 0; i < l; i++) {
                            matrix_B[b][i] = Integer.parseInt(st.nextToken());
                        }
                        b++;
                    }
                }
            }
            if (a == n && b == m) {
                break;
            }
        }

        long matrix_C[][] = new long[n][l];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                for (int k = 0; k < m; k++) {
                    matrix_C[i][j] += (matrix_A[i][k] * matrix_B[k][j]);
                }
            }
        }

        for (int i = 0; i < matrix_C.length; i++) {
            for (int j = 0; j < matrix_C[i].length; j++) {
                System.out.print(matrix_C[i][j]);
                if(!(j == l-1))System.out.print(" ");
            }
            System.out.println("");
        }

    }

}

