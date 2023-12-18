
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

        int r = 0;
        int c = 0;

        int l = 0;
        int matrix[][] = new int[100][100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            java.util.StringTokenizer st = new StringTokenizer(line, " ");
            while (st.hasMoreTokens()) {
                if (r == 0 && c == 0) {
                    r = Integer.parseInt(st.nextToken());
                    c = Integer.parseInt(st.nextToken());
                } else {
                    for (int i = 0; i < c; i++) {
                        matrix[l][i] = Integer.parseInt(st.nextToken());
                    }
                    l++;
                }
            }
            if (l == r) {
                break;

            }

        }
        int sum = 0;
        int ans_matrix[][] = new int[r + 1][c + 1];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans_matrix[i][j] = matrix[i][j];
                ans_matrix[i][c] += matrix[i][j];
            }
            sum += ans_matrix[i][c];
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans_matrix[r][j] += matrix[i][j];
            }
        }
        ans_matrix[r][c] = sum;

        for (int i = 0; i < ans_matrix.length; i++) {
            for (int j = 0; j < ans_matrix[i].length; j++) {
                System.out.print(ans_matrix[i][j]);
                if (!(j == c)) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

