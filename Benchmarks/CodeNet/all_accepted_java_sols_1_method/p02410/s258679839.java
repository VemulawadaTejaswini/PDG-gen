
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
        int a = 0;
        int matrix_a[][] = new int[100][100]; //n*m
        int matrix_b[] = new int[100];   //m*1
        int matrix_ans [] = new int[100]; //n*1
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            java.util.StringTokenizer st = new StringTokenizer(line, " ");
            if (n == 0 && m == 0) {
                n = Integer.parseInt(st.nextToken());
                m = Integer.parseInt(st.nextToken());
            } else if (l != n && l < n) {
                while (st.hasMoreTokens()) {
                    for (int i = 0; i < m; i++) {
                        matrix_a[l][i] = Integer.parseInt(st.nextToken());
                    }
                    l++;
                }
            } else {
                while (st.hasMoreTokens()) {
                    matrix_b[a] = Integer.parseInt(st.nextToken());
                    a++;
                }
            }
            if(l == n && a == m) break;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num1 = matrix_a[i][j];
                int num2 = matrix_b[j];
                int ans = num1 * num2; 
                matrix_ans[i] += ans;
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(matrix_ans[i]);
        }

    }

}

