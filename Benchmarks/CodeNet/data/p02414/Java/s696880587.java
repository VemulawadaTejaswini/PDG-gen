import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input;

            input = in.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int l = Integer.parseInt(input[2]);

            int[][] A = new int[n][m];
            int[][] B = new int[m][l];

            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    A[i][j] = Integer.parseInt(line[j]);
                }
            }
            for (int i = 0; i < m; i++) {
                String[] line = in.readLine().split(" ");
                for (int j = 0; j < l; j++) {
                    B[i][j] = Integer.parseInt(line[j]);
                }
            }

            long[][] C = new long[n][l];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < l; j++) {
                    // C[i][j]を求める
                    long cij = 0;
                    for (int k = 0; k < m; k++) {
                        cij += A[i][k] * B[k][j];
                    }
                    C[i][j] = cij;
                }
            }

//            StringBuilder out = new StringBuilder();
            for (int i = 0; i < n; i++) {
                List<String> sarr = Arrays.stream(C[i]).mapToObj(String::valueOf).collect(Collectors.toList());
//                out.append(String.join(" ", sarr));
//                out.append("\n");
                System.out.println(String.join(" ", sarr));
            }
//            System.out.print(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}

