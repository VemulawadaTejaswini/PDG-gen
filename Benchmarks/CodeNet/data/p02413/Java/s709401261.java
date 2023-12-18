import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int[][] arr = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int now = Integer.parseInt(st[j]);
                arr[i][j] = now;
                arr[i][m] += now;
                arr[n][j] += now;
                arr[n][m] += now;
            }
        }

        for (int i = 0; i <= n; i++) {
            bw.append("" + arr[i][0]);
            for (int j = 1; j <= m; j++) {
                bw.append(" " + arr[i][j]);
            }
            bw.newLine();
        }
        bw.flush();
    }


}
