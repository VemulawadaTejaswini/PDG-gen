import java.io.*;

/**
 * Created by Ayushi on 07/07/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int d = Integer.parseInt(temp[1]);
        int[][] p = new int[n][d];
        for (int i = 0; i < n; i++) {
            temp = r.readLine().split(" ");
            for (int j = 0; j < d; j++) {
                p[i][j] = Integer.parseInt(temp[j]);
            }
        }
        r.close();

        double x, y, z;
        int ans = 0;
        for (int k = 0; k < n; k++) {
            for (int l = k+1; l < n; l++) {
                y = 0;
                for (int m = 0; m < d; m++) {
                    x = p[k][m] - p[l][m];
                    y += x*x;
                }
                z = Math.sqrt(y);
                if (z % 1 == 0) ans++;
            }
        }

        System.out.println(ans);
    }
}
