import java.io.*;

/**
 * Created by Ayushi on 04/08/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        r.close();
        int ans = 0;
        int i;
        for (i = 1; i*10 <= n; i=i*100) {
            ans += (i*9);
        }
        ans += Math.max(n-i+1, 0);

        System.out.println(ans);
    }
}
