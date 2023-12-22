import java.io.*;

/**
 * Created by Ayushi on 01/09/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] a = r.readLine().split("");
        String[] b = r.readLine().split("");
        r.close();

        int ans = 0;
        if (a[0].equals(b[0])) ans++;
        if (a[1].equals(b[1])) ans++;
        if (a[2].equals(b[2])) ans++;

        System.out.println(ans);
    }
}
