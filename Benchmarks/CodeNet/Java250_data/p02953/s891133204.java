import java.io.*;

/**
 * Created by Ayushi on 04/08/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        temp = r.readLine().split(" ");
        r.close();
        boolean ans = true;
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(temp[i]);
        }
        s[0]--;
        for (int k = 1; k < n; k++) {
            if (s[k] > s[k-1]) s[k]--;
            if (s[k-1] > s[k]) {
                ans = false;
                break;
            }
        }
        System.out.println(ans ? "Yes":"No");
    }
}
