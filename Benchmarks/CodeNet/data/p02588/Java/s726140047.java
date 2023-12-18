import java.io.*;

/**
 * Created by Ayushi on 09 Aug 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] a = new double[n];
        for (int k = 0; k < n; k++){
            a[k] = Double.parseDouble(br.readLine());
        }
        br.close();

        double y;
        int ans = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                y = a[i]*a[j];
                if (y == Math.floor(y)) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
