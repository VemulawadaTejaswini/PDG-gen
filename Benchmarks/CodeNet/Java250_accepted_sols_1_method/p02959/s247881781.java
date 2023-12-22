import java.io.*;

/**
 * Created by Ayushi on 27/07/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        temp = r.readLine().split(" ");
        long[] t = new long[n+1];
        for (int i = 0; i < n+1; i++) {
            t[i] = Long.parseLong(temp[i]);
        }
        temp = r.readLine().split(" ");
        long[] s = new long[n];
        for (int j = 0; j < n; j++) {
            s[j] = Long.parseLong(temp[j]);
        }
        r.close();

        long d = 0;
        long x;
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < 2; l++) {
                x = Math.min(t[k + l], s[k]);
                t[k + l] = t[k + l] - x;
                s[k] = s[k] - x;
                d += x;
            }
        }
        System.out.println(d);
    }
}
