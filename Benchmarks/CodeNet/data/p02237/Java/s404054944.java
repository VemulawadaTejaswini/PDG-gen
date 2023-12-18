import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(System.out)) {
            int n = Integer.parseInt(in.readLine());

            int[][] G = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().split(" ");
                int u = Integer.parseInt(line[0]) - 1;
                int k = Integer.parseInt(line[1]);
                for (int j = 0; j < k; j++) {
                    int v = Integer.parseInt(line[2 + j]) - 1;
                    G[u][v] = 1;
                }
            }

            for (int i = 0; i < n; i++) {
                out.println(Arrays.stream(G[i]).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

