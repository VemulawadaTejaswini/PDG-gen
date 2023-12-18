import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_data[];
        int n, m, l;
        long mx1[][], mx2[][], mx3[][];
        try {
            input_data = br.readLine().split(" ");
            n = Integer.parseInt(input_data[0]);
            m = Integer.parseInt(input_data[1]);
            l = Integer.parseInt(input_data[2]);

            mx1 = new long[n][m];
            mx2 = new long[m][l];
            mx3 = new long[n][l];

            // TODOdata input
            for (int i = 0; i < n; i++) {
                input_data = br.readLine().split(" ");
                for (int j = 0; j < m; j++)
                    mx1[i][j] = Integer.parseInt(input_data[j]);
            }
            for (int i = 0; i < m; i++) {
                input_data = br.readLine().split(" ");
                for (int j = 0; j < l; j++)
                    mx2[i][j] = Integer.parseInt(input_data[j]);
            }

            // calc
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < l; j++) {
                    for (int k = 0; k < m; k++) {
                        mx3[i][j] += mx1[i][k] * mx2[k][j];
                    }
                }
            }

            // print
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < l; j++) {
                    if (j != 0)
                        System.out.print(" ");
                    System.out.printf("%d", mx3[i][j]);
                }
                System.out.print("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
