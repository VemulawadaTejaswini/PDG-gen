import java.io.*;

/**
 * Created by Ayushi on 18/08/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        double tot = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        double[] a = new double[n];
        temp = r.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Double.parseDouble(temp[i]);
            tot += 1/a[i];
        }
        r.close();
        double ans = 1/tot;
        System.out.println(ans);
    }
}
